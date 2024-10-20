class Parent37{
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child37 extends Parent37{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Demo37{
	void fun(Parent37 obj){
		obj.marry();
	}
	void fun(Child37 obj){
		obj.marry();
	}
}
class Outer37{
	public static void main(String [] args){
		Demo37 obj = new Demo37();
		Parent37 p = new Parent37(){
			void marry(){
				System.out.println("Dipika");
			}
		};
		obj.fun(p);
	}
}



