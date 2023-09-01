public class partTimeEmployee extends employee{




    public partTimeEmployee(int id, String name, int workedhours, int hourlyRate) {
        super(id, name, workedhours, hourlyRate);
    }

    public partTimeEmployee(){

    }


    @Override
    public double calculateSalary() {
        return super.getWorkedhours()*super.getHourlyRate();
    }

    @Override
    public String toString() {
        return "partTimeEmployee{" +
                "Id="+getId()+ " "+
                "Name=" +getName()+" "+
                " workedHours=" + getWorkedhours()+
                ", hourlyRate=" + getHourlyRate() +
                ", salary=" + calculateSalary()+
                '}';
    }
}
