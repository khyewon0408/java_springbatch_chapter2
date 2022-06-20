package ch05;

public class orderInfo {

	String orderNo ;
	String phonNumber;
	String addr;
	String date;
	String orderTime;
	int price;
	String menuNumber;
	
	public  orderInfo() {}
	public String showOrderInfo(String orderNo,String phonNumber,String addr,
			String date,String orderTime,int price,String menuNumber) {
		
		return  "주문 접수 번호 :"+ orderNo 
				+"/n 주문 핸드폰 번호 :"+ phonNumber
				+"/n 주문 집 주소 : "+addr
				+"/n 주문 날짜 : "+date
				+"/n 주문 시간 : "+orderTime
				+"/n 주문 가격 : "+price
				+"/n 메뉴 번호 : "+menuNumber;
	}
}
