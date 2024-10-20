class Demo17{
	int x = 10;
	Demo17(){
		this();
		System.out.println("In no-args Constructor");
	}
	Demo17(int x){
		System.out.println("In para-1 Constructor");
	}
	Demo17(int x, int y){
		System.out.println("In para-2 Constructor");
	}
	public static void main(String [] args){
		Demo17 obj = new Demo17();
	}
}

