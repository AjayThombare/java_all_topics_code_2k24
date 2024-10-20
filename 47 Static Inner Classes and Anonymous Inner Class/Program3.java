class Demo3{
	static int x = 10;
	static void fun(){
		System.out.println("In fun");
	}
}
class Client{
	public static void main(String [] args){
		System.out.println(Demo3.x);
		Demo3.fun();
	}
}

