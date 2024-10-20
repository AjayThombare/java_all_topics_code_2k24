class Demo44{
	int x = 10;
	Demo44(int x){
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	void fun(){
		System.out.println(x);
	}
	public static void main(String [] args){
		Demo44 obj1 = new Demo44(20);
		Demo44 obj2 = new Demo44(30);

		System.out.println(obj1.x);
		System.out.println(obj2.x);

		obj1.fun();	// 10
		obj2.fun();	//10
		obj1.x = 50;
		obj1.fun();	//50
		obj2.x = 60;
		obj2.fun();	//10
	}
}


