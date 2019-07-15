package com.sibal.haksa.service.db;

import java.sql.*;
import java.util.ArrayList;

import com.sibal.haksa.data.db.HaksaDto;

public class HaksaDao {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection con;
	private Statement stm;
	private ResultSet rs;
	private static HaksaDao obj;


	public static HaksaDao sharedInstance() {
		if (obj == null) {
			obj = new HaksaDao();
		}
		return obj;
	}

	private Connection getCon() {
			try {
				return con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kitri", "kitri");
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
			return con;
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stm != null) {
				stm.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void register(HaksaDto haksa) {
		if (this.getCon() != null) {
			String sql = "insert into school values(?,?,?,?)";
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				pstm.setString(1, haksa.getName());
				pstm.setInt(2, haksa.getAge());
				pstm.setInt(3, haksa.getKey());
				pstm.setString(4, haksa.getValue());

				int r = pstm.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public HaksaDto findName(String name) {
		HaksaDto haksadto = null;
		if (this.getCon() != null) {
			String sql = "select s.name,s.age,s.key,j.key_name,s.value from school s , job j"
					+ " where s.key = j.key and s.name = ?";
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				pstm.setString(1, name);
				rs = pstm.executeQuery();
				while (rs.next()) {
					haksadto = new HaksaDto(rs.getInt("age"), rs.getString("name"), rs.getInt("key"),
							rs.getString("keyname"), rs.getString("value"));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return haksadto;
	}

	public int delete(String name) {
		int r = 0;
		String sql = "delete from school where name = ?";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, name);

			r = pstm.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return r;

	}

	public ArrayList<HaksaDto> selectAllList() {
		ArrayList<HaksaDto> list = new ArrayList<HaksaDto>();
		try {
			if(getCon() !=null) {
				String sql = "select s.name,s.age,j.KEY_NAME,s.VALUE,s.key from school s,job j where s.key = j.key";
				PreparedStatement pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					list.add(new HaksaDto(rs.getInt("age"), rs.getString("name"),
							rs.getInt("key") , rs.getString("key_name"), rs.getString("value")));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
