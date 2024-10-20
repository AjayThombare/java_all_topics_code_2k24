class Demo14{
	int x = 10;
	Demo14(){
		System.out.println("In no-args constructor");
	}
	Demo14(int x){
		System.out.println("In para-1 constructor");
	}
	Demo14(int x, int y){
		System.out.println("In para-2 constructor");
	}
	public static void main(String [] args){
		Demo14 obj = new Demo14();
		Demo14 obj1 = new Demo14(10);
		Demo14 obj2 = new Demo14(20,30);
	}
}

