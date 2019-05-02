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

	String[] menu_list = {"��","��Ű ������ ","�ν�ƮġŲ","ġŲ�����߳�","��Ż���� ��Ƽ","��Ƽ"};
	int[]  menu_price = {4300,4900,4900,5100,4500,4500};
	String[] bread_list = {"��Ʈ","ȭ��Ʈ","��� ��Ż����","��� ��Ʈ"," �ĸ��� ��������","�÷��귡��"};
	int[]  bread_price = {0,0,300,300,500,700};
	String[] sauce_list = {"��ġ�巹��","�������","����Ʈ ��Ͼ�","��� �ӽ��͵�","����Ʈ ĥ��","�ٺ�ť","��Ż���� �巹��","�ø��� ����"};
	int[] sauce_price = {0,0,300,400,500,200,0,0};
	String[] topping_list = {"�����","�丶��","����","�Ǹ�","�Ҷ��Ǵ�","��Ŭ","�ø���","�ƺ�ī��"};
	int[] topping_price = {0,0,500,400,0,200,300,1000};
	
	//������ �Լ� ����
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
			rbMenu[i].setVerticalTextPosition(JButton.BOTTOM); //text ��ġ �������� ����
			rbMenu[i].setHorizontalTextPosition(JButton.CENTER); //text ��ġ ������� ����
			rbBread[i].setVerticalTextPosition(JButton.BOTTOM); //text ��ġ �������� ����
			rbBread[i].setHorizontalTextPosition(JButton.CENTER); //text ��ġ ������� ����

		}
		for (int i = 0; i < rbSauce.length; i++) {
			

			rbSauce[i]=new JCheckBox(sauce_list[i], new ImageIcon("src/imgs/sauce/"+i+".jpg"));
			rbTopping[i]=new JCheckBox(topping_list[i],new ImageIcon("src/imgs/topping/"+i+".png"));
			menu_.add(rbSauce[i]);bread_.add(rbTopping[i]);
			rbSauce[i].setVerticalTextPosition(JButton.BOTTOM); //text ��ġ �������� ����
			rbSauce[i].setHorizontalTextPosition(JButton.CENTER); //text ��ġ ������� ����
			rbTopping[i].setVerticalTextPosition(JButton.BOTTOM); //text ��ġ �������� ����
			rbTopping[i].setHorizontalTextPosition(JButton.CENTER); //text ��ġ ������� ����
		}
		
		setLayout(new BorderLayout());
		add(menu_, BorderLayout.NORTH); 
		add(bread_,BorderLayout.CENTER);
		add(sauce_,BorderLayout.SOUTH);
		//add(topping_, BorderLayout.SOUTH);
	


		setSize(1000,1000);
		setVisible(true);


		//��ġ

	









	}

	void menuSet(){
		

		



//		for (int i = 0; i <6; i++) {
//			menu[i] = new Food(); //Food�迭 �ȿ��� ���� �ٽ�  menu_list��  price �迭�� �����ǹǷ� �ʱ�ȭ ������Ѵ�. ���������!!!
//			bread[i] = new Food();
//			menu[i].name = menu_list[i];
//			menu[i].price = menu_price[i];
//			bread[i].name = bread_list[i];
//			bread[i].price = bread_price[i];
//			//�޴� �� ���� Ȯ�ο�
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

