package exercise1.exercise1_2;

public class TestStaff {
    public static void main(String[] args) {
        Staff staff = new Staff("staff", "hanoi", "hus", 20.00);
        System.out.println("Staff:" + " name=" + staff.getName()
                + " address=" + staff.getAddress()
                + " school=" + staff.getSchool()
                + " pay=" + staff.getPay());

        staff.setPay(30.0);
        staff.setSchool("vnu");
        System.out.println(staff);
    }
}
