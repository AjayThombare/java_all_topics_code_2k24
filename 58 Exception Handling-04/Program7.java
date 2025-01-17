import java.io.*;
class Demo7{
	void fun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			br.close();
		}catch(IOException obj){}
			String str = null;
			try{
				str = br.readLine();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			System.out.println(str);
	}
	public static void main(String [] args){
		Demo7 obj = new Demo7();
		obj.fun();
	}
}


		
