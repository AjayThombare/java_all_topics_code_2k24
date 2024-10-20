class Demo{
	int x = 10;
	Demo(Demo this){
		System.out.println("In No-args Constructor");
	}
	Demo(Demo this, int y){
		System.out.println("In parameterized Constructor");
	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
	}
}

