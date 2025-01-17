public class Program4{
	public static void main(String [] args){
		Runnable ref = new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};
		ref.start();
				System.out.println(Thread.currentThread().getName());
	}
}

