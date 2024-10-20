class Demo{
	int x = 10;
	int y = 20;
	Demo(){
		this(30);
		System.out.println("Constructor-1");
	}
	Demo(int x){
		this();
		System.out.println("Constructor-2");
	}
	public static void main(String [] args){
		Demo obj = new Demo();
		Demo obj1 = new Demo();
	}
}



