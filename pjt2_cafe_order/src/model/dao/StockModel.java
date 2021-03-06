package model.dao;

import java.sql.*;
import java.util.ArrayList;

import model.StockDao;
import model.vo.Stock;


public class StockModel implements StockDao {
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



	@Override
	public ArrayList<Stock> getStOrderCnt(String sOrderno) throws Exception {
		
		ArrayList<Stock> stOrderCnt = new ArrayList<Stock>();
		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;

		// 2. ���ᰴü
		con = DriverManager.getConnection(url, user ,pass);
		//3. sql
		String sql = "SELECT sorderno,menuno, scount FROM stock where sorderno = ?";
		
		//4.���۰�ü
		st = con.prepareStatement(sql);
		st.setString(1,sOrderno);
		
		//5. ����
		rs = st.executeQuery();

		// 6. ���ó��
		
		
		while(rs.next()) {
			Stock vo = new Stock();
			vo.setMenuNo(rs.getInt("menuno"));
			vo.setsCount(rs.getInt("scount"));
			stOrderCnt.add(vo);
			System.out.println(vo.toString());
		}
		System.out.println(stOrderCnt.toString());
	
		//7. �ݱ�
		rs.close();
		st.close();
		con.close();
		
		
				
				
		return stOrderCnt;
	}



	@Override
	public void insertSt(ArrayList<Stock> list) throws Exception {

		// 2. Connection ���ᰴü ������
				Connection con = DriverManager.getConnection(url, user ,pass);
				// 3. sql ���� �����
				String sql = "INSERT INTO stock(sno,sorderno,stime,menuno,scount) "
						+ " VALUES(sq_stock_sno.nextval,?,?,?,?) ";
//				String sql = "INSERT INTO stock(sno,menuno,scount) "
//						+ " VALUES(sq_stock_sno.nextval,?,1) ";
				//System.out.println(sql);
				// 4. sql ���۰�ü (PreparedStatement)	
				PreparedStatement st = con.prepareStatement(sql);
				
				//System.out.println(">"+vo[0]);

				for(Stock vo : list) {
					//System.out.println(vo[i].getsOrderNo());
					st.setString(1,vo.getsOrderNo());
					st.setString(2, vo.getsTime());
					st.setInt(3, vo.getMenuNo());
					st.setInt(4, vo.getsCount());
					 st.executeUpdate(); 
				}



				//6. �ݱ�
				st.close();
				con.close();

				
		
		
		
	}



	@Override
	public void updateSt(Stock vo) throws Exception {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteSt(String sOrderNo) throws Exception {
		
		// 2. Connection ���ᰴü ������
		Connection con = DriverManager.getConnection(url, user ,pass);
		// 3. sql ���� �����
		String sql = "DELETE FROM stock WHERE sOrderNo = ?";
		
		// 4. sql ���۰�ü (PreparedStatement)	
		PreparedStatement st = con.prepareStatement(sql);
	
	    st.setString(1,sOrderNo);
	    
	    //5.����
		st.executeUpdate(); 
		


		//6. �ݱ�
		st.close();
		con.close();

	
		
	}



	@Override
	public ArrayList getSearchList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
