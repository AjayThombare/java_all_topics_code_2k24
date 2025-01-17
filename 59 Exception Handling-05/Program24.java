class Demo24 extends RuntimeException{
	Demo24(String str){
		super(str);
	}
}
class Client24{
	static void fun(){
		throw new Demo24("Hello from Demo24");
	}
	public static void main(String  [] args){
		fun();
	}
}

