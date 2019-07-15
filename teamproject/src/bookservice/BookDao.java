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
	
//	�����ͺ��̽����� ����Ʈ�� �̾ƿ���.
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
//	}//��������� ����� ��̸���Ʈ �̿� �Ѱ�.
	
//	�ΰ� «�� ��
	
//	���͸� �̿��� ��� //�̹��� ��θ� ������ �������о����.
	public Vector getBookList() {
		Vector data = new Vector(); // 2.���Ϳ� �����߰���µ� 
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
//	    Vector data = new Vector();  //Jtable�� ���� ���� �ִ� ��� 1. 2�����迭   2. Vector �� vector�߰�
//	   
//	       
//	    Connection con = null;       //����
//	    PreparedStatement ps = null; //���
//	    ResultSet rs = null;         //���
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
