package subway;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;




class Order_Frame extends JFrame implements ActionListener{
	//	Food[] menu =new Food[6];
	//	Food[] bread = new Food[6];
	//	Food[] sauce = new Food[8];	
	//	Food[] topping = new Food[8];

	ArrayList<String> order_list = new ArrayList<String> ();
	ArrayList<Integer> price_list = new ArrayList<Integer>();

	JButton[] rbMenu = new JButton[6];
	JButton[] rbBread = new JButton[6];
	JCheckBox[] rbSauce = new JCheckBox[8];
	JCheckBox[] rbTopping = new JCheckBox[8];
	JTextArea ta= new JTextArea(" 주문 메뉴를 확인하세요"+'\n');
	//Food m = new Food();

	String[] menu_list = {"햄","터키 베이컨 ","로스트치킨","치킨데리야끼","이탈리안 비엠티","비엘티"};
	int[]  menu_price = {4300,4900,4900,5100,4500,4500};
	String[] bread_list = {"위트","화이트","허니 이탈리안","허니 오트"," 파마산 오레가노","플랫브래드"};
	int[]  bread_price = {0,0,300,300,500,700};
	String[] sauce_list = {"렌치드레싱","마요네즈","스위트 어니언","허니 머스터드","스위트 칠리","바베큐","이탈리안 드레싱","올리브 오일"};
	int[] sauce_price = {0,0,300,400,500,200,0,0};
	String[] topping_list = {"양상추","토마토","오이","피망","할라피뇨","피클","올리브","아보카도"};
	int[] topping_price = {0,0,500,400,0,200,300,1000};
	
	int total = 0;
	String result_="";

	//생성자 함수 생성
	public Order_Frame(){
		JPanel menu_bread = new JPanel();
		JPanel sauce_topping = new JPanel();
		JPanel menu_= new JPanel();
		JPanel bread_ = new JPanel();
		JPanel sauce_ = new JPanel();
		JPanel topping_ = new JPanel();
		
		

		menu_.setLayout(new GridLayout(1,6));
		menu_.setSize(100,300);
		bread_.setLayout(new GridLayout(1,6));
		bread_.setSize(100,300);
		menu_bread.setLayout(new GridLayout(2,1));
		menu_bread.add(menu_);
		menu_bread.add(bread_);

//		sauce_.setLayout(new GridLayout(1,8));
//		topping_.setLayout(new GridLayout(1,8));
//		sauce_topping.setLayout(new GridLayout(2,1));
//		sauce_topping.add(sauce_);
//		sauce_topping.add(topping_);



		for (int i = 0; i < rbMenu.length; i++) {

			rbMenu[i]=new JButton(menu_list[i],new ImageIcon("src/imgs/menu/"+i+".jpg"));
			rbBread[i]=new JButton(bread_list[i],new ImageIcon("src/imgs/bread/"+i+".jpg"));
			menu_.add(rbMenu[i]);bread_.add(rbBread[i]);
			rbMenu[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
			rbMenu[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정
			rbBread[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
			rbBread[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정

		}

//		for (int i = 0; i < rbSauce.length; i++) {
//
//
//			rbSauce[i]=new JCheckBox(sauce_list[i], new ImageIcon("src/imgs/sauce/"+i+".jpg"));
//			rbTopping[i]=new JCheckBox(topping_list[i],new ImageIcon("src/imgs/topping/"+i+".png"));
//			menu_.add(rbSauce[i]);bread_.add(rbTopping[i]);
//			rbSauce[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
//			rbSauce[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정
//			rbTopping[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
//			rbTopping[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정
//		}
		//배치
		setLayout(new GridLayout(2,1));
		add(menu_bread);
		add(ta);//add(sauce_topping);
		//		add(menu_bread, BorderLayout.NORTH); 
		//		add(sauce_topping, BorderLayout.SOUTH); 
		//add(bread_,BorderLayout.CENTER);
		//add(sauce_,BorderLayout.SOUTH);
		//add(topping_, BorderLayout.SOUTH);



		setSize(1000,300);
		setVisible(true);

	}

//	void getOrderList(){
//
//
//
//	}
	void eventProd() {
		for (int i = 0; i < rbMenu.length; i++) {
			rbMenu[i].addActionListener(this);
			rbBread[i].addActionListener(this);
		}
//		for (int i = 0; i < rbSauce.length; i++) {
//			rbSauce[i].addActionListener(this);
//			rbTopping[i].addActionListener(this);
//		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		for (int i = 0; i < rbMenu.length; i++) {
			if(obj == rbMenu[i] ) {
				order_list.add(rbMenu[i].getText());
				price_list.add(menu_price[i]);
				//System.out.println((String)order_list.get(i));

			}else if(obj == rbBread[i]) {
				order_list.add(rbBread[i].getText());
				price_list.add(bread_price[i]);
				//System.out.println((String)order_list.get(i));

			}
		}
		
//		JCheckBox obj1 = (JCheckBox)e.getSource();
//		
//		for (int i = 0; i < rbSauce.length; i++) {
//			if(obj1 == rbSauce[i]) {
//				order_list.add(rbSauce[i].getText());
//				price_list.add(sauce_price[i]);
//				//System.out.println((String)order_list.get(i));
//			}else if(obj1 == rbTopping[i]) {
//				order_list.add(rbTopping[i].getText());
//				price_list.add(topping_price[i]);
//			}
//			
//		}
			

		//System.out.println(order_list);
		//System.out.println(price_list);
		
		//ta = new JTextArea();
		ta.setText(" 주문 메뉴를 확인하세요\n");
		for (int i = 0; i < order_list.size(); i++) {
			String result = order_list.get(i)+" ,가격 " +price_list.get(i)+'\n';
			//result_+= result;
			ta.append(result);
			total+=price_list.get(i);
		}
		
		ta.append("총가격은 " +total);

	}
}
public class OrderSystem_main {
	public static void main(String[] args) {

		Order_Frame order=new Order_Frame();
		//order.getOrderList();
		order.eventProd();
	}

}

