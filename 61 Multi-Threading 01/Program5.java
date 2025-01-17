class ThreadDemo5 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++){
			System.out.println("In run");
		}
	}
	public static void main(String [] args)throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		ThreadDemo5 t1 = new ThreadDemo5();
		t1.start();
		for(int i=1; i<=500; i++){
			System.out.println("Before Sleep");
		}
		for(int i=1; i<=500; i++){
			System.out.println("in main");
		}
	}
}



