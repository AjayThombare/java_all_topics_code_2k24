class P11{
	public static void main(String[] args){
		int x = -8;	//0000 0110
		int y = 8;	//0000 1000
		System.out.println(x & y);	//0
		System.out.println(x | y);	//14
		System.out.println(x ^ y);	//4
		System.out.println(~x);		//-7
		System.out.println(~y); 	//-9
		System.out.println(x<<2);	//12
		System.out.println(y>>2);
		System.out.println(x>>2);	//
	}
}

