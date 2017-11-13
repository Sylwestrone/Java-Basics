import domain.Package;
import storage.EPackage;
import storage.Storage;

public class Main {

    public static void main(String[] args) {
        Storage s = new Storage(2, 2, 2);
        s.fillStorageRandomPackages();
        s.addPackage(0,0, new Package(1, EPackage.Furniture));
        s.addPackage(0,0, new Package(1, EPackage.SomethingElse));

    }
}
