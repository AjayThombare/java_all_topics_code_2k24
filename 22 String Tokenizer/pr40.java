//  STRING TOKENIZER 
//

import java.util.*;
class P40SL{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter player info : ");
		String info = sc.nextLine();

		StringTokenizer st = new StringTokenizer(info, " ");
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		String str3 = st.nextToken();
		String str4 = st.nextToken();

		System.out.println("Player name : "+ str1);
		System.out.println("JerNo : "+ str2);
		System.out.println("Avg : " + str3);
		System.out.println("Grade : " + str4);
	}
}



