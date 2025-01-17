import java.io.*;
class Demo{
	void fun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun();
	}
}

