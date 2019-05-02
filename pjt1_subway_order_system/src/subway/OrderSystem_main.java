package subway;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


class Order_Frame extends JFrame implements ActionListener{
//	Food[] menu =new Food[6];
//	Food[] bread = new Food[6];
//	Food[] sauce = new Food[8];	
//	Food[] topping = new Food[8];	

	JButton[] rbMenu = new JButton[6];
	JButton[] rbBread = new JButton[6];
	JCheckBox[] rbSauce = new JCheckBox[8];
	JCheckBox[] rbTopping = new JCheckBox[8];
	//Food m = new Food();

	String[] menu_list = {"햄","터키 베이컨 ","로스트치킨","치킨데리야끼","이탈리안 비엠티","비엘티"};
	int[]  menu_price = {4300,4900,4900,5100,4500,4500};
	String[] bread_list = {"위트","화이트","허니 이탈리안","허니 오트"," 파마산 오레가노","플랫브래드"};
	int[]  bread_price = {0,0,300,300,500,700};
	String[] sauce_list = {"렌치드레싱","마요네즈","스위트 어니언","허니 머스터드","스위트 칠리","바베큐","이탈리안 드레싱","올리브 오일"};
	int[] sauce_price = {0,0,300,400,500,200,0,0};
	String[] topping_list = {"양상추","토마토","오이","피망","할라피뇨","피클","올리브","아보카도"};
	int[] topping_price = {0,0,500,400,0,200,300,1000};
	
	//생성자 함수 생성
	public Order_Frame(){

		JPanel menu_= new JPanel();
		JPanel bread_ = new JPanel();
		JPanel sauce_ = new JPanel();
		JPanel topping_ = new JPanel();
	
		menu_.setLayout(new GridLayout(1,6));
		menu_.setSize(50,50);
		bread_.setLayout(new GridLayout(1,6));
		bread_.setSize(50,50);
		sauce_.setLayout(new GridLayout(1,8));
		topping_.setLayout(new GridLayout(1,8));



		for (int i = 0; i < rbMenu.length; i++) {
		
			rbMenu[i]=new JButton(menu_list[i],new ImageIcon("src/imgs/menu/"+i+".jpg"));
			rbBread[i]=new JButton(bread_list[i],new ImageIcon("src/imgs/bread/"+i+".jpg"));
			menu_.add(rbMenu[i]);bread_.add(rbBread[i]);
			rbMenu[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
			rbMenu[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정
			rbBread[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
			rbBread[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정

		}
		for (int i = 0; i < rbSauce.length; i++) {
			

			rbSauce[i]=new JCheckBox(sauce_list[i], new ImageIcon("src/imgs/sauce/"+i+".jpg"));
			rbTopping[i]=new JCheckBox(topping_list[i],new ImageIcon("src/imgs/topping/"+i+".png"));
			menu_.add(rbSauce[i]);bread_.add(rbTopping[i]);
			rbSauce[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
			rbSauce[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정
			rbTopping[i].setVerticalTextPosition(JButton.BOTTOM); //text 위치 수직방향 설정
			rbTopping[i].setHorizontalTextPosition(JButton.CENTER); //text 위치 수평방향 설정
		}
		
		setLayout(new BorderLayout());
		add(menu_, BorderLayout.NORTH); 
		add(bread_,BorderLayout.CENTER);
		add(sauce_,BorderLayout.SOUTH);
		//add(topping_, BorderLayout.SOUTH);
	


		setSize(1000,1000);
		setVisible(true);


		//배치

	









	}

	void menuSet(){
		

		



//		for (int i = 0; i <6; i++) {
//			menu[i] = new Food(); //Food배열 안에서 각각 다시  menu_list와  price 배열로 구성되므로 초기화 해줘야한다. 까먹지말것!!!
//			bread[i] = new Food();
//			menu[i].name = menu_list[i];
//			menu[i].price = menu_price[i];
//			bread[i].name = bread_list[i];
//			bread[i].price = bread_price[i];
//			//메뉴 및 가격 확인용
//			//System.out.println(menu[i].name+ "      "+ menu[i].price);
//			//System.out.println(bread[i].name+ "      "+ bread[i].price);
//
//		}
//		for (int i = 0; i < sauce_price.length; i++) {
//			sauce[i] = new Food();
//			topping[i] = new Food();
//			sauce[i].name = sauce_list[i];
//			sauce[i].price = sauce_price[i];
//			topping[i].name = topping_list[i];
//			topping[i].price = topping_price[i];
//
//			System.out.println(sauce[i].name+ "      "+ sauce[i].price);
//			System.out.println(topping[i].name+ "      "+ topping[i].price);
//		}
//
//		System.out.println();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class OrderSystem_main {
	public static void main(String[] args) {
		
		Order_Frame order=new Order_Frame();
		order.menuSet();
	}

}

