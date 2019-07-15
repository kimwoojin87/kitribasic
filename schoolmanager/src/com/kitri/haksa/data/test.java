package com.kitri.haksa.data;

import java.sql.*;

public class test {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	test() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 불러오기 성공");
			//연결
			String url = "jdbc:oracle:thin:@192.168.14.65:1521:orcl";
			conn = DriverManager.getConnection(url, "kitri", "kitri");
			System.out.println("디비 접속 성공");
			//실행준비
			String sql = "select name,age,key,value FROM school ";
			stmt = conn.prepareStatement(sql);
			//실행
			stmt.executeQuery();
			rs = stmt.executeQuery();
			//데이터베이스 조회 및 조회결과 처리
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				int key = rs.getInt("key");
				String value = rs.getString("value");
				System.out.println("이름 : "+name+" 나이 : "+age+" 키 : "+key +" 밸류 : "+value);
			}
			
			

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("디비 접속 실패");
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}//finally 끝
	}//생성자 끝

	public static void main(String[] args) {
		new test();
	}
}//dao 에서 데이터베이스 입력 수정을 다한다.
//dto 행하나 값임. new dto를 하면 여기에 다 들어가있음. 행에 담을 정보
