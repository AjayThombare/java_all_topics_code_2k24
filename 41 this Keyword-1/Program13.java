class Demo13{
	int x = 10;
	Demo13(){
		System.out.println("In no-args constructor");
	}
	Demo13(int x){
		System.out.println("In para-1 constructor");
	}
	Demo13(int x, int y){
		System.out.println("In para-2 constructor");
	}
	public static void main(String [] args){
		Demo13 obj = new Demo13();
	}
}

