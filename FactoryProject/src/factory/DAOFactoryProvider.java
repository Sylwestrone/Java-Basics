package factory;

import domain.Person;
import factory.factoryImplementation.CSVFactory;
import factory.factoryImplementation.DBFactory;
import factory.factoryImplementation.WSFactory;
import factory.factoryImplementation.XMLFactory;

import java.util.HashMap;

/**
 * Created by JSON on 2017-10-23.
 */
public class DAOFactoryProvider implements IFactory {

    private IFactory instance = null;
    private static HashMap<EInstance, IFactory> zzz;
    private static DAOFactoryProvider factoryProviderInstance = null;

    static {
        zzz = new HashMap<EInstance, IFactory>();
        zzz.put(EInstance.CSV, new CSVFactory());
        zzz.put(EInstance.DBF, new DBFactory());
        zzz.put(EInstance.WSF, new WSFactory());
        zzz.put(EInstance.XML, new XMLFactory());
    }

    public void setSource(EInstance eInstance) {
        instance = zzz.get(eInstance);
    }

    public static DAOFactoryProvider getInstance(){
        if(factoryProviderInstance == null){
            factoryProviderInstance = new DAOFactoryProvider();
        }
        return factoryProviderInstance;
    }

    @Override
    public String getName() {
        return instance.getName();
    }

    @Override
    public void setName(String name) {
        instance.setName(name);
    }

    @Override
    public int getAge() {
        return instance.getAge();
    }

    @Override
    public void setAge(int age) {
        instance.setAge(age);
    }

    @Override
    public String getCity() {
        return instance.getCity();
    }

    @Override
    public void setCity( String city) {
        instance.setCity(city);
    }

    @Override
    public String getStreet() {
        return instance.getStreet();
    }

    @Override
    public void setStreet(String street) {
        instance.setStreet(street);
    }
}
