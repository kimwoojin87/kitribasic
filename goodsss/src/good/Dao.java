package good;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("클래스 로드 성공!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("클래스 로드 실패 : "+e.getMessage());
		}
	}
	
	//Singleton 클래스로 만들기 위해서 생성자를 private 선언
	private Dao() {
		
	}
	private static Dao obj;
	
	public static Dao sharedInstance() {
		if(obj == null) {
			obj =new Dao();
		}
		return obj;
	}
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	private boolean connect() {
		boolean result = false;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.65:1521:orcl", "kitri", "kitri");
			result = true;
		} catch (SQLException e) {
			System.out.println("연결 실패 : "+e.getMessage());
		}
		return result;
	}
	
	private void close() {
		try {
		if(rs != null)
				rs.close();
		if(stmt != null)
			stmt.close();
		if(con != null)
			con.close();
		} catch (SQLException e) {
			System.out.println("해제 실패 : "+e.getMessage());
		}
	}
	
	public List<Good> getlist(){
		List<Good> list = null;
		String sql = "select * from goods order by code desc";
		if(connect()) {
			try {
				stmt = con.createStatement();
				if(stmt != null) {
					rs = stmt.executeQuery(sql);
					list = new ArrayList<Good>();
					while(rs.next()) {
						Good goods = new Good();
						goods.setCode(rs.getString("code"));
						goods.setName(rs.getString("name"));
						goods.setManufacture(rs.getString("Manufacture"));
						goods.setPrice(rs.getInt("Price"));
						goods.setMakingdate(rs.getDate("Makingdate"));
						list.add(goods);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else 
			System.out.println("연결 실패 ");
		return list;
	}
	
	public boolean InsertGood(Good good) {
		boolean result = false;
		if(this.connect()) {
			try {
			String sql = "insert into goods values (?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, good.getCode());
				pstmt.setString(2, good.getName());
				pstmt.setString(3, good.getManufacture());
				pstmt.setInt(4, good.getPrice());
				pstmt.setDate(5, good.getMakingdate());
				
				int r = pstmt.executeUpdate();
				
				if(r>0) {
					result = true;
				}
				pstmt.close();
				this.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("데이터베이스 연결에 실패");
			System.exit(0);
		}
		return result;
	}
	
	public boolean DeleteGood(Good good) {
		boolean result = false;
		if(this.connect()) {
			String sql = "delete from goods where code=cast(? as char(5))";
			try {
//				
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, good.getCode());
				int r = pstmt.executeUpdate();
				
				if(r>0) {
					result = true;
				}
				System.out.println(good.getCode());
				pstmt.close();
				this.close();
			} catch (SQLException e) {
				System.out.println("A");
				e.printStackTrace();
			}
		}else {
			System.out.println("데이터베이스 연결 실패");
			System.exit(0);
		}
		return result;
	}
	
	public boolean modifyGood(Good good, String code) {
		boolean result = false;
		if(this.connect()) {
			String sql = "update goods set code =cast(? as char(5)) , name = ? , manufacture = ? , price = ? ,makingdate = ? where code = cast(? as char(5)) ";
			PreparedStatement pstmt;
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, good.getCode());
				pstmt.setString(2, good.getName());
				pstmt.setString(3, good.getManufacture());
				pstmt.setInt(4, good.getPrice());
				pstmt.setDate(5, good.getMakingdate());
				pstmt.setString(6, code);
				int r = pstmt.executeUpdate();
				if(r>0) {
					result = true;
				}
				System.out.println(good.getCode());
				pstmt.close();
				this.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}else {
			System.out.println("데이터베이스 연결 실패");
			System.exit(0);
		}
		return result;
	}
}