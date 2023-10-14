package persondata;

public class StudentDerivationFromPerson {
    public static void main(String[] args) {
        StudentData courseStudent = new StudentData();

        /* Your solution goes here  */
        courseStudent.setName("Smith");
        courseStudent.setAge(20);
        courseStudent.setID(9999);
        int printID = courseStudent.getID();

        courseStudent.printAll();
        System.out.print(", ID: ");
        System.out.print(printID);
        System.out.println();

    }
}

