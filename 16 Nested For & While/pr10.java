class P10{
	public static void main(String[] args){
		int x = 1;
		char ch = 'A';
		for (int i=1; i<=2; i++){
			for (int j=1; j<=4; j++){
				System.out.print(x++ + " ");
			}
			System.out.println();
			for (int k=1; k<=4; k++){

				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}


