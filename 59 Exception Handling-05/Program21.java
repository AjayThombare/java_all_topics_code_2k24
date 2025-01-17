class Demo21 extends RuntimeException{

}
class Client21{
	static void fun(){
		throw new Demo21();
	}

	public static void main(String [] args){
		fun();
	}
}

