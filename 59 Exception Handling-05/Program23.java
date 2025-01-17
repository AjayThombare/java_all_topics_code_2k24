class Demo23 extends RuntimeException{
	Demo23(String str){

	}
}
class Client23{
	static void fun(){
		throw new Demo23("Hello from Demo23");
	}
	public static void main(String [] args){
		fun();
	}
}

