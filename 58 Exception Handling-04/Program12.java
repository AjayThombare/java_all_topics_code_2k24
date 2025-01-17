import java.io.*;
class Demo12{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		System.out.println("Enter value for x and y");
		try{
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
			System.out.println(x/y);
		}catch(IOException ioe){
			System.out.println("Connection closed");
		}catch(NumberFormatException nfe){
			System.out.println("Wrong Input");
		}catch(ArithmeticException ae){
			System.out.println("Plese enter y value again");
			y = Integer.parseInt(br.readLine());
			System.out.println(x/y);
		}finally{
			System.out.println("Clean Up Code");
		}


		System.out.println("End code");
	}
}



