package com.kitri.haksa.data;

import java.sql.*;

public class test {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	test() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ҷ����� ����");
			//����
			String url = "jdbc:oracle:thin:@192.168.14.65:1521:orcl";
			conn = DriverManager.getConnection(url, "kitri", "kitri");
			System.out.println("��� ���� ����");
			//�����غ�
			String sql = "select name,age,key,value FROM school ";
			stmt = conn.prepareStatement(sql);
			//����
			stmt.executeQuery();
			rs = stmt.executeQuery();
			//�����ͺ��̽� ��ȸ �� ��ȸ��� ó��
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				int key = rs.getInt("key");
				String value = rs.getString("value");
				System.out.println("�̸� : "+name+" ���� : "+age+" Ű : "+key +" ��� : "+value);
			}
			
			

		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("��� ���� ����");
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
		}//finally ��
	}//������ ��

	public static void main(String[] args) {
		new test();
	}
}//dao ���� �����ͺ��̽� �Է� ������ ���Ѵ�.
//dto ���ϳ� ����. new dto�� �ϸ� ���⿡ �� ������. �࿡ ���� ����
