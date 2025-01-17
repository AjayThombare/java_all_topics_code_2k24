import java.io.*;
class Demo4{
	void fun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer vlaue: x");
		int x = Integer.parseInt(br.readLine());

		System.out.println("Enter integer value: y");
		int y = Integer.parseInt(br.readLine());

		System.out.println(x/y);
	}
	public static void main(String [] args){
		Demo4 obj = new Demo4();
		obj.fun();
	}
}

