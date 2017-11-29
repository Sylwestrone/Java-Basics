
public class Singleton {
    private static Singleton instance = null;
    private static boolean firstThread = true;

    int value = 0;

    protected Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            simulateRandomActivity();
            instance = new Singleton();
        }
        return instance;
    }

    private static void simulateRandomActivity() {
        if(firstThread) {
            try {
                Thread.currentThread().sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
