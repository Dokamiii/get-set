package domain;
public non-sealed class Manager extends Employee {
    public Manager(String code, String name, String address, int age, double salary, String login, String password,
            double commission) {
        super(code, name, address, age, salary);
        this.login = login;
        this.passaword = passaword;
        this.commission = commission;
    }

    @Override
    public String getCode(){
        return "MN" + super.getCode();
    }

    public Manager() {
    }

    private String login;

    private String passaword;

    private double commission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double getFullSalary(){
        return this.salary + this.commission;
    }

    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }
}