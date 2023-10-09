import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int choice=s.nextInt();
		int sum=0;
		int product=1;

		switch(choice)
		{
			case 1:
			for (int i = 1; i<=n; i++) {

				sum=sum+i;
				
			}
			System.out.println(sum);
			break;


			case 2:
			for (int i = 1; i<=n; i++) {

				product=product*i;
				
			}
			System.out.println(product);
			break;


			default :
                System.out.println("-1");
		}



	}
}
