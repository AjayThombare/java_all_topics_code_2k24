import java.io.*;
class P34{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter your name : ");
                String name = br.readLine();

                System.out.print("Enter socName : ");
                String socName = br.readLine();

                System.out.print("Enter wing : ");
                char wing = (char) br.read();

                System.out.print("Enter flatNo : " );
                int flatNo = Integer.parseInt(br.readLine());

                System.out.println("name : " + name);
                System.out.println("socName : " + socName);
                System.out.println("wing : "+ wing);
                System.out.println("flatNo : " + flatNo);
        }
}
