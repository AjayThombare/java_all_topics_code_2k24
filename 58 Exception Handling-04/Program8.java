import java.io.*;
class ExceptionDemo8{
	public static void main(String [] args){
		System.out.println("Start main");
		try{
			System.out.println(10/0);
		}catch(RuntimeException re){
			System.out.println(re);
			System.out.println(re.getMessage());
			re.printStackTrace();
		}
		System.out.println("End main");
	}
}

