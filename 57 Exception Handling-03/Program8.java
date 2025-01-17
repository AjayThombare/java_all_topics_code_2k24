import java.io.*;
class Demo8{
	void fun()throws IOException{
		System.out.println("In fun");
	}
	public static void main(String [] args)throws IOException{
		Demo8 obj = new Demo8();
		obj.fun();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}
}

