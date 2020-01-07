//Matthew Maloof Tues 9AM
public class HarvardLawyer extends Lawyer {
    public double getSalary(){
        return super.getSalary()*0.20+super.getSalary();
    }
    public int getVacationDays(){
        return super.getVacationDays()+3;
    }
    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
    public String toString(){
        return "Harvard Lawyer:";
    }
}
