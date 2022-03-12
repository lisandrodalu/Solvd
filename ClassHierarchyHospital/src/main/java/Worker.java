public class Worker extends Person{
    private long salary;

    public Worker(){

    }
    public Worker(String name, String id, int age, long salary) {
        super(name, id, age);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}