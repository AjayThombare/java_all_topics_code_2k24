class Demo{
	int x = 10;
	Demo(int x){
		System.out.println(x);
		System.out.println(Demo.this.x);
	}
	class Inner {
		int x = 50;
		Inner(int x){
			System.out.println(x);
			System.out.println(Inner.this.x);
			System.out.println(Demo.this.x);
		}
	}
	public static void main(String [] args){
		Demo obj = new Demo(20);
		Inner obj1 = obj.new Inner(70);
	}
}


