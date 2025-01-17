class ThreadDemo22 extends Thread{
        static Thread mainThread = null;
	public void run(){
        	System.out.println("In run");
              	System.out.println(mainThread.getName());
		System.out.println(getName());                                  
        }
        public static void main(String [] args)throws InterruptedException{
          
   
        }
}
