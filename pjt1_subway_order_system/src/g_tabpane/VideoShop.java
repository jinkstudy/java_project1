package g_tabpane;

import java.awt.*;
import javax.swing.*;
public class VideoShop extends JFrame 
{
	CustomerAdmin	customer;
	VideoAdmin			video;
	RentAdmin			rent;

	public VideoShop(){
		//각각의 화면을 관리하는 클래스 객체 생성
			customer = new CustomerAdmin();
			video		= new VideoAdmin();
			rent			= new RentAdmin();

			JTabbedPane  pane = new JTabbedPane();
			pane.addTab("고객관리", customer );
			pane.addTab("비디오관리", video);
			pane.addTab("대여관리", rent );

			pane.setSelectedIndex(2);

			add("Center", pane );
			setSize(300,200);
			setVisible( true );

			setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	
	}
	public static void main(String[] args) 
	{
			new VideoShop();
	}
}
