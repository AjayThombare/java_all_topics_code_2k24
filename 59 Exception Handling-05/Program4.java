class Demo4{
	public static void main(String [] args){
		System.out.println("Start code");
		try{
			System.out.println(10/0);
		}catch(ArithmeticException ae){
			System.out.println("In catch block");

		}finally{
			System.out.println("In finally block");
		}
		System.out.println("End code");
	}
}

		


