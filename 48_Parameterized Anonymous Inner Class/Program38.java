class Parent38{
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child38 extends Parent38{
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Demo38{
	void fun(Parent38 obj){
		obj.marry();
	}
	void fun(Child38 obj){
		obj.marry();
	}
}
class Outer38{
	public static void main(String [ ]args){
		Demo38 obj = new Demo38();
		obj.fun(new Parent38(){
			void marry(){
				System.out.println("Dipika");
			}
		});
	}
}


