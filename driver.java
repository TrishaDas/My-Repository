/**
 * Created by user on 14/09/2015.
 */
public class driver
{
    private String name;
    private int age;
    private String country;
    public driver(String name,int age,String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }
    public driver(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public driver()
    {

    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    public void print()
    {
        System.out.println(name+"   Age:"+age+"   Country:"+country);
    }

}
