import java.io.*;
class P28{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter your name : ");
                String name = br.readLine();
		
		br.close();

                System.out.print("Enter society name : ");
                String socName = br.readLine();

                System.out.print("Enter wing : ");
                String wing = br.readLine();

                System.out.print("Enter flatNo : ");
                String flatNo = br.readLine();
        }
}

