class ThreadDemo extends Thread{
        public void run(){
                System.out.println(getPriority()+"  3");
                System.out.println(Thread.currentThread().getPriority()+"  4");
        }
}
class Client10{
        public static void main(String [] args){
                System.out.println(Thread.currentThread().getPriority()+"  1");
                ThreadDemo tm = new ThreadDemo();
                System.out.println(tm.getPriority()+"  2");
              	tm.setPriority(7);
	      	tm.start();

		tm.setPriority(11);
        }
}
