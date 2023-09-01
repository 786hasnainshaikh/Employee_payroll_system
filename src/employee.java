public abstract class employee {
    private int id;
    private String name;

    int salary;

    private int workedhours;
    private int hourlyRate;


    public employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public employee(int id, String name, int workedhours, int hourlyRate) {
        this.id = id;
        this.name = name;
        this.workedhours = workedhours;
        this.hourlyRate = hourlyRate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkedhours() {
        return workedhours;
    }

    public void setWorkedhours(int workedhours) {
        this.workedhours = workedhours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    public employee() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
