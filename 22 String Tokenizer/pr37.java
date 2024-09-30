
import java.util.*;
class P37{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter your name : ");
                String name = sc.next();

                System.out.print("Enter socName : ");
                String socName = sc.next();

                System.out.print("Enter wing : ");
                char wing = sc.next().charAt(0);

                System.out.print("Enter flatNo : " );
              	int flatNo = sc.nextInt();

                System.out.println("name : " + name);
                System.out.println("socName : " + socName);
                System.out.println("wing : "+ wing);
                System.out.println("flatNo : " + flatNo);
        }
}
