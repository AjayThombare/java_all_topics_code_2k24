class MyThread extends Thread{
	public void run(){
		//System.out.println(Thread.currentThread().getName());
		for(int i=0; i<7; i++){
			System.out.println("In run-MyThread");
		}
	}

}
class Client6{
	public static void main(String [] args){
		MyThread mt1 = new MyThread();  // New/Born- Thread-0
		mt1.start();
		
		MyThread mt2 = new MyThread();   // New/Born- Thread-1
		mt2.start();

		MyThread mt3 = new MyThread();   //New/Born- Thread-2
		mt3.start();
	}
}



	
