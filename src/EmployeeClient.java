public class EmployeeClient extends Employee {

    public static void main(String[] args) {
        Lawyer lawyer = new Lawyer();
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        HarvardLawyer harvardLawyer = new HarvardLawyer();
        printEmployee(lawyer);
        System.out.println();
        printEmployee(softwareEngineer);
        System.out.println();
        printEmployee(harvardLawyer);
    }

    public static void printEmployee(Employee employee) {
        System.out.println(employee.toString());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Hours: " + employee.getHours());
        System.out.println("Vacation Days: " + employee.getVacationDays());
        System.out.println("Vacation Form: " + employee.getVacationForm());
        if (employee instanceof SoftwareEngineer) {
            ((SoftwareEngineer) employee).writeCode();
        }
    }
}

