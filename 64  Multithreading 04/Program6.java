class FuncClass{
	void fun(){
		System.out.println("in fun");
	}
	void gun(){
		System.out.println("in gun");
	}
}
class Demo extends Thread{
	public void run(){
		System.out.println("In rnu-Demo");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo extends Thread implements Runnable{
	public void run(){
		System.out.println("In rnu-ThreadDemo");
		System.out.println(Thread.currentThread().getName());
	}
}
class Client6{
	public static void main(String [] args){
		ThreadDemo obj = new ThreadDemo();
		Thread t1 = new Thread(obj);
		t1.start();

		Demo obj2 = new Demo();
		obj2.start();
	}

}





