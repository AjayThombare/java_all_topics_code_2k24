import java.io.*;
class P32{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter your name : ");
                String name = br.readLine();

                System.out.print("Enter socity name : ");
                String socName = br.readLine();

                System.out.print("Enter wing : ");
                char wing =(char) br.read();

		System.out.println("Name : " + name);
		System.out.println("socName : " + socName);
		System.out.println("wing : " + wing);

                //System.out.print("Enter flatNo : ");
                //int flatNo = Integer.parseInt(br.readLine());
        }
}
