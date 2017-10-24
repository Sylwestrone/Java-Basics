package factory.factoryImplementation;

import com.company.Main;
import domain.Person;
import factory.IFactory;

/**
 * Created by JSON on 2017-10-23.
 */
public class CSVFactory implements IFactory {
    @Override
    public String getName() {
        return  Main.person.getName();
    }

    @Override
    public void setName(String name) {
        Main.person.setName(name);
    }

    @Override
    public int getAge() {
        return Main.person.getAge();
    }

    @Override
    public void setAge(int age) {
        Main.person.setAge(age);
    }

    @Override
    public String getCity() {
        return Main.person.getCity();
    }

    @Override
    public void setCity(String city) {
        Main.person.setCity(city);
    }

    @Override
    public String getStreet() {
        return Main.person.getStreet();
    }

    @Override
    public void setStreet(String street) {
        Main.person.setCity(street);
    }
}
