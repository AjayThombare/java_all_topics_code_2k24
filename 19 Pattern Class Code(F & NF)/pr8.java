//A 2 C 4 E 6 G 8 I

class P8{
	public static void main(String[] args){
		int num = 1;
		for (int i=1; i<=9; i++){
			if (num%2==0){
				System.out.print(num+ "  ");
				num++;
			}
			else{
				System.out.print((char) (num+64) + "  ");
				num++;
			}
			//num++;
		}
	}
}


