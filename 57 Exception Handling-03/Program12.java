import java.io.*;
class Demo12{
	void fun()throws InterruptedException, IOException, ArithmaticException{
		System.out.println("In fun");
	}
	public static void main(String [] args)throws InterruptedException,IOException{
		Demo12 obj = new Demo12();
		obj.fun();
	}
}

// ArithmaticException (Runtime exception he tevhach fekl jato jeva runtime la exception yenyache chance ahet nahitar nahi pn compiler time exception aapn throws karu shakto);;; 
