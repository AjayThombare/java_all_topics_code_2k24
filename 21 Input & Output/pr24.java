import java.io.*;
class P24{
	public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter company name : ");
                String compName = br.readLine();
		System.out.print("Enter employee name : ");
		String empName = br.readLine();
		System.out.print("Enter emplId : ");
		int empId = br.readLine();	//erroe => Strin can't be converted to int ( because in BR readLine he String Ghenyasathi kela jato) 
		System.out.println("Company Name : " + compName);
		System.out.print("Employee Name : " + empName);
                
        }
}
