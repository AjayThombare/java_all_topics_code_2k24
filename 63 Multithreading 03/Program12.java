class ThreadExcep extends Thread{
	public void run(){
		System.out.println("In run");
		System.out.println(10/0);
	}
}
class Client12{
	public static void main(String [] args){
		ThreadExcep t1 = new ThreadExcep();
		t1.start();
		System.out.println(10/0);
	}
}

	
