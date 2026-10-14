public class StudentMain{
    public static void main(String[] args) {
        Student s= new Student("mtb club", "andy");
        Student s1 = new Student("mtb club", "elias");
        System.out.println(s.getClub());
        System.out.println( s.getName());
        System.out.println(s.isSameClub(s1));
        }
}