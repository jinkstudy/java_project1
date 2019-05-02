package subway;

public class Menu {
	 Food[] menu =new Food[6];
	 Food[] bread = new Food[6];
	 Food[] sauce = new Food[9];	
	 Food[] topping = new Food[9];	
	 String[] orderList; 

	//PizzaStore 생성자 실행 시 메뉴 및 가격 초기화.
	public Menu(){

		String[] menu_list = {"햄","터키 베이컨 ","로스트치킨","치킨데리야끼","이탈리안 비엠티","비엘티"};
		int[]  menu_price = {4300,4900,4900,5100,4500,4500};
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
