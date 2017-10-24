package factory;

/**
 * Created by JSON on 2017-10-23.
 */
public interface IFactory {
    public String getName();
    public void setName(String name);
    public int getAge();
    public void setAge(int age);
    public String getCity();
    public void setCity(String city);
    public String getStreet();
    public void setStreet(String street);
}
