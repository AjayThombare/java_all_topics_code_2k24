class Demo1{
	void fun(){
		System.out.println(10/0);
	}
	public static void main(String [] args){
		Demo1 obj = new Demo1();
		obj.fun();
	}
}

