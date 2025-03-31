public class Main{
    public static void main(String[] args) {
        Employee manager = new Manager();  

        manager.setName("João");
        manager.setLogin("joao");
        manager.setPassaword("123456");

        System.err.println(manager.getName());
        System.err.println(manager.getLogin());
        System.err.println(manager.getPassaword());
    }

    public static void printEmployee(){

    }
}