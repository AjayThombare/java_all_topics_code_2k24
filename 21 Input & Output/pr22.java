import java.io.*;
class P22{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String name = br.readLine();
                System.out.println("Name : " + name);
                //br.close ();
                String compName = br.readLine();
                System.out.println("CompanyName : "+ compName);
        }
}	
