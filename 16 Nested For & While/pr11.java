class P11{
	public static void main(String[] args){
//		char ch1 = 'A';
//		char ch2 = 'a';
		for (int i=1; i<=2; i++){
			char ch1 = 'A';
			char ch2 = 'a';
			for (int j=1; j<=4; j++){
				System.out.print(ch1++ + " ");
			}
			System.out.println();
			for (int k=1; k<=4; k++){
				System.out.print(ch2++ + " ");
			}
			System.out.println();
		}
	}
}


