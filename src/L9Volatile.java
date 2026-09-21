public class L9Volatile {
    // 'volatile' ensures all threads see changes instantly
    private volatile boolean isRunning = true;

    public void stop() {
        isRunning = false; // Updated directly in main RAM
    }

    public static void main(String[] args) {
        L9Volatile obj = new L9Volatile();
        System.out.println("Is running: " + obj.isRunning);
        obj.stop();
        System.out.println("Is running: " + obj.isRunning);
    }
}