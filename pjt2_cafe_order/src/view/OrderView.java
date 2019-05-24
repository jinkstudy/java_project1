package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import model.dao.OrderModel;


public class OrderView extends JPanel {
	//member field 
	JTextField tfOrderTel, tfMiles, tfCupon;
	JButton bTel, bPlatW, bCarMa, bCarpu, bIceCarpu, bAmerica, bIceAmerica, bChoco,bGreenTea, bSand, bOrd, bCan, bUsage, bApply, bPay;
	JTextArea ta;
	JLabel labelMil, labelCupon, labelTotal, labelTotalWrite;
	JComboBox MorT;

	JTable tableOrder;     //view ����
	OrderModel tbModelOrder;   //model ����




	//********
	//�� Ŭ���� ���� ����
	OrderModel ord;

	//#########################
	//constructor method
	public OrderView() {        
		addLayout();  //ȭ�鼳��
		connectDB();
		eventProc();  //DB����
	}




	private void connectDB() {  //DB����
		try {
			ord = new OrderModel();
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "����̹�����:"+ex.getMessage());
		}
	}

	public  void eventProc() {

		//	insert()//�ֹ��̺�Ʈ
		//	proctadd()//�����߰��̺�Ʈ
		//	result()//������ư�̺�Ʈ
		//	cancel()//��ҹ�ư�̺�Ʈ

		//	search() // �ֹ����� ��ȸ
		//	select() // ȸ�� ��ȭ��ȣ�� ���� �������� 
		//	update() //ȸ�� ��ȭ��ȣ ���ͼ� ������ ����


		//��ư�̺�Ʈ
		ButtonEventHandler hdlr = new ButtonEventHandler();

		bTel.addActionListener(hdlr);
		bPlatW.addActionListener(hdlr);
		bCarMa.addActionListener(hdlr);
		bCarpu.addActionListener(hdlr);
		bIceCarpu.addActionListener(hdlr);
		bAmerica.addActionListener(hdlr);
		bIceAmerica.addActionListener(hdlr);
		bChoco.addActionListener(hdlr);
		bGreenTea.addActionListener(hdlr);
		bSand.addActionListener(hdlr);
		bOrd.addActionListener(hdlr);
		bCan.addActionListener(hdlr);
		bUsage.addActionListener(hdlr);
		bApply.addActionListener(hdlr);
		bPay.addActionListener(hdlr);

		MorT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {     //�޺��ڽ� m or t �� �ý�Ʈarea ta�� �ű�� ����
			//	ta.setEditable(MorT.isSelected());
			}

		});
	}


	//JTable �������� Ŭ������ �� ���콺 �̺�Ʈ ��




	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			Object o = ev.getSource();
			if(o==tfOrderTel || o==bTel) {
				//			telSearch();       //��ȭ��ȣ��ȸ�̺�Ʈ
				custMiles();//���ϸ�������
				custCoupons();

			}else if(o==ta) {		//'�ֹ����� Ȯ��' ��µǰ�
				Orderhwak();
			}

		}
	}


	public void custMiles() {
		Order or = new Order();
		or.setOrderTel(tfOrderTel.getText());
		or.setOrderTel(bTel.getText());
		try {
			ord.insertOrder1(or);
			clearTextField();
		}catch(Exception ex) {
			System.out.println("�Է� ����:"+ex.getMessage());
		}
	}

	public void custCoupons() {
		Order or = new Order();
		or.setOrderTel(tfOrderTel.getText());
		or.setOrderTel(bTel.getText());
		try {
			ord.insertOrder2(or);
			clearTextField();
		}catch(Exception ex) {
			System.out.println("�Է� ����:"+ex.getMessage());
		}
	}

	public void Orderhwak() {
		Order or = new Order();
		or.setPlatW(bPlatW.getText());
		or.setCarMa(bCarMa.getText());
		or.setCarpu(bCarpu.getText());
		or.setIceCarpu(bIceCarpu.getText());
		or.setAmerica(bAmerica.getText());
		or.setIceAmerica(bIceAmerica.getText());
		or.setChoco(bChoco.getText());
		or.setGreenTea(bGreenTea.getText());
		or.setSand(bSand.getText());
		String count = (String)MorT.getSelectedItem(ta.getText()); //mort ta�� �ű�� ����
		try {
			ord.orderHwakin(or, count);
			JOptionPane.showMessageDialog(null, "�ֹ�");
			clearTextField();
		} catch(Exception ex) {
			System.out.println("�Է¿���:"+ex.getMessage());
		}
	}
	private void clearTextField() {
		tfOrderTel.setText(null);
		bPlatW.setText(null);
		bCarMa.setText(null);
		bCarpu.setText(null);
		bIceCarpu.setText(null);
		bAmerica.setText(null);
		bIceAmerica.setText(null);
		bChoco.setText(null);
		bGreenTea.setText(null);
		bSand.setText(null);
		bPlatW.setText(null);
		bPlatW.setText(null);
		ta.setText("1");


	}
	//ȭ�鼳�� �޼ҵ�
	public void addLayout() {
		//��������� ��ü ����
		try {
			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch (Exception e) {	} 

		//textfield ��

		tfOrderTel = new JTextField("��ȭ��ȣ�� �Է��Ͻÿ�");
		tfMiles = new JTextField(100);
		tfCupon = new JTextField(100);

		//���� ��ư 9 ��

		bTel = new JButton("�Է�");
		bPlatW = new JButton("�÷�ȭ��Ʈ");
		bCarMa = new JButton("ī������ ��Ű����");
		bCarpu = new JButton("īǪġ��");
		bIceCarpu = new JButton("���̽� īǪġ��");
		bAmerica = new JButton("�Ƹ޸�ī��");
		bIceAmerica = new JButton("���̽� �Ƹ޸�ī��");
		bChoco = new JButton("����ġ��");
		bGreenTea = new JButton("�׸�Ƽ ��");
		bSand = new JButton("������ġ");

		//��ư ������
		bOrd = new JButton("�ֹ�");
		bCan = new JButton("���");
		bUsage = new JButton("���");
		bApply = new JButton("����");
		bPay = new JButton("����");

		//�޺��ڽ�
		String []k = {"����", "����ũ�ƿ�"};
		MorT = new JComboBox(k);
		//�ؽ�Ʈarea
		ta = new JTextArea(); 

		//�󺧵�
		labelMil = new JLabel("���ϸ���");
		labelCupon = new JLabel("������ȣ");
		labelTotal = new JLabel("�ѱݾ�");
		labelTotalWrite = new JLabel();

		tbModelOrder = new OrderModel();
		tableOrder = new JTable(tbModelOrder);

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

		JPanel order_east_c = new JPanel();
		order_east_c.setBorder(new TitledBorder("�ֹ� ���� Ȯ��"));
		order_east_c.add(ta); 
		order_east.add(order_east_c, BorderLayout.CENTER);

		//������ ��
		JPanel order_east_s = new JPanel();
		order_east_s.setBorder(new TitledBorder("��   ��"));
		order_east_s.setLayout(new BorderLayout());

		//������ ��-����
		JPanel order_east_s_c = new JPanel();
		order_east_s_c.setLayout(new GridLayout(3,1));



		JPanel order_east_s_c_1 = new JPanel();
		order_east_s_c_1.setLayout(new GridLayout(1,3));
		order_east_s_c_1.add(labelMil);
		order_east_s_c_1.add(tfMiles);
		order_east_s_c_1.add(bUsage);


		JPanel order_east_s_c_2 = new JPanel();
		order_east_s_c_2.setLayout(new GridLayout(1,3));
		order_east_s_c_2.add(labelCupon);
		order_east_s_c_2.add(tfCupon);
		order_east_s_c_2.add(bApply);

		JPanel order_east_s_c_3 = new JPanel();
		order_east_s_c_3.setLayout(new GridLayout(1,2));
		order_east_s_c_3.add(labelTotal);
		order_east_s_c_3.add(labelTotalWrite);

		order_east_s_c_3.setBorder(new TitledBorder(""));
		order_east_s_c.add(order_east_s_c_1);
		order_east_s_c.add(order_east_s_c_2);
		order_east_s_c.add(order_east_s_c_3);

		order_east_s.add(order_east_s_c, BorderLayout.CENTER);

		JPanel order_east_s_s = new JPanel();
		order_east_s_s.setLayout(new BorderLayout());
		order_east_s_s.add(bPay, BorderLayout.EAST);

		order_east_s.add(order_east_s_s, BorderLayout.SOUTH);

		order_east.add(order_east_s, BorderLayout.SOUTH);
		//��ü������ ���̱�
		//��ü c(1,2)�� ����

		setLayout(new GridLayout(1,2));
		add(order_west);
		add(order_east);
	}



}


