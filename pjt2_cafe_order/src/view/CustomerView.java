package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class CustomerView  extends JPanel {

	JTextField tfInputTel = new JTextField(10);  //전화번호 입력	
	//	JTextField taMileage = new JTextField(10);  //마일리지 현황
	JTextArea taMileage = new JTextArea();  //마일리지 현황	
	TextArea tainfo  =   new TextArea( 25, 40);  //이용내역 현황
	JButton bt_tel = new JButton("검색"); //전화번호 입력 버튼
	JButton bt_mileage = new JButton("검색"); //마일리지 검색

	public CustomerView() {
		addLayout();
	}

	public void addLayout(){
		JPanel p_west = new JPanel();	
		JPanel p_east = new JPanel();

		p_east.setLayout(new FlowLayout());
		JPanel p_east_north = new JPanel();
		JPanel p_east_center = new JPanel();

		p_east_north.setLayout(new GridLayout(2,1));
		p_east_north.add(new JLabel("전화번호 입력"));
		p_east_north.add(tfInputTel);
		p_east_north.add(new JLabel("마일리지 현황"));
		p_east_north.add(taMileage);	
		p_east.add(p_east_north,BorderLayout.NORTH);

		p_east_center.setLayout(new FlowLayout());
		p_east_center.add(tainfo);
		p_east.add(p_east_center,BorderLayout.CENTER);

		//전체 영역
		setLayout(new GridLayout(1,2));
		add(p_east);
		p_east.setBorder(new TitledBorder("left"));
		add(p_west);
		p_west.setBorder(new TitledBorder("RIght"));

	}
}
