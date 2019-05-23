package main1;
import java.awt.*;
import javax.swing.*;

import view.CustomerView;
import view.OrderView;
import view.StockView;

//import  view.orderView;
//import  view.customerView;
//import  view.stockView;

public class BanaCafe  extends JFrame {

	
	
		OrderView order;
		CustomerView customer;
		StockView stock;

		public BanaCafe(){
			//각각의 화면을 관리하는 클래스 객체 생성
				order = new OrderView();
				customer = new CustomerView();
				stock = new StockView();

				JTabbedPane  pane = new JTabbedPane();
				pane.addTab("주문화면", order );
				pane.addTab("고객정보", customer);
				pane.addTab("재고관리", stock );
				//pane.addTab("통계", rent );

				pane.setSelectedIndex(2);  //첫 화면

				// 화면크기지정
				add("Center", pane );
				setSize(800,600);
				setVisible( true );

				setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	
		}
		public static void main(String[] args) 
		{
				new BanaCafe();
		}
	}
