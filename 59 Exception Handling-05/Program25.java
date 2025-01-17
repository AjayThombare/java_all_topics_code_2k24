class Demo25 extends RuntimeException{
	Demo25(String str){
		super(str);
	}
}
class Client25{
	static void fun(){
		try{
			throw new Demo25("Hellow from Demo25");
		}catch(Demo25 e){
			e.printStackTrace();
		}
	}
	public static void main(String [] args){
		fun();
	}
}

