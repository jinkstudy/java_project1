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

	JTable tableOrder;     //view 역할
	OrderModel tbModelOrder;   //model 역할




	//********
	//모델 클래스 변수 선언
	OrderModel ord;

	//#########################
	//constructor method
	public OrderView() {        
		addLayout();  //화면설계
		connectDB();
		eventProc();  //DB연결
	}




	private void connectDB() {  //DB연결
		try {
			ord = new OrderModel();
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "드라이버오류:"+ex.getMessage());
		}
	}

	public  void eventProc() {

		//	insert()//주문이벤트
		//	proctadd()//수량추가이벤트
		//	result()//결제버튼이벤트
		//	cancel()//취소버튼이벤트

		//	search() // 주문내역 조회
		//	select() // 회원 전화번호로 정보 가져오기 
		//	update() //회원 전화번호 얻어와서 데이터 수정


		//버튼이벤트
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
			public void actionPerformed(ActionEvent e) {     //콤보박스 m or t 를 택스트area ta에 옮기기 위해
			//	ta.setEditable(MorT.isSelected());
			}

		});
	}


	//JTable 오더에서 클릭했을 때 마우스 이벤트 줌




	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			Object o = ev.getSource();
			if(o==tfOrderTel || o==bTel) {
				//			telSearch();       //전화번호조회이벤트
				custMiles();//마일리지관리
				custCoupons();

			}else if(o==ta) {		//'주문내역 확인' 출력되게
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
			System.out.println("입력 오류:"+ex.getMessage());
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
			System.out.println("입력 오류:"+ex.getMessage());
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
		String count = (String)MorT.getSelectedItem(ta.getText()); //mort ta에 옮기기 위해
		try {
			ord.orderHwakin(or, count);
			JOptionPane.showMessageDialog(null, "주문");
			clearTextField();
		} catch(Exception ex) {
			System.out.println("입력오류:"+ex.getMessage());
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
	//화면설계 메소드
	public void addLayout() {
		//멤버변수의 객체 생성
		try {
			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch (Exception e) {	} 

		//textfield 들

		tfOrderTel = new JTextField("전화번호를 입력하시오");
		tfMiles = new JTextField(100);
		tfCupon = new JTextField(100);

		//왼쪽 버튼 9 개

		bTel = new JButton("입력");
		bPlatW = new JButton("플랫화이트");
		bCarMa = new JButton("카라멜라테 마키아토");
		bCarpu = new JButton("카푸치노");
		bIceCarpu = new JButton("아이스 카푸치노");
		bAmerica = new JButton("아메리카노");
		bIceAmerica = new JButton("아이스 아메리카노");
		bChoco = new JButton("초코치노");
		bGreenTea = new JButton("그린티 라떼");
		bSand = new JButton("샌드위치");

		//버튼 나머지
		bOrd = new JButton("주문");
		bCan = new JButton("취소");
		bUsage = new JButton("사용");
		bApply = new JButton("적용");
		bPay = new JButton("결제");

		//콤보박스
		String []k = {"매장", "테이크아웃"};
		MorT = new JComboBox(k);
		//텍스트area
		ta = new JTextArea(); 

		//라벨들
		labelMil = new JLabel("마일리지");
		labelCupon = new JLabel("쿠폰번호");
		labelTotal = new JLabel("총금액");
		labelTotalWrite = new JLabel();

		tbModelOrder = new OrderModel();
		tableOrder = new JTable(tbModelOrder);

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

		JPanel order_east_c = new JPanel();
		order_east_c.setBorder(new TitledBorder("주문 내역 확인"));
		order_east_c.add(ta); 
		order_east.add(order_east_c, BorderLayout.CENTER);

		//오른쪽 밑
		JPanel order_east_s = new JPanel();
		order_east_s.setBorder(new TitledBorder("결   제"));
		order_east_s.setLayout(new BorderLayout());

		//오른쪽 밑-센터
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
		//전체영역에 붙이기
		//전체 c(1,2)로 나눔

		setLayout(new GridLayout(1,2));
		add(order_west);
		add(order_east);
	}



}


