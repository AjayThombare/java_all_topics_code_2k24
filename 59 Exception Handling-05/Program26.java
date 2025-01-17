class Demo26 extends RuntimeException{
	Demo26(String str){
		super(str);
	}
}
class Client26{
	static void fun(){
		try{
			throw new Demo26("Hello from Demo26");
		}catch(Demo26 e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String [] args){
		fun();
	}
}

