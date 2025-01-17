class Demo3{
	public static void main(String [] ars){
		System.out.println("Start code");
		try{
			System.out.println(10/0);
		}finally{
			System.out.println("In finally block");
		}
		System.out.println("End code");
	}
}

