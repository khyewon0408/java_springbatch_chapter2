package ch05;

public class humanInfo {

	public int height ;
	public int weight ;
	public String sex ;
	public String name ;
	public int age ;

	public humanInfo() {}
	
	public humanInfo(int height,int weight,String sex,String name,int age) {
		
		this.height = height;
		this.weight = weight;
		this.sex =sex;
		this.name =name;
		this.age =age;
		
	}
	
	public String showHumanInfo(int heigt,int weight,String sex,String name,int age){
		return "Ű: "+heigt+"/n ������: "+weight +"/n ����: "+sex
				          +"/n �̸�: "+name +"/n ����: "+age; 
	}
}
