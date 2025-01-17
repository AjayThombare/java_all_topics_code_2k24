class ThreadDemo2 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String [] args){
		System.out.println(Thread.currentThread().getName());
		ThreadDemo2 obj = new ThreadDemo2();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}


