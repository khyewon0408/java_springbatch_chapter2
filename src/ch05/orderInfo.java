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
		
		System.out.println("�ֹ� ���� ��ȣ: " + orderNo);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + phonNumber);
		System.out.println("�ֹ� �� �ּ�: " + addr);
		System.out.println("�ֹ� ��¥: " + date);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�ֹ� ����: " + price);
		System.out.println("�޴� ��ȣ: " + menuNumber);
	}
}
