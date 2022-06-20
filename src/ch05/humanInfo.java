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
		return "키: "+heigt+"/n 몸무게: "+weight +"/n 성별: "+sex
				          +"/n 이름: "+name +"/n 나이: "+age; 
	}
}
