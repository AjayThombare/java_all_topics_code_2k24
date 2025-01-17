import java.util.*;
class Demo16{
	static void fun(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Start fun");
		try{
			System.out.println(x/y);
		}catch(ArithmeticException e){
			System.out.println("Timbtimba y chi value zero ka dilay?");
		}
		System.out.println("End fun");
	}
	public static void main(String [] args){
		System.out.println("Start main");	
		fun();
		System.out.println("End main");
	}
}


