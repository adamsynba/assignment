public class Main {
    public static void main(String[] args) {


        Human h1 = new Employee(30, "Azamat", true, "Happy", 2000f);
        System.out.println(h1.introduce());

        Human h2 = new Student(19, "Aliya", false, "AITU", 3.8f, 101);
        System.out.println(h2.introduce());

        System.out.println("----");

        IWorkable worker = new Employee(45, "Dias", true, "Very Happy", 3500f);
        System.out.println(worker.work());
        System.out.println(worker.getSalaryInfo());

        IStudyable studentInt = new Student(21, "Aruzhan", false, "NU", 3.9f, 102);
        System.out.println(studentInt.study());
        System.out.println(studentInt.getUniversityInfo());

        System.out.println("----");

        Employee e = new Employee(25, "Aidar", true, "Good", 2500f);
        System.out.println(e.introduce());
        System.out.println(e.work());
        System.out.println(e.study());
        System.out.println(e.getSalaryInfo());
        System.out.println(e.getUniversityInfo());


        System.out.println("----");

        Student s = new Student(18, "Nursultan", false, "AITU", 3.5f, 103);
        System.out.println(s.introduce());
        System.out.println(s.study());
        System.out.println(s.getUniversityInfo());
        System.out.println(s.showId());

        System.out.println("----");

        System.out.println(Student.studCount);
    }
}