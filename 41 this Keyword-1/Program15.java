class Demo15{
	int x = 10;
	Demo15(){
		// this(10);
		System.out.println("in No-args constructor");
	}
	Demo15(int x){
		System.out.println("in para-1 constructor");
	}
	Demo15(int x, int y){
		System.out.println("In para-2 constructor");
	}
	public static void main(String[] args){
		Demo15 obj = new Demo15();
		//Demo15 obj1 = new Demo15();
		//Demo15 obj2 = new Demo15();
	}
}


