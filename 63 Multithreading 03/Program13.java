class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run");
		}
	}
}
class Client13{
	public static void main(String [] args){
		ThreadDemo t1 = new ThreadDemo();
		t1.start();

		for(int i=0; i<10; i++){
			System.out.println("In run");
			Thread.sleep(2000);
		}
	}
}
