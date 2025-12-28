public abstract class Human {
    protected int age;
    protected String fullName;
    protected boolean isJob;

    public Human(int age , String fullName , boolean isJob ){
        this.age = age;
        this.fullName = fullName;
        this.isJob = isJob;
    }
    public int getage(){
        return this.age;
    }
    String getfullName(){
        return this.fullName;
    }
    boolean getisJob (){
        return this.isJob;
    }
    public String dljava(){
        return "I like java";
    }
    public String dlcsharp(){
        return "I like csharp";
    }
    public void setage(int age){
        this.age = age;
    }
    public void setfullName(String FullName){
        this.fullName = fullName;
    }
    public void setJob(boolean isJob){
        this.isJob = isJob;
    }
    public abstract String introduce();
}