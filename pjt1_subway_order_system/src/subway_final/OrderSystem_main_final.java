package subway_final;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


class Order_Frame extends JFrame implements ActionListener{

	//���� �ֹ� �޴� �� �ֹ� ���� ����.
	ArrayList<String> order_list = new ArrayList<String> ();
	ArrayList<Integer> price_list = new ArrayList<Integer>();

	//��ư ����
	JButton[] rbMenu = new JButton[6];
	JButton[] rbBread = new JButton[6];
	
	
	
	//textArea ����
	JTextArea ta= new JTextArea(" �ֹ� �޴��� Ȯ���ϼ���"+'\n');
	

	String[] menu_list = {"��","��Ű ������ ","�ν�ƮġŲ","ġŲ�����߳�","��Ż���� ��Ƽ","��Ƽ"};
	int[]  menu_price = {4300,4900,4900,5100,4500,4500};
	String[] bread_list = {"��Ʈ","ȭ��Ʈ","��� ��Ż����","��� ��Ʈ"," �ĸ��� ��������","�÷��귡��"};
	int[]  bread_price = {0,0,300,300,500,700};
	
//	String[] sauce_list = {"��ġ�巹��","�������","����Ʈ ��Ͼ�","��� �ӽ��͵�","����Ʈ ĥ��","�ٺ�ť","��Ż���� �巹��","�ø��� ����"};
//	int[] sauce_price = {0,0,300,400,500,200,0,0};
//	String[] topping_list = {"�����","�丶��","����","�Ǹ�","�Ҷ��Ǵ�","��Ŭ","�ø���","�ƺ�ī��"};
//	int[] topping_price = {0,0,500,400,0,200,300,1000};
	
	int total = 0;
	String result_="";

	//������ �Լ� ����
	public Order_Frame(){
		
		JPanel menu_bread = new JPanel();
		//JPanel sauce_topping = new JPanel();
		JPanel menu_= new JPanel();
		JPanel bread_ = new JPanel();


		menu_.setLayout(new GridLayout(1,6));
		menu_.setSize(100,300);
		bread_.setLayout(new GridLayout(1,6));
		bread_.setSize(100,300);
		menu_bread.setLayout(new GridLayout(2,1));
		menu_bread.add(menu_);
		menu_bread.add(bread_);


		
		for (int i = 0; i < rbMenu.length; i++) {
			//��ü ���� 
			rbMenu[i]=new JButton(menu_list[i],new ImageIcon("src/imgs/menu/"+i+".jpg"));
			rbBread[i]=new JButton(bread_list[i],new ImageIcon("src/imgs/bread/"+i+".jpg"));
			
			//panel ��ġ �߰�. 
			menu_.add(rbMenu[i]);
			bread_.add(rbBread[i]);
			
			rbMenu[i].setVerticalTextPosition(JButton.BOTTOM); //text ��ġ �������� ����
			rbMenu[i].setHorizontalTextPosition(JButton.CENTER); //text ��ġ ������� ����
			rbBread[i].setVerticalTextPosition(JButton.BOTTOM); //text ��ġ �������� ����
			rbBread[i].setHorizontalTextPosition(JButton.CENTER); //text ��ġ ������� ����

		}

		//��ü ��ġ
		setLayout(new GridLayout(2,1));
		add(menu_bread);
		add(ta);
		add(new JScrollPane(ta));


		setSize(1000,500);
		setVisible(true);

	}

	//�̺�Ʈ ����.
	void eventProd() {
		for (int i = 0; i < rbMenu.length; i++) {
			rbMenu[i].addActionListener(this);
			rbBread[i].addActionListener(this);
		}

	}



	@Override
	
	//��ư�� Ŭ���� �� ����, order_list�� price_list�� ������ �߰���.
	
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
		

		ta.setText(" �ֹ� �޴��� Ȯ���ϼ���\n\n");
		
		//��� �� ��������.
		for (int i = 0; i < order_list.size(); i++) {
			String result = order_list.get(i)+" ,���� " +price_list.get(i)+'\n';
			//result_+= result;
			ta.append(result);
			total+=price_list.get(i);
		}
		
		ta.append("�Ѱ����� " +total +"�Դϴ�.");

	}
}

public class OrderSystem_main_final {
	public static void main(String[] args) {

		Order_Frame order=new Order_Frame();
		//order.getOrderList();
		order.eventProd();
	}

}

