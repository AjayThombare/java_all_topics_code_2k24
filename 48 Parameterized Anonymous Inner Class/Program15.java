class Demo15{
	void fun(){
		System.out.println("In fun");
	}
}
class Outer15{
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun();
	}
}

