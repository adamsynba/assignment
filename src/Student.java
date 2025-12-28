public final class Student extends Human implements IStudyable {

    private String univ;
    private float gpa;
    public static int studCount;

    private final int studentId;

    public Student(int age, String fullName, boolean job,String univ, float gpa, int studentId){
        super(age, fullName, job);
        this.univ = univ;
        this.gpa = gpa;
        this.studentId = studentId;
        studCount++;
    }

    public String getUniv(){
        return univ;
    }

    public float getGpa(){
        return gpa;
    }

    public void setUniv(String univ){
        this.univ = univ;
    }

    public void setGpa(float gpa){
        this.gpa = gpa;
    }

    public final String showId(){
        return "Student ID: " + studentId;
    }

    @Override
    public String introduce() {
        return "I'm student: " + fullName;
    }

    @Override
    public String study() {
        return "Student is studying";
    }

    @Override
    public String getUniversityInfo() {
        return "University: " + univ + ", GPA = " + gpa;
    }
}