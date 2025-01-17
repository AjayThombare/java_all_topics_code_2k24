import java.io.*;
class Demo2{
	void fun()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.close();
		String str = null;
		try{
			str = br.readLine();
		}catch(IOException ioe){
			System.out.println("Connection close ahe");
		}
		System.out.println(str);
	}
	public static void main(String [] args)throws IOException{
		Demo2 obj = new Demo2();
		obj.fun();
	}
}


