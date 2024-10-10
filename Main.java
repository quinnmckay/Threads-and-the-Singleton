public class Main {

    public static void main(String[] args){

        //For RunnableDemo
        /*
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        RunnableDemo R2 = new RunnableDemo("Thread-2");

        R1.start();
        R2.start();
        */

        //For ThreadDemo
        /*
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        ThreadDemo T2 = new ThreadDemo("Thread-2");

        T1.start();
        T2.start();
        */

        //My Singleton part
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new SingletonTest());
            thread.start();
        }
    }
    }

