public class Employee extends Human implements IWorkable, IStudyable {

    private String satisf;
    private float salary;

    public Employee(int age, String fullName, boolean job, String satisf, float salary){
        super(age, fullName, job);
        this.satisf = satisf;
        this.salary = salary;
    }

    public String getSatisf(){
        return satisf;
    }

    public float getSalary(){
        return salary;
    }

    public void setSatisf(String satisf){
        this.satisf = satisf;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    @Override
    public String introduce(){
        return "I'm employee: " + fullName;
    }

    @Override
    public String work(){
        return "Employee is working";
    }

    @Override
    public String getSalaryInfo() {
        return "Salary: " + salary;
    }

    @Override
    public String study() {
        return "Employee also studies";
    }

    @Override
    public String getUniversityInfo() {
        return "Employee studied at university earlier";
    }
}

