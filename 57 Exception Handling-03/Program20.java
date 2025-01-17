import java.util.*;
class Demo20{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		try{
			x = sc.nextInt();
			y = sc.nextInt();
		}catch(Exception e){
			System.out.println("Input mismatch");
		}
		try{
			System.out.println(x/y);
		}catch(Exception e){
			System.out.println("Zero division error");
		}
		System.out.println("End main");
	}
}

