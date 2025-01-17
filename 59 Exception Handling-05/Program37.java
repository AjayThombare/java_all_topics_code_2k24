import java.io.*;
class MyException extends Exception{
	MyException(String str){
		super(str);
	}
}
class Demo37{
	public static void main(String [] args){
		try{
			throw new MyException("Swatahche Exception");
		}catch(MyException ioe){
			ioe.printStackTrace();
		}
	}
}

