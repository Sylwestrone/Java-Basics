package storage;

import java.util.Random;

/**
 * Created by JSON on 2017-11-06.
 */
public enum EPackage {
    Toy,
    Furniture,
    AGD,
    RTV,
    SomethingElse;

    private static final EPackage[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static EPackage getRandomEPackage(){
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
