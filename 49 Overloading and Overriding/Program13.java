class Demo13{
	int fun(int x){
		System.out.println("int-float");
		return 10.5;
	}
	void fun(float x){
		System.out.println("float-int");
	}
	public static void main(String [] args){
		Demo13 obj = new Demo13();
	}
}

