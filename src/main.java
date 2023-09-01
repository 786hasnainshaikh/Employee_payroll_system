import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        payRollSystem system=new payRollSystem();




      do {
          mainMenu();
          System.out.println("enter the choice");
          int choice = sc.nextInt();
          try{
              if (choice<=0 || choice>=5){
                  System.out.println("invalid choice");
                  throw new IOException();
              }
          }catch (Exception e){
              e.printStackTrace();
          }


          switch (choice){

              case (1):
                  System.out.println("1.FullTime Employee  2.PartTime Employee");
                  choice= sc.nextInt();
                  switch (choice){
                      case (1):
                          fullTimeEmployee fullTimeEmployee=new fullTimeEmployee();

                          System.out.println("enter fulltime employee id");
                          fullTimeEmployee.setId(sc.nextInt());
                          System.out.println("enter fulltime employee name");
                          fullTimeEmployee.setName(sc.next());
                          System.out.println("enter fulltime employee salary");
                          fullTimeEmployee.setSalary(sc.nextInt());

                          system.addEployee(fullTimeEmployee);


                          break;
                      case (2):
                          partTimeEmployee partTimeEmployee=new partTimeEmployee();

                          System.out.println("enter parttime employee id");
                          partTimeEmployee.setId(sc.nextInt());
                          System.out.println("enter parttime employee name");
                          partTimeEmployee.setName(sc.next());
                          System.out.println("enter parttime employee worked hours");
                          partTimeEmployee.setWorkedhours(sc.nextInt());
                          System.out.println("enter parttime employee houraly rate");
                          partTimeEmployee.setHourlyRate(sc.nextInt());

                          system.addEployee(partTimeEmployee);
                          break;

                  } break;
              case (2):
                  System.out.println("enter the id to delete employee");
                  int id = sc.nextInt();
                  system.deleteEmployee(id);
                  break;

              case (3):
                  System.out.println("1. FullTime Employee Update  2. PartTime Employee Update  ");
                  choice= sc.nextInt();
                  switch (choice){
                      case(1):
                          System.out.println("enter the id to update");
                          int empid= sc.nextInt();
                          system.updateEmployeefullTime(empid);
                          break;
                      case (2):
                          System.out.println("enter the id to update");
                          empid= sc.nextInt();
                          system.updateEmployeePartTime(empid);
                          break;

                  }
                  break;
              case (4):
                  system.showEmployee();
                  break;
              case (5):
                  System.exit(0);
                  break;

          }
      } while (true);



    }

    public static void mainMenu(){
        System.out.println("1. ADD EMPLOYEE");
        System.out.println("2. DELETE EMPLOYEE");
        System.out.println("3. UPDATE EMPLOYEE ");
        System.out.println("4. SHOW EMPLOYEE");
        System.out.println("5. EXIT");
    }

}
