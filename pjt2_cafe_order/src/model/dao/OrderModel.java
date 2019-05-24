package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.OrderDao;

public class OrderModel implements OrderDao{
	//1. ����̹��ε�
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.117:1521:orcl";
	String user = "jink";
	String pass = "1234";
	
	//2. ���ᰴü ������
	Connection con = null;
	
	public OrderModel() throws Exception {
		
		//1. ����̹��� �޸� �ε�
		Class.forName(driver);
		
		public void insertOrder1(Order or) throws Exception {
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				//2. Connection ���ᰴü ������
				con = DriverManager.getConnection(url,user,pass);
				
				//3. sql ���� �����
				String sql = "SELECT * FROM Customer WHERE Cmile=?";
			
				// 4. sql ���۰�ü (PreparedStatement)
				ps = con.prepareStatement(sql);
				
				ps.setString(1, or.getMiles());
				
				//5.sql ����
				ps.executeQuery();
			}finally {
				//. �ݱ�
				ps.close();
				con.close();
			}
	}
		
		public void insertOrder2(Order or) throws Exception {
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				//2. Connection ���ᰴü ������
				con = DriverManager.getConnection(url,user,pass);
				
				//3. sql ���� �����
				String sql = "SELECT * FROM Coupon WHERE Cdiscount=?";
			
				// 4. sql ���۰�ü (PreparedStatement)
				ps = con.prepareStatement(sql);
				
				ps.setString(1, or.getMiles());
				
				//5.sql ����
				ps.executeQuery();
			}finally {
				//. �ݱ�
				ps.close();
				con.close();
			}
	}
		
		public void orderHwakin(Order or, int count) throws Exception {
			Connection con = null;
			PreparedStatement ps = null;
		}
}
