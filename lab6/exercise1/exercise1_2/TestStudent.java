package exercise1.exercise1_2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("student", "hanoi", "java", 4, 50.0);
        System.out.println("Student: " + " name=" + student.getName()
                + " address=" + student.getAddress()
                + " program=" + student.getProgram()
                + " year=" + student.getYear()
                + " fee=" + student.getFee());

        student.setAddress("TPHCM");
        student.setProgram("py");
        student.setFee(100.0);
        student.setYear(3);
        System.out.println(student);
    }
}
