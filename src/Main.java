public class Main{
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman()); 
    }
    
    public static void printEmployee(Employee employee){

        System.out.println(employee.getClass().getCanonicalName());
            if(employee instanceof Manager manager) {
                employee.setName("João");
                manager.setLogin("joao");
                manager.setPassaword("123456");
        
                System.err.println(employee.getName());
                System.err.println(manager.getLogin());
                System.err.println(manager.getPassaword());
            }


    }
} 