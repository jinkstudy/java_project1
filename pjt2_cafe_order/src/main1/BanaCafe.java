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

		//������ ȭ���� �����ϴ� Ŭ���� ��ü ����
		order = new OrderView();
		customer = new CustomerView();
		stock = new StockView();
		try {
			// 1. �ڹ� ���� �����
			//UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			// 2. quaqua.jar : Quaqua Look and Feel

//			   UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
//			   JFrame.setDefaultLookAndFeelDecorated(true);
			// 3. liquidlnf.jar : Liquid Look and Feel
			    UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		     // 4. idw-gpl.jar : InfoNode Look and Feel
			   // UIManager.setLookAndFeel("net.infonode.gui.laf.InfoNodeLookAndFeel");
			// 5. JTattoo.jar : JTattoo Look and Feel
			  // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			  // UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			 
		} catch (Exception e) {
			System.out.println("�׸����뿡��");
		}
		JTabbedPane  pane = new JTabbedPane();
		pane.addTab("�ֹ�ȭ��", order );
		pane.addTab("������", customer);
		pane.addTab("������", stock );
		//pane.addTab("���", rent );

		pane.setSelectedIndex(2);  //ù ȭ��

		// ȭ��ũ������
		add("Center", pane );
		setSize(800,600);
		setVisible( true );

		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	
	}


	public static void main(String[] args) {

		new BanaCafe();


	}
}

