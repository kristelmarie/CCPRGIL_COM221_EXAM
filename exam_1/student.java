public class student {

    String surname;
    String firstName;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;


    // Character method
    public void sayMyName() {
        System.out.println("Hello my name is " + firstName + surname);
    }
    
    public void sayMyStudentNumber() {
        System.out.println("Hello my student number is " + studentNumber);
    }

    public void sayMyEmailAddress() {
        System.out.println("Hello my Email Address is " + studentEmailAddress);
    }

    /**
     * 
     */
    public void amIAwesome() {
        System.out.println("Am I awesome? " + iAmAwesome);
    }


}
