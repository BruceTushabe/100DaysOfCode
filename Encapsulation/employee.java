package Encapsulation;

public class employee {

    // Encapsulation in action
    private String name;
    private int Id;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return salary;
}

    public void setSalary(int salary) {
        this.salary = salary;
    }
}