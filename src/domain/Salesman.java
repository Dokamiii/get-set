package domain;
public non-sealed class Salesman extends Employee{
    
    
    private double percentPerSold;
    
    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold) {
            super(code, name, address, age, salary);
            this.percentPerSold = percentPerSold;
        }
        
        @Override
        public String getCode(){
            return "SL" + super.getCode();
        
        }

public Salesman(){

}
public double getPercentPerSold() {
    return percentPerSold;
}

public void setPercentPerSold(final double percentPerSold) {
    this.percentPerSold = percentPerSold;
}

@Override
public double getFullSalary() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFullSalary'");
}
}