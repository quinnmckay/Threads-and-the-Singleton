public class SingletonTest implements Runnable{
    @Override
    public void run() {
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        System.out.println("HashCode of Singleton: " + singleton.hashCode());
    }
}
