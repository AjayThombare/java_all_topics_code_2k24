import java.util.*;
class Demo18{
	static void fun(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start fun");
		System.out.println("Enter value for x");
		int x = sc.nextInt();

		System.out.println("Enter value for y");
		int y = sc.nextInt();

		try{
			System.out.println(x/y);
		}catch(ArithmeticException e){
			System.out.println("Enter value for y again");
			y = sc.nextInt();
			try{
				System.out.println(x/y);
			}catch(ArithmeticException er){
				System.out.println("Ye vedya");
			}
		}
		System.out.println("End fun");

	}
	public static void main(String [] args){
		System.out.println("Start main");
		fun();
		System.out.println("End main");
	}
}


