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
		
		return  "�ֹ� ���� ��ȣ :"+ orderNo 
				+"/n �ֹ� �ڵ��� ��ȣ :"+ phonNumber
				+"/n �ֹ� �� �ּ� : "+addr
				+"/n �ֹ� ��¥ : "+date
				+"/n �ֹ� �ð� : "+orderTime
				+"/n �ֹ� ���� : "+price
				+"/n �޴� ��ȣ : "+menuNumber;
	}
}
