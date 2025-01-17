class ThreadDemo extends Thread{
	ThreadDemo(ThreadGroup tg, String str){
		super(tg,str);
	}


	public void run(){
		System.out.println(Thread.currentThread());
	}
}
public class Program20{
	public static void main(String [] args){
		System.out.println(Thread.currentThread());
	
		ThreadGroup tg = new ThreadGroup("Instgram");

		ThreadGroup subTg1 = new ThreadGroup(tg,"Reels");
		ThreadGroup subTg2 = new ThreadGroup(tg,"Post");

		ThreadDemo t1 = new ThreadDemo(subTg1,"Shashi");
		ThreadDemo t2 = new ThreadDemo(subTg1,"Ashish");
		ThreadDemo t3 = new ThreadDemo(subTg2,"Kanha");
		ThreadDemo t4 = new ThreadDemo(subTg2,"Rahul");
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(tg.getParent().getName());
		System.out.println(tg.activeCount());
		System.out.println(subTg1.getParent().getName());
	}
}


