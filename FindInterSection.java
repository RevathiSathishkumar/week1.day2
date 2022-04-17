package week1.day2;

public class FindInterSection {
	
	public static void main(String[] args) {
		
		int[] number1= {3,0,8,5,9};
		int[] number2= {3,2,7,5,9};
		
		int length1 =number1.length;
		System.out.println(length1);
		
		int length2 =number2.length;
		System.out.println(length2);
		
		for (int i=0;i<length1;i++)
		{
			
			for (int j=0;j<length2;j++)
			{
				if(number1[i]==number2[j])
				{
					System.out.println(number1[i]);
				}
			}

		}				
		
	}

}
