//Matthew Maloof Tues 9AM
public class Lawyer extends Employee{
    public int getVacationDays(){
        return super.getVacationDays()+5;
    }
    public String getVacationForm(){
        return "Pink";
    }
    public void sue(){
        System.out.println("I'll see you in court!");
    }
    public String toString(){
        return "Lawyer:";
    }
}
