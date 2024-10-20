class Demo{
	void fun(int x){
		System.out.println("In-int");
	}

	void fun(char x){
		System.out.println("fun-int");
	}
	void fun(float x){
		System.out.println("Fun-int");
	}
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun();

	}
}



