import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main{
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman()); 
    }
    
    public static void printEmployee(Employee employee){

        System.out.println(employee.getClass().getCanonicalName());
            switch (employee) {
                case Manager manager ->{
                    employee.setCode("123");
                    employee.setName("João");
                    employee.setSalary(5000);
                    manager.setLogin("joao");
                    manager.setPassaword("123456");
                    manager.setCommission(1200);
                    

                    System.out.println(employee.getCode());
                    System.out.println(employee.getSalary());
                    System.out.println(employee.getName());
                    System.out.println(manager.getLogin());
                    System.out.println(manager.getPassaword());
                    System.out.println(manager.getFullSalary());
                }
                case Salesman salesman -> {
                    salesman.setCode("456");
                    salesman.setName("Lucas");
                    salesman.setSalary(2800);
                    salesman.setPercentPerSold(10);

                    System.out.println(salesman.getCode());
                    System.out.println(salesman.getName());
                    System.out.println(salesman.getSalary());
                    System.out.println(salesman.getPercentPerSold());
                }
            }

    }
} 