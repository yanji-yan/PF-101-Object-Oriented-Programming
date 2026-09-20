public class L9Synchronized {
    private int count = 0;

    // 'synchronized' locks this method for thread safety
    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        L9Synchronized obj = new L9Synchronized();
        obj.increment();
        System.out.println("Count: " + obj.count);
    }
}