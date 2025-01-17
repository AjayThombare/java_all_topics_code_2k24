class ThreadDemo extends Thread{
	public void run(){
		System.out.println("In run");
	}
}
class Client16{
	public static void main(String [] args){
		System.out.println(Thread.currentThread());
	}
}

