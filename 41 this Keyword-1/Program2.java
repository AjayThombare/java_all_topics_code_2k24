class Demo{
	int x = 10;
	Demo(){
		System.out.println("In no-args Constructor");
	}
	Demo(int y){
		System.out.println("Parameterized Constructor");
	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
	}
}

