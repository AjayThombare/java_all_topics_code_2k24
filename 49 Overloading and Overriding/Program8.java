class Demo8{
        /*void fun(int x, int y){
                System.out.println("int-int");
        }*/
        void fun(int x, float y){
                System.out.println("int-float");
        }
        void fun(float x, int y){
                System.out.println("float-int");
        }
        void fun(float x, float y){
                System.out.println("float-float");
        }
        public static void main(String [] args){
                Demo8 obj = new Demo8();
                obj.fun(10, 20);
         
        }
}
