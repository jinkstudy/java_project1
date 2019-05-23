package model.dao;

import java.sql.*;


public class StockModel {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.0.117:1521:orcl";
	String user = "jink";
	String pass = "1234";

	public StockModel() throws Exception {
		Class.forName(driver);
	}



	public String[] getMname() throws Exception {
		String[] mname=new String[9] ;

		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;

		// 2. ���ᰴü
		con = DriverManager.getConnection(url, user ,pass);
		//3. sql
		String sql = "SELECT  menuname FROM menu order by menuno";
		//4.���۰�ü
		st = con.prepareStatement(sql);
		//5. ����
		rs = st.executeQuery();

		// 6. ���ó��
		for (int i = 0; rs.next(); i++) {
			mname[i] = rs.getString("menuname");
			//System.out.println(mname[i]);
		}
		
		//7. �ݱ�
		rs.close();
		st.close();
		con.close();
		

		return mname;
	}
	

}