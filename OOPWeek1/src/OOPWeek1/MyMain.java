package OOPWeek1;

import java.util.Date;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Hello Drys");
        System.out.println("The date today is " + new Date());

    Student s1 = new Student(1234567, "Mickey", "Mouse");
    Student s2 = new Student(1234568, "Minnie", "Mouse");

	System.out.println(s1.getIdNumber() + " " + s1.getFirstName() + " " + s1.getLastName());
	System.out.println(s2.getIdNumber() + " " + s2.getFirstName() + " " + s2.getLastName());
    System.out.println(s1.getFullName());
    System.out.println(s2.getSortName());
    System.out.println(s1);
    }
}