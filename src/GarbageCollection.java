public class GarbageCollection {
    
    // finalize method called before garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GCExample obj = new GCExample();

        // Make object eligible for garbage collection
        obj = null;

        // Request JVM to run Garbage Collector
        System.gc();
    }
}
