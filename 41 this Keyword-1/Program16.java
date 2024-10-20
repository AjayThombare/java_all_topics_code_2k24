class Demo16{
	int x = 10;
	Demo16(){
		this(10);
		System.out.println("In no-args Constructor");
	}
	Demo16(int x){
		System.out.println("In para-1 Constructor");
	}
	Demo16(int x, int y){
		System.out.println("In para-2 Constructor");
	}
	public static void main(String[] args){
		Demo16 obj = new Demo16();
	}
}

