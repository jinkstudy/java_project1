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

JTable tableOrder;     //view 역할
OrderTableModel OrderTM;   //화면에 테이블 붙이는 클래스

JComboBox MorT;


//********
//모델 클래스 변수 선언


//#########################
//constructor method
public OrderView() {
	addLayout();
	
}

//화면설계 메소드
public void addLayout() {
	//멤버변수의 객체 생성
	tfOrderTel = new JTextField(20);
	tfMiles = new JTextField(100);
	tfCupon = new JTextField(100);
	tfTotal = new JTextField(100);
	
	
	bTel = new JButton("선택");
	bPlatW = new JButton("플랫화이트");
	bCarMa = new JButton("카라멜라테 마키아토");
	bCarpu = new JButton("카푸치노");
	bIceCarpu = new JButton("아이스 카푸치노");
	bAmerica = new JButton("아메리카노");
	bIceAmerica = new JButton("아이스 아메리카노");
	bChoco = new JButton("초코치노");
	bGreenTea = new JButton("그린티 라떼");
	bSand = new JButton("샌드위치");
	

	bOrd = new JButton("주문");
	bCan = new JButton("취소");
	bPay = new JButton("결제");
	
	String []k = {"매장", "테이크아웃"};
	MorT = new JComboBox(k);
	ta = new JTextArea(); 
	
	
	labelMil = new JLabel("마일리지");
	labelCupon = new JLabel("쿠폰번호");
	labelUsage = new JLabel("사용");
	labelApply = new JLabel("적용");
	
	
	OrderTM = new OrderTableModel();
	tableOrder = new JTable(OrderTM);
	
	//*************************************
	// 화면 구성
	
	

	//왼쪽
	
	JPanel order_west = new JPanel();
	order_west.setLayout(new BorderLayout());
	order_west.setBorder(new TitledBorder("주문창"));
	
	//왼쪽 위 
	
	JPanel order_west_n = new JPanel();
	
	order_west_n.add(tfOrderTel);
	order_west_n.add(bTel);
	order_west.add(order_west_n, BorderLayout.NORTH);
	
	//왼쪽 센터
	
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
	
	//왼쪽 아래
	
	JPanel order_west_s = new JPanel();
	order_west_s.add(MorT);
	order_west_s.add(bOrd);
	order_west_s.add(bCan);
	order_west.add(order_west_s, BorderLayout.SOUTH);
	
	
	//오른쪽
	
	JPanel order_east = new JPanel();
	order_east.setLayout(new BorderLayout());
	
	//오른쪽  위 
	
	JPanel order_east_n = new JPanel();
	order_east_n.setBorder(new TitledBorder("주문 내역 확인"));
	order_east_n.add(ta); 
	order_east.add(order_east_n, BorderLayout.NORTH);
	
	//오른쪽 밑
	JPanel order_east_c = new JPanel();
	order_east_c.setBorder(new TitledBorder("결   제"));
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
//전체영역에 붙이기
//전체 c(1,2)로 나눔
	
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
