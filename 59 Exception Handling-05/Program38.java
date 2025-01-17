import java.io.*;
class MyException extends Exception{
	MyException(String str){
		super(str);
	}
}
class Client38{
	public static void main(String [] args){
		try{
			System.out.println(10/0);
			throw new MyException("Swatahache Exception");
		}catch(MyException ioe){
			ioe.printStackTrace();
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}
	}
}

