public class GarbageCollection {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();

        // Make object eligible for garbage collection
        obj = null;

        // Request JVM to run Garbage Collector
        System.gc();
    }
}
