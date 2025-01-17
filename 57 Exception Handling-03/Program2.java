import java.io.*;
class Demo2{
	void fun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer value: x ");
		int x = Integer.parsseInt(br.readLine());

		System.out.println("Enter integer vslue: y");
		int y = Integer.pareseInt(br.readLine());

		System.out.println(x/y);
	}
	public static void main(String [] arga){
		Demo2 obj = new Demo2();
		obj.fun();
	}
}

