package subway;

public class Menu {
	private Food[] menu =new Food[6];
	private Food[] bread = new Food[6];
	private Food[] sauce = new Food[9];	
	private Food[] topping = new Food[9];	
	private String[] orderList; 

	//PizzaStore ������ ���� �� �޴� �� ���� �ʱ�ȭ.
	public Menu(){

		String[] menu_list = {"��Ƽ���� ġŲ","��Ű ������ �ƺ�ī��","Ǯ����ũ","���׸���","��Ż���� ��Ƽ","��Ƽ"};
		int[]  menu_price = {5900,6400,5900,4300,5100,5300};
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
			System.out.println(menu[i].name+ "      "+ menu[i].price);
			System.out.println(bread[i].name+ "      "+ bread[i].price);
		
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
}
