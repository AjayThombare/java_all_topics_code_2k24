class Demo43{
	int x = 10;
	Demo43(int x){
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String [] args){
		Demo43 obj1 = new Demo43(20);
		Demo43 obj2 = new Demo43(30);
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}



