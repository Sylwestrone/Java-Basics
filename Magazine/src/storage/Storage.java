package storage;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import domain.Package;

import java.util.Objects;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Stack;

/**
 * Created by JSON on 2017-11-06.
 */
public class Storage {
    private int x = 1;
    private int y = 1;
    private int z = 1;

    private Stack<Package> packages[][];

    public Storage() {
        packages = new Stack[x][z];
        initializeAllColumns();
    }

    public Storage(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        packages = new Stack[x][z];
        initializeAllColumns();
    }

    private void initializeAllColumns() {
        for(int row = 0; row < x; ++row){
            for(int col = 0; col < z; ++col){
                packages[row][col] = new Stack<Package>();
            }
        }
    }

    public void fillStorageRandomPackages(){
        Random r = new Random();
        int quantity = r.nextInt(x * y * z) + 1;
        System.out.println("Quantity of packages: " + quantity);
        int tmp = 0;
        for (int i = 0; i < quantity; i++) {
            addPackage(r.nextInt(x), r.nextInt(z), new Package(r.nextInt(Package.MAX_PRIORITY) + Package.MIN_PRIORITY, EPackage.getRandomEPackage() ));
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    private boolean hasHigherPriority(int topPackagePriority, int newPackagePriority) {
        if(topPackagePriority < newPackagePriority) {
            System.out.println("New package has lower priority");
            return false;
        }
        return true;
    }

    private boolean isFullColumn(int posX, int posZ) {
        if(packages[posX][posZ].size() >= y) {
            System.out.println("Column " + posX + "," + posZ + " is full.");
            return true;
        }
        return false;
    }

    public boolean addPackage(int posX, int posZ, Package pack){
        if(isFullColumn(posX, posZ)
                || (!packages[posX][posZ].isEmpty() && !hasHigherPriority(packages[posX][posZ].peek().getPriority(), pack.getPriority()))) {
            return false;
        }
        packages[posX][posZ].push(pack);
        return false;
    }

    public void getStatusOfStorage(){

    }


}
