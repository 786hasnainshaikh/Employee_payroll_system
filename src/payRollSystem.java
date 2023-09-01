import java.util.ArrayList;
import java.util.Scanner;

public class payRollSystem  extends fullTimeEmployee {
    private  ArrayList<employee> employeeArrayList;

    Scanner sc=new Scanner(System.in);

    public payRollSystem(){
         employeeArrayList=new ArrayList<>();
    }


    public  void addEployee(employee employee){
       employeeArrayList.add(employee);
        System.out.println("employee added successfully");
    }

    public  void deleteEmployee(int id){
        employee emp=null;

        for (employee items:employeeArrayList) {
            if (items.getId()==id){
                emp=items;
            }
        }
        if (emp!=null){
            employeeArrayList.remove(emp);
        }
        else {
            System.out.println("employee does not exist");
        }

    }


    public  void showEmployee(){
        for (employee items: employeeArrayList) {
            System.out.println(items);
        }

    }

    public  void updateEmployeefullTime(int id){

        for (employee items: employeeArrayList) {
            if (items.getId()==id){
                System.out.println("enter new name");
                items.setName(sc.next());
                System.out.println("enter the new salary");
                items.setSalary(sc.nextInt());
                System.out.println("updated successfully");

            }
        }
    }

    public void updateEmployeePartTime(int id) {
        for (employee items: employeeArrayList) {
            if (items.getId()==id){
                System.out.println("enter new name");
                items.setName(sc.next());
                System.out.println("enter new hourly rate");
                items.setHourlyRate(sc.nextInt());
                System.out.println("enter new worked hours");
                items.setWorkedhours(sc.nextInt());
                System.out.println("updated successfully");

            }
        }
    }
}
