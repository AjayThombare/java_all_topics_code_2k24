class Demo implements Runnable{

	public void run(){
		System.out.println("in run");
		System.out.println(Thread.currentThread().getName());
	}
}
class Client2{
	public static void main(String [] args){
		Demo obj = new Demo();
		Thread t1 = new Thread(obj);
		t1.start();

		System.out.println(Thread.currentThread().getName());
	}
}



