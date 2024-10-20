class Demo{
	int x =10;
	Demo(int x){
		System.out.println("In constructor");
		System.out.println(x);

	}
	void fun(){
		System.out.println(x);
	}
	public static void main(String [] args){
		Demo obj = new Demo(20);
		obj.fun();
	}
}

