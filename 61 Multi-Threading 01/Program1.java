class ThreadDemo1 extends Thread{
	public static void main(String [] args){
		System.out.println(Thread.currentThread().getName());
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}
}

