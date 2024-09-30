class Demo8{
	static void fun(){
		System.out.println("In fun");
	}
	public static void main(String [] args){
		
		// first
		Demo8 obj = new Demo8();
		obj.fun();

		// Second
		fun();
		
		// third
		Demo8.fun();
	}
}

