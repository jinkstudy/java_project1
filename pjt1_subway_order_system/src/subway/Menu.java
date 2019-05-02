package subway;

public class Menu {
	private Food[] menu =new Food[6];
	private Food[] bread = new Food[6];
	private Food[] sauce = new Food[9];	
	private Food[] topping = new Food[9];	
	private String[] orderList; 

	//PizzaStore 생성자 실행 시 메뉴 및 가격 초기화.
	public Menu(){

		String[] menu_list = {"로티세리 치킨","터키 베이컨 아보카도","풀드포크","에그마요","이탈리안 비엠티","비엠티"};
		int[]  menu_price = {5900,6400,5900,4300,5100,5300};
		String[] bread_list = {"위트","화이트","허니 이 탈리안","허니 오트"," 파마산 오레가노","플랫브래드"};
		int[]  bread_price = {0,0,300,300,500,700};
		String[] sauce_list = {"렌치드레싱","마요네즈","스위트 어니언","허니 머스터드","스위트 칠리","바베큐","이탈리안 드레싱","후추","올리브 오일"};
		int[] sauce_price = {0,0,300,400,500,200,0,0,0};
		String[] topping_list = {"양상추","양파","토마토","피클","오이","할라피뇨","피망","올리브","아보카도"};
		int[] topping_price = {0,0,500,400,0,200,0,0,1000};
		
		

		for (int i = 0; i <6; i++) {
			menu[i] = new Food(); //Food배열 안에서 각각 다시  menu_list와  price 배열로 구성되므로 초기화 해줘야한다. 까먹지말것!!!
			bread[i] = new Food();
			menu[i].name = menu_list[i];
			menu[i].price = menu_price[i];
			bread[i].name = bread_list[i];
			bread[i].price = bread_price[i];
			//메뉴 및 가격 확인용
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
