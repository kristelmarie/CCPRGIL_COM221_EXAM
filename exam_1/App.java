public class App {
    public static void main(String[] args) throws Exception {
        student Kristel = new student();
        Kristel.surname = " Olaco"; 
        Kristel.firstName = "Kristel Marie";
        Kristel.middleInitial = "P";
        Kristel.dateOfBirth = "October 13, 2003";
        Kristel.studentNumber = 2022104039;
        Kristel.studentEmailAddress = "olacokp@students.national-u.edu.ph";
        Kristel.iAmAwesome = true;
        Kristel.sayMyName();
        Kristel.sayMyStudentNumber();
        Kristel.sayMyEmailAddress();
        Kristel.amIAwesome();
    }
}
