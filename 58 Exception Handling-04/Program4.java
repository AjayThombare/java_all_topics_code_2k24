import java.io.*;
class Demo4{
	void fun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			br.close();
		}catch(IOException e){}

		String str = null;
		try{
			str = br.readLine();
		}catch(IOException ieo){
			System.out.println(ieo);
		}
		System.out.println(str);
	}
	public static void main(String [] args){
		Demo4 obj = new Demo4();
		obj.fun();
	}
}



