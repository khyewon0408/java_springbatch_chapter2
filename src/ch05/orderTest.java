package ch05;

public class orderTest {

	public static void main(String[] args) {
		humanInfo tomas = new humanInfo();
		
		tomas.height =180;
		tomas.weight =78;
		tomas.gender = "남성";
		tomas.name = "Tomas";
		tomas.age = 37;
		
		tomas.showHumanInfo();
		
		
		orderInfo order = new orderInfo();
		
		order.orderNo = "202011020003";
		order.phonNumber ="01023450001";
		order.addr = "서울시 강남구 역삼동 111-333";
		order.date ="20201102";
		order.orderTime ="130258";
		order.price =35000 ;
		order.menuNumber= "0003";
		
		order.showOrderInfo();
	}

}
