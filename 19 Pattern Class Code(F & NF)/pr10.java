//9 B 7 D 5 F 3 H 1

class P10{
	public static void main(String[] args){
		int num = 9;
		char ch = 'A';
		for (int i=1; i<=9; i++){
			if (num%2==1){
				System.out.print(num + "  ");
			}
			else {
				System.out.print( ch + "  ");
			}
 			num--;
			ch++;
		}
	}
}



