package hashcode;

/**
 * Created by Khach on 04-Aug-18.
 */
public class PersonImplEx {
    private String name;
    private int age;

    public PersonImplEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonImplEx)) return false;

        PersonImplEx that = (PersonImplEx) o;

        if (getAge() != that.getAge()) return false;
        return getName() != null ? getName().equals(that.getName()) : that.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }
}
