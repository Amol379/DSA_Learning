import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       /* TreeSet<String> ts = new TreeSet<>();
        ts.add(null);
        ts.add("abc");
        System.out.println(ts);*/

        Employee e = new Employee(1,"x");
        Employee e1 = new Employee(2,"b");
        Employee e2 = new Employee(3,"s");
        Employee e3 = new Employee(4,"a");

        List<Employee> a = Stream.of(e,e1,e2,e3).sorted(new EmployeeComparator()).toList();
        System.out.println(a);

    }


}