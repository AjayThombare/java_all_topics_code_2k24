public class Program6{
	public static void main(String [] args){
		Runnable ref = ()->{
			//public void run(){
			//	System.out.println(Thread.currentThread().getName());
			//}
			System.out.println(Thread.currentThread().getName());
		};
		Thread t1 = new Thread(ref);
		t1.start();
				System.out.println(Thread.currentThread().getName());
	}
}

