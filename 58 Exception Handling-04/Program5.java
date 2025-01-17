import java.io.*;
class Demo5{
	void fun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			br.close();
		}catch(IOException obj){}
		String str = null;
		try{
			str = br.readLine();
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		System.out.println(str);
	}
	public static void main(String [] args){
		Demo5 obj = new Demo5();
		obj.fun();
	}
}


