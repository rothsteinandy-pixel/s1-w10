public class Student{
    private String myClub;
    private String myName;
public  Student(String c, String n){
    myClub = c;
    myName = n;
}
public String getClub(){
    return myClub;

}
public String getName(){
    return myName;
}
public boolean isSameClub(Student Other){
    return this.myClub.equals(Other.myClub);
}
    
}