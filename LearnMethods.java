package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
			LearnMethods car = new  LearnMethods();
		car.printCarName();
		int getCarNumber=car.getCarNumber();
		System.out.println(getCarNumber);
		String getCarVarient=car.getCarVarient();
		System.out.println(getCarVarient);
		float mulitiplyTwoNumbers=car.mulitiplyTwoNumbers(355f, 435f);
		System.out.println(mulitiplyTwoNumbers);
	}
	public void printCarName() {
		
		System.out.println("BMW");
		}

	public int getCarNumber() {
		return  345672389;
		
	}
	
	public String getCarVarient() {
		return "BMW5series";
	}
	
	public float mulitiplyTwoNumbers(float emimonth, float total) {
		
		return emimonth+total;
		
	}
}
