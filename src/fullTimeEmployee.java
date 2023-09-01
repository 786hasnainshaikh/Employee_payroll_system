public class fullTimeEmployee extends employee{


    public fullTimeEmployee(int id, String name, int salary) {
        super(id, name , salary);
    }

    public fullTimeEmployee(){

    };




    @Override
    public double calculateSalary() {
        return super.salary;
    }


    @Override
    public String toString() {
        return "fullTimeEmployee{" +
                "Id="+getId()+ " "+
                "Name=" +getName()+" "+
                "salary=" + salary + ""+
                '}';
    }
}
