package bookservice;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import bookcont.BookDto;

public class BookDao {

	private Connection con;
	private ResultSet rs;
	private Statement stmt;
	private static BookDao obj;

	public static BookDao sharedInstance() {
		if (obj == null) {
			return obj = new BookDao();
		}
		return obj;
	}

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Connection getcon() {
		try {
			return con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kitri", "kitri");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private void close() {
		try {
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	데이터베이스에서 리스트를 뽑아오자.
//	public ArrayList<BookDto> BookAllList(){
//		ArrayList<BookDto> list = new ArrayList<BookDto>();
//		if(getcon() != null) {
//			String sql = "select isbn,name,writer,image_path,genre,publisher,position,publish_date from book";
//			try {
//				PreparedStatement pstm = con.prepareStatement(sql);
//				rs = pstm.executeQuery();
//				while(rs.next()) {
//					list.add(new BookDto(rs.getString("isbn"), rs.getString("name"), rs.getString("writer"),
//							rs.getString("image_path"),rs.getString("genre"), rs.getString("publisher"),
//							rs.getString("position"), rs.getDate("publish_date")));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return list;
//	}//현재까지의 방법인 어레이리스트 이용 한것.
	
//	두개 짬뽕 ㄱ
	
//	벡터를 이용한 방법 //이미지 경로를 제외한 데이터읽어오기.
	public Vector getBookList() {
		Vector data = new Vector(); // 2.벡터에 벡터추가라는데 
		if(getcon() != null) {
			String sql = "select isbn,name,writer,genre,publisher,position,publish_date from book order by isbn";
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				rs = pstm.executeQuery();
				while(rs.next()) {
					String isbn = rs.getString("isbn");
					String name = rs.getString("name");
					String writer = rs.getString("writer");
					String genre = rs.getString("genre");
					String pub = rs.getString("publisher");
					String position = rs.getString("position");
					String pubDate = rs.getString("publish_date");
					
					Vector row = new Vector();
					row.add(isbn);
					row.add(name);
					row.add(writer);
					row.add(genre);
					row.add(pub);
					row.add(position);
					row.add(pubDate);
					
					data.add(row);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
	
//	public Vector getMemberList(){
//		   
//	    Vector data = new Vector();  //Jtable에 값을 쉽게 넣는 방법 1. 2차원배열   2. Vector 에 vector추가
//	   
//	       
//	    Connection con = null;       //연결
//	    PreparedStatement ps = null; //명령
//	    ResultSet rs = null;         //결과
//	   
//	    try{
//	       
//	        con = getConn();
//	        String sql = "select * from tb_member order by name asc";
//	        ps = con.prepareStatement(sql);
//	        rs = ps.executeQuery();
//	       
//	        while(rs.next()){
//	            String id = rs.getString("id");
//	            String pwd = rs.getString("pwd");
//	            String name = rs.getString("name");
//	            String tel = rs.getString("tel");
//	            String addr = rs.getString("addr");
//	            String birth = rs.getString("birth");
//	            String gender = rs.getString("gender");
//	            String job = rs.getString("job");
//	            String email = rs.getString("email");
//	            String intro = rs.getString("intro");
//	           
//	            Vector row = new Vector();
//	            row.add(id);
//	            row.add(pwd);
//	            row.add(name);
//	            row.add(tel);
//	            row.add(addr);
//	            row.add(birth);
//	            row.add(job);
//	            row.add(gender);
//	            row.add(email);
//	            row.add(intro);
//	           
//	            data.add(row);             
//	        }//while
//	    }catch(Exception e){
//	        e.printStackTrace();
//	    }
//	    return data;
//	}//getMemberList()
	
}
