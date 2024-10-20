class Demo42{
	int x = 10;
	Demo42(int x){
		System.out.println("In constructor");
		System.out.println(x);	
		System.out.println(this.x);
	}
	public static void main(String [] args){
		Demo42 obj = new Demo42(20);
	}
}


