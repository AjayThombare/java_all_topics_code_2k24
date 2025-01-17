import java.io.*;
class Demo11{
	void fun()throws InterruptedException, IOException{
		System.out.println("In fun");
	}
	public static void main(String [] args)throws InterruptedException,IOException{
		Demo11 obj = new Demo11();
		obj.fun();
	}
}

