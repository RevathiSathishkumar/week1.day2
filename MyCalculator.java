package week1.day2;


public class MyCalculator {
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		int add=cal.add(7, 9, 9);
		System.out.println(add);
		int sub=cal.sub(7, 9);
		System.out.println(sub);
		double multiple=cal.multiple(700.8, 934.88);
		System.out.println(multiple);
		float divide=cal.divide(700f, 900f);
		System.out.println(divide);
	}

	

}
