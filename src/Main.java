/**
 *  Main class for displaying the student's name
 */

public class Main {

    /**
     * Creates a new Student object and passing in "Tristan Lorenzo" as the parameter
     *
     * @param args
     */
    public static void main(String[] args) {
        Student tristan = new Student("Tristan Lorenzo");
        System.out.println(tristan.name);
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
    }
}
