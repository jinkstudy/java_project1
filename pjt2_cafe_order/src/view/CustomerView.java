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

	JTextField tfInputTel = new JTextField(10);  //��ȭ��ȣ �Է�	
	//	JTextField taMileage = new JTextField(10);  //���ϸ��� ��Ȳ
	JTextArea taMileage = new JTextArea();  //���ϸ��� ��Ȳ	
	TextArea tainfo  =   new TextArea( 25, 40);  //�̿볻�� ��Ȳ
	JButton bt_tel = new JButton("�˻�"); //��ȭ��ȣ �Է� ��ư
	JButton bt_mileage = new JButton("�˻�"); //���ϸ��� �˻�

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
		p_east_north.add(new JLabel("��ȭ��ȣ �Է�"));
		p_east_north.add(tfInputTel);
		p_east_north.add(new JLabel("���ϸ��� ��Ȳ"));
		p_east_north.add(taMileage);	
		p_east.add(p_east_north,BorderLayout.NORTH);

		p_east_center.setLayout(new FlowLayout());
		p_east_center.add(tainfo);
		p_east.add(p_east_center,BorderLayout.CENTER);

		//��ü ����
		setLayout(new GridLayout(1,2));
		add(p_east);
		p_east.setBorder(new TitledBorder("left"));
		add(p_west);
		p_west.setBorder(new TitledBorder("RIght"));

	}
}