import java.util.*;
class Demo19{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		try{
			int x = sc.nextInt();
			int y = sc.nextInt();
		}catch(Exception e){
			System.out.println("Input missmatch");
		}
		try{
			System.out.println(x/y);
		}catch(Exception e){
			System.out.println("Zero division error");
		}
		System.out.println("End main");
	}

}

