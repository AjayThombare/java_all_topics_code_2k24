import java.io.*;
class ExceptionDemo9{
	public static void main(String [] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Age");
		int age = 0;
		try{
			age = Integer.parseInt(br.readLine());
		}catch(IOException ioe){
			System.out.println("Connection Break");
		}catch(NumberFormatException nfe){
			System.out.println("Wrong Input");
		}
		System.out.println("End main");
	}
}

