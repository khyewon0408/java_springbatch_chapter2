package ch05;

public class orderInfo {

	String orderNo ;
	String phonNumber;
	String addr;
	String date;
	String orderTime;
	int price;
	String menuNumber;
	
	
	public void showOrderInfo() {
		
		System.out.println("주문 접수 번호: " + orderNo);
		System.out.println("주문 핸드폰 번호: " + phonNumber);
		System.out.println("주문 집 주소: " + addr);
		System.out.println("주문 날짜: " + date);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuNumber);
	}
}
