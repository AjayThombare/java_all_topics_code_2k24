class Demo14{
	static void fun()throws ArithmeticException{
		System.out.println(10/0);
	}
	public static void main(String [] args){
		System.out.println("Start main");
		fun();
		System.out.println("End main");
	}
}

