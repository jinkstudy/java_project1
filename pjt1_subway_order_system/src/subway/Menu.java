package subway;

public class Menu {
	 Food[] menu =new Food[6];
	 Food[] bread = new Food[6];
	 Food[] sauce = new Food[9];	
	 Food[] topping = new Food[9];	
	 String[] orderList; 

	//PizzaStore ������ ���� �� �޴� �� ���� �ʱ�ȭ.
	public Menu(){

		String[] menu_list = {"��","��Ű ������ ","�ν�ƮġŲ","ġŲ�����߳�","��Ż���� ��Ƽ","��Ƽ"};
		int[]  menu_price = {4300,4900,4900,5100,4500,4500};
		String[] bread_list = {"��Ʈ","ȭ��Ʈ","��� �� Ż����","��� ��Ʈ"," �ĸ��� ��������","�÷��귡��"};
		int[]  bread_price = {0,0,300,300,500,700};
		String[] sauce_list = {"��ġ�巹��","�������","����Ʈ ��Ͼ�","��� �ӽ��͵�","����Ʈ ĥ��","�ٺ�ť","��Ż���� �巹��","����","�ø��� ����"};
		int[] sauce_price = {0,0,300,400,500,200,0,0,0};
		String[] topping_list = {"�����","����","�丶��","��Ŭ","����","�Ҷ��Ǵ�","�Ǹ�","�ø���","�ƺ�ī��"};
		int[] topping_price = {0,0,500,400,0,200,0,0,1000};
		
		

		for (int i = 0; i <6; i++) {
			menu[i] = new Food(); //Food�迭 �ȿ��� ���� �ٽ�  menu_list��  price �迭�� �����ǹǷ� �ʱ�ȭ ������Ѵ�. ���������!!!
			bread[i] = new Food();
			menu[i].name = menu_list[i];
			menu[i].price = menu_price[i];
			bread[i].name = bread_list[i];
			bread[i].price = bread_price[i];
			//�޴� �� ���� Ȯ�ο�
			//System.out.println(menu[i].name+ "      "+ menu[i].price);
			//System.out.println(bread[i].name+ "      "+ bread[i].price);
		
		}
		for (int i = 0; i < sauce_price.length; i++) {
			sauce[i] = new Food();
			topping[i] = new Food();
			sauce[i].name = sauce_list[i];
			sauce[i].price = sauce_price[i];
			topping[i].name = topping_list[i];
			topping[i].price = topping_price[i];
			
			System.out.println(sauce[i].name+ "      "+ sauce[i].price);
			System.out.println(topping[i].name+ "      "+ topping[i].price);
		}
		
		System.out.println();
		
	}

//	public Food[] getMenu() {
//		return menu;
//	}
//
//	public void setMenu(Food[] menu) {
//		this.menu = menu;
//	}
//
//	public Food[] getBread() {
//		return bread;
//	}
//
//	public void setBread(Food[] bread) {
//		this.bread = bread;
//	}
//
//	public Food[] getSauce() {
//		return sauce;
//	}
//
//	public void setSauce(Food[] sauce) {
//		this.sauce = sauce;
//	}
//
//	public Food[] getTopping() {
//		return topping;
//	}
//
//	public void setTopping(Food[] topping) {
//		this.topping = topping;
//	}
//
//	public String[] getOrderList() {
//		return orderList;
//	}
//
//	public void setOrderList(String[] orderList) {
//		this.orderList = orderList;
//	}
}
