class DefaultHandling10{
	static void fun(int x, int y){
		System.out.println("Start fun");
		System.out.println(x/y);
		System.out.println("Start fun");
	}
	public static void main(String[] args){
		int x = 10; 
		int y = 2;
		System.out.println("Start Code");
		fun(x,y);
		System.out.println("End Code");
	}
}

