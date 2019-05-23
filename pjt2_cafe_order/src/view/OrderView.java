package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

public class OrderView   extends JPanel {
//member field
JTextField tfOrderTel, tfMiles, tfCupon, tfTotal;
JButton bTel, bPlatW, bCarMa, bCarpu, bIceCarpu, bAmerica, bIceAmerica, bChoco,bGreenTea, bSand, bOrd, bCan, bPay;
JTextArea ta;
JLabel labelMil, labelCupon, labelUsage, labelApply;

JTable tableOrder;     //view ����
OrderTableModel OrderTM;   //ȭ�鿡 ���̺� ���̴� Ŭ����

JComboBox MorT;


//********
//�� Ŭ���� ���� ����


//#########################
//constructor method
public OrderView() {
	addLayout();
	
}

//ȭ�鼳�� �޼ҵ�
public void addLayout() {
	//��������� ��ü ����
	tfOrderTel = new JTextField(20);
	tfMiles = new JTextField(100);
	tfCupon = new JTextField(100);
	tfTotal = new JTextField(100);
	
	
	bTel = new JButton("����");
	bPlatW = new JButton("�÷�ȭ��Ʈ");
	bCarMa = new JButton("ī������ ��Ű����");
	bCarpu = new JButton("īǪġ��");
	bIceCarpu = new JButton("���̽� īǪġ��");
	bAmerica = new JButton("�Ƹ޸�ī��");
	bIceAmerica = new JButton("���̽� �Ƹ޸�ī��");
	bChoco = new JButton("����ġ��");
	bGreenTea = new JButton("�׸�Ƽ ��");
	bSand = new JButton("������ġ");
	

	bOrd = new JButton("�ֹ�");
	bCan = new JButton("���");
	bPay = new JButton("����");
	
	String []k = {"����", "����ũ�ƿ�"};
	MorT = new JComboBox(k);
	ta = new JTextArea(); 
	
	
	labelMil = new JLabel("���ϸ���");
	labelCupon = new JLabel("������ȣ");
	labelUsage = new JLabel("���");
	labelApply = new JLabel("����");
	
	
	OrderTM = new OrderTableModel();
	tableOrder = new JTable(OrderTM);
	
	//*************************************
	// ȭ�� ����
	
	

	//����
	
	JPanel order_west = new JPanel();
	order_west.setLayout(new BorderLayout());
	order_west.setBorder(new TitledBorder("�ֹ�â"));
	
	//���� �� 
	
	JPanel order_west_n = new JPanel();
	
	order_west_n.add(tfOrderTel);
	order_west_n.add(bTel);
	order_west.add(order_west_n, BorderLayout.NORTH);
	
	//���� ����
	
	JPanel order_west_c = new JPanel();
	order_west_c.setLayout(new GridLayout(3,3));
	order_west_c.add(bPlatW);
	order_west_c.add(bCarMa);
	order_west_c.add(bCarpu);
	order_west_c.add(bIceCarpu);
	order_west_c.add(bAmerica);
	order_west_c.add(bIceAmerica);
	order_west_c.add(bChoco);
	order_west_c.add(bGreenTea);
	order_west_c.add(bSand);
	order_west.add(order_west_c, BorderLayout.CENTER);
	
	//���� �Ʒ�
	
	JPanel order_west_s = new JPanel();
	order_west_s.add(MorT);
	order_west_s.add(bOrd);
	order_west_s.add(bCan);
	order_west.add(order_west_s, BorderLayout.SOUTH);
	
	
	//������
	
	JPanel order_east = new JPanel();
	order_east.setLayout(new BorderLayout());
	
	//������  �� 
	
	JPanel order_east_n = new JPanel();
	order_east_n.setBorder(new TitledBorder("�ֹ� ���� Ȯ��"));
	order_east_n.add(ta); 
	order_east.add(order_east_n, BorderLayout.NORTH);
	
	//������ ��
	JPanel order_east_c = new JPanel();
	order_east_c.setBorder(new TitledBorder("��   ��"));
	order_east_c.setLayout(new BorderLayout());
	
	
	JPanel order_east_c_1 = new JPanel();
	order_east_c_1.setLayout(new GridLayout(2,3));
	order_east_c_1.add(labelMil);
	order_east_c_1.add(tfMiles);
	order_east_c_1.add(labelUsage);
	order_east_c_1.add(labelCupon);
	order_east_c_1.add(tfCupon);
	order_east_c_1.add(labelApply);
	order_east_c.add(order_east_c_1,BorderLayout.CENTER);
	
	JPanel order_east_c_2 = new JPanel();

	order_east_c_2.add(tfTotal);
	order_east_c_2.add(bPay);
	order_east_c.add(order_east_c_2,BorderLayout.SOUTH);
	
	order_east.add(order_east_c, BorderLayout.CENTER);
//��ü������ ���̱�
//��ü c(1,2)�� ����
	
	setLayout(new GridLayout(1,2));
	add(order_west);
	add(order_east);
}
private JLabel JLabel(String string) {
	// TODO Auto-generated method stub
	return null;
}

class OrderTableModel extends AbstractTableModel {

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	} 
}
}
