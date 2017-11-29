import junit.framework.TestCase;
import org.junit.Assert;

public class SingletonTestCase extends TestCase {
    private static Singleton singleton = null;

    public void setUp() {
        singleton = null;
    }

    public void testUnique() throws InterruptedException {
        Thread threadOne = new Thread(new SingletonTestRunnable());
        Thread threadSecond = new Thread((new SingletonTestRunnable()));

        threadOne.start();
        threadSecond.start();

        threadOne.join();
        threadSecond.join();
    }


    private static class SingletonTestRunnable implements Runnable {

        @Override
        public void run() {
            Singleton s1 = Singleton.getInstance();
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = s1;
                }
            }
            Assert.assertEquals(true, s1 == singleton);
        }
    }

}
