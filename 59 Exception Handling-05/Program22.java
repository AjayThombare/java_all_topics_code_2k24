class Demo22 extends RuntimeException{

}
class Client22{
	static void fun(){
		throw new Demo22("Hellow from Demo22");
	}
	public static void main(String [] args){
		fun();
	}
}

