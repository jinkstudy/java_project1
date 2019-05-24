package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.OrderDao;

public class OrderModel implements OrderDao{
	//1. 드라이버로딩
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.117:1521:orcl";
	String user = "jink";
	String pass = "1234";
	
	//2. 연결객체 얻어오기
	Connection con = null;
	
	public OrderModel() throws Exception {
		
		//1. 드라이버를 메모리 로딩
		Class.forName(driver);
		
		public void insertOrder1(Order or) throws Exception {
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				//2. Connection 연결객체 얻어오기
				con = DriverManager.getConnection(url,user,pass);
				
				//3. sql 문장 만들기
				String sql = "SELECT * FROM Customer WHERE Cmile=?";
			
				// 4. sql 전송객체 (PreparedStatement)
				ps = con.prepareStatement(sql);
				
				ps.setString(1, or.getMiles());
				
				//5.sql 전송
				ps.executeQuery();
			}finally {
				//. 닫기
				ps.close();
				con.close();
			}
	}
		
		public void insertOrder2(Order or) throws Exception {
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				//2. Connection 연결객체 얻어오기
				con = DriverManager.getConnection(url,user,pass);
				
				//3. sql 문장 만들기
				String sql = "SELECT * FROM Coupon WHERE Cdiscount=?";
			
				// 4. sql 전송객체 (PreparedStatement)
				ps = con.prepareStatement(sql);
				
				ps.setString(1, or.getMiles());
				
				//5.sql 전송
				ps.executeQuery();
			}finally {
				//. 닫기
				ps.close();
				con.close();
			}
	}
		
		public void orderHwakin(Order or, int count) throws Exception {
			Connection con = null;
			PreparedStatement ps = null;
		}
}
