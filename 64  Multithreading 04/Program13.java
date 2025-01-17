class ThreadDemo extends Thread{
        public void run(){
                for(int i=0; i<5; i++){
                        System.out.println(getName());
                        try{
                                Thread.sleep(2000);
                        }catch(Exception e){

                        }
                }
        }
}
class Client13{
        public static void main(String [] arsg){
                ThreadDemo obj1 = new ThreadDemo();
                ThreadDemo obj2 = new ThreadDemo();
                ThreadDemo obj3 = new ThreadDemo();

                obj1.start();
                obj2.start();
                obj3.start();
        	obj2.setDaemon(true);
	}
}
