import java.io.*;
class Demo3{
	void fun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			br.close();
		}catch(IOException obj){}
		
		String str = null;
		try{
			str = br.readLine();
		}catch(IOException ioe){
			System.out.println("Connection closed");
		}
		System.out.println(str);

	}
	public static void main(String [] args){
		Demo3 obj = new Demo3();
		obj.fun();
	}
}


