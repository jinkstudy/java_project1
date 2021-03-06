package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.dao.StockModel;
import model.vo.Stock;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;



public class StockView   extends JPanel {

	//멤버변수 선언
	JTextField tfStOrderNo;
	JLabel[] lbstMenulist =new JLabel[9];
	JTextField [] tfStOrderCnt = new JTextField[9] ;
	JButton btstOrder, btstCancel, btstSearch;
	JComboBox cbstSearch;

	JRadioButton rbstOrderSearch,rbStSearch;
	JTable tableStock;

	StockTableModel tbModelStock;

	StockModel db;

	//String [] columnNames;


	







	public StockView() {
		addLayout(); 	// 화면설계
		initStyle();
		eventProc();
		connectDB();

	}

	//배치 레이아웃
	public void addLayout() {
		try{

			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
			// UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){}

		String[] mlist = new String[9];
		//		for (int i = 0; i < 9; i++) {
		//			mlist[i] = String.valueOf(i);
		//		}


		try {
			db = new StockModel();
			mlist = db.getMname();

			tfStOrderNo = new JTextField(15);
			btstOrder = new JButton("주문");
			btstCancel = new JButton("취소");
			btstSearch = new JButton("검색");
			cbstSearch = new JComboBox(mlist);
			rbstOrderSearch = new JRadioButton("주문이력조회");
			rbStSearch = new JRadioButton("재고내역조회");

			for (int i = 0; i < mlist.length; i++) {
				lbstMenulist[i]= new JLabel(mlist[i]);
				tfStOrderCnt[i] = new JTextField();
			}
			tbModelStock = new StockTableModel();
			tableStock = new JTable(tbModelStock);



		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "화면구성실패" + e.getMessage());
		}

		btstOrder.setPreferredSize(new Dimension(20,80)); 
		btstCancel.setPreferredSize(new Dimension(20,80)); 
		tfStOrderNo.setPreferredSize(new Dimension(20,60)); 

		//화면 구성


		//왼쪽 영역
		JPanel p_west = new JPanel();
		p_west.setBorder(new TitledBorder("입고요청"));
		p_west.setLayout(new BorderLayout());

		//왼쪽-북쪽
		JPanel p_west_n = new JPanel();
		p_west_n.setLayout(new GridLayout(1,2));
		p_west_n.add(new JLabel("입고주문번호"));
		p_west_n.add(tfStOrderNo);

		//왼쪽 - 센터
		JPanel p_west_c = new JPanel();
		p_west_c.setLayout(new GridLayout(9,2));
		for (int i = 0; i < 9; i++) {
			p_west_c.add(lbstMenulist[i]);
			p_west_c.add(tfStOrderCnt[i]);

		}

		//왼쪽 - 남쪽

		JPanel p_west_s = new JPanel();
		p_west_s.setLayout(new GridLayout(1,2));
		p_west_s.add(btstOrder);
		p_west_s.add(btstCancel);

		p_west_n.setBorder(new TitledBorder(""));
		p_west_c.setBorder(new TitledBorder(""));
		p_west_s.setBorder(new TitledBorder(""));

		//왼쪽 영역 붙이기	

		p_west.add(p_west_n,BorderLayout.NORTH);
		p_west.add(p_west_c,BorderLayout.CENTER);
		p_west.add(p_west_s,BorderLayout.SOUTH);


		//오른쪽 영역
		JPanel p_east = new JPanel();
		p_east.setBorder(new TitledBorder("조회"));
		p_east.setLayout(new BorderLayout());	
		//오른쪽 -위
		JPanel p_east_n = new JPanel();
		p_east_n.setLayout(new GridLayout(2,1));
		//p_east_n.setBorder(new TitledBorder(""));

		//오른쪽 - 위- 위
		JPanel p_east_n_n = new JPanel();
		p_east_n_n.setLayout(new GridLayout(1,2));
		p_east_n_n.setBorder(new TitledBorder(""));
		p_east_n_n.add(rbstOrderSearch);

		p_east_n_n.add(rbStSearch);

		//오른쪽 - 위- d아래
		JPanel p_east_n_s = new JPanel();
		p_east_n_s.setLayout(new GridLayout(1,3));
		p_east_n_s.add(new JLabel("조회")); // 조건따라 변경
		p_east_n_s.add(cbstSearch);	
		p_east_n_s.setBorder(new TitledBorder(""));
		//p_east_n_s.


		p_east_n.add(p_east_n_n);
		p_east_n.add(p_east_n_s);

		//오른쪽 센터
		JPanel p_east_c = new JPanel();
		p_east_c.add(new JScrollPane(tableStock));

		//오른쪽 영역 붙이기	

		p_east.add(p_east_n,BorderLayout.NORTH);
		p_east.add(p_east_c,BorderLayout.CENTER);



		//전체 영역
		setLayout(new GridLayout(1,2));
		add(p_west);
		add(p_east);


	}

	// 초기 설정
	public void initStyle() {
		// TODO Auto-generated method stub

	}

	// 이벤트 처리
	public void eventProc() {
		MyHdlr myhdlr = new MyHdlr();

		tfStOrderNo.addActionListener(myhdlr);
		btstSearch.addActionListener(myhdlr);
		btstOrder.addActionListener(myhdlr);
		btstCancel.addActionListener(myhdlr);
		rbstOrderSearch.addActionListener(myhdlr);
		rbStSearch.addActionListener(myhdlr);

	}



	class MyHdlr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ev) {
			Object o = ev.getSource();

			if(o==tfStOrderNo){  
				//System.out.println("이벤트확인");
				getStOrderList();  // 회원등록
			}
			else if(o==btstSearch){
				//System.out.println("이벤트확인");
				getStOrderList();// 회원정보수정
			}			
			else  if(o==btstOrder){
				//System.out.println("이벤트확인");// 이름검색
				orderStock();      // 전화번호 검색
			}
			else if(o==btstCancel){  // 이름검색
				cancelStock();
				//System.out.println("이름검색");
			}else if(o==rbstOrderSearch){  // 이름검색
				setComboSt();
				//System.out.println("이름검색");
			}else if(o==rbStSearch){  // 이름검색
				setComboSt();
				//System.out.println("이름검색");
			}else if(o==rbStSearch){  // 이름검색
				//showData();
				//System.out.println("이름검색");
			}

		}
	}
	// 디비 연결

	public void connectDB() {
		try {
			db=new StockModel();
			//System.out.println("연결성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("연결실패" + e.getMessage());
		}

	}
	public void setComboSt() {
		// TODO Auto-generated method stub

	}

	public void showData() {
		// TODO Auto-generated method stub

	}

	public void cancelStock() {
		String sOrderno = tfStOrderNo.getText();
		try {
			db.deleteSt(sOrderno);
			JOptionPane.showMessageDialog(null, "취소되었습니다");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "삭제실패");
		}
		return;

	}

	public void orderStock() {
		
		SimpleDateFormat DateFormat = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss", Locale.KOREA );
		SimpleDateFormat OrdernoFormat = new SimpleDateFormat ( "yyyyMMddHHmmss", Locale.KOREA );
		Date currentTime = new Date ();

		ArrayList<Stock> list = new ArrayList<Stock>();

		try {
		for (int i = 0; i < tfStOrderCnt.length; i++) {

			if(!(tfStOrderCnt[i].getText().equals("") || tfStOrderCnt[i].getText().equals("0")) ) {
			
				Stock vo = new Stock(); 
				vo.setMenuNo(i+1);
				vo.setsCount(Integer.parseInt(tfStOrderCnt[i].getText()));
				vo.setsTime(DateFormat.format ( currentTime));
				vo.setsOrderNo(OrdernoFormat.format ( currentTime ));
				list.add(vo);
			
			}		
		}
		
		
			db.insertSt(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;

	}

	public void getStOrderList() {
		String sOrderno = tfStOrderNo.getText();
		
		try {
			ArrayList<Stock> orderCnt =new ArrayList<Stock>();
			orderCnt = db.getStOrderCnt(sOrderno);
			
			if(orderCnt.isEmpty()) {
				JOptionPane.showMessageDialog(null, "주문번호를 확인하세요");
			}
				
			else{
				for(Stock vo: orderCnt) {
					tfStOrderCnt[vo.getMenuNo()-1].setText(String.valueOf(vo.getsCount()));
				}
			}
	
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "조회실패");
		}
		return;
		

	}



	//화면에 테이블 붙이는 메소드
	class StockTableModel extends AbstractTableModel{
		ArrayList data = new ArrayList();
		String [] columnNames = {"입고번호","상품명","요청 수량","주문직원"};

		@Override
		public int getColumnCount() {
			return columnNames.length;
		}

		@Override
		public int getRowCount() {
			return data.size(); 
		}

		@Override
		public Object getValueAt(int row, int col) {
			ArrayList temp = (ArrayList)data.get( row );
			return temp.get( col ); 
		}
		public String getColumnName(int col){
			return columnNames[col];
		}

	}







}
