package game;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DartTest {

    Dart dart = new Dart();

    @BeforeClass
    public static void testInitialization() {
        Dart dart = new Dart();
        assertNotNull(dart);
    }

    @Test
    public void testGetFirstShooterPoints() throws Exception {
        assertEquals(501, dart.getFirstShooterPoints());
    }

    @Test
    public void testGetSecondShooterPoints() throws Exception {
        assertEquals(501, dart.getSecondShooterPoints());
    }

    @Test
    public void testShoot() throws Exception {
        dart.shoot(20, 1, 1);
        assertEquals(481, dart.getFirstShooterPoints());

        dart.shoot(20, 1, 2);
        assertEquals(481, dart.getSecondShooterPoints());

        dart.shoot(20, 3, 2);
        dart.shoot(20, 3, 2);
        dart.shoot(20, 3, 2);
        dart.shoot(20, 3, 2);
        dart.shoot(20, 3, 2);
        dart.shoot(20, 3, 2);
        dart.shoot(20, 3, 2);
        dart.shoot(20, 3, 2);
        dart.shoot(2,1,2);
        dart.shoot(1,1,2);

        dart.shoot(20, 3, 1);
        dart.shoot(20, 3, 1);
        dart.shoot(20, 3, 1);
        dart.shoot(20, 3, 1);
        dart.shoot(20, 3, 1);
        dart.shoot(20, 3, 1);
        dart.shoot(20, 3, 1);
        dart.shoot(20, 3, 1);
        dart.shoot(2,1,1);
        dart.shoot(1,1,1);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testShootTestPointsIllegalArgumentException() {
        dart.shoot(200, 2, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testShootTestMultiplierIllegalArgumentException() {
        dart.shoot(20, 4, 2);
    }


}