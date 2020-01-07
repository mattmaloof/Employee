//Matthew Maloof Tues 9AM
public class SoftwareEngineer extends Employee{
    public int getHours(){
        return super.getHours() + 10;
    }
    public double getSalary(){
        return super.getSalary() + 15000;
    }
    public int getVacationDays(){
        return super.getVacationDays()/2;
    }
    public void writeCode(){
        System.out.println("Coding!");
    }
    public String toString(){
        return "Software Engineer:";
    }

}
