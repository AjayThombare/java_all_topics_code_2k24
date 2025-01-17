import java.io.BufferedReader;
import java.io.InputStreamReader;
class IOExceptionDemo2Demo2{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first Stroing");
		String str = br.readLine();
	}
}

