public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return String.format("%d-%s (%d) с зароботной платой %.2f", id, name, age, salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int compareTo(Employee o){
        if(age<o.getSalary()){
            return -1;
        } else if (age==o.getSalary()) {
            return 0;
        } else{
            return 1;
        }
    }


}