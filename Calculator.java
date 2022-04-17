package week1.day2;

public class Calculator {
	
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
	
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	
	 double multiple(double num1, double num2)
	{
		return num1*num2;
	}
	
     public float divide(float a,float b)	
     {
    	 return a/b;
     }

}
