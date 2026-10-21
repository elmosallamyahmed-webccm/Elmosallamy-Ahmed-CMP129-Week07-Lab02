import java.util.Scanner;
public class StudentTest {

    public static void main(String[] args) {
        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        Scanner sushi = new Scanner(System.in);
        System.out.print("What is the name of the student? ");
        String name = sushi.nextLine();
        System.out.printf("How old is %s? ", name);
        System.out.println();
        int age = sushi.nextInt();
        sushi.nextLine();
        MutableStudent student1 = new MutableStudent(name, age);
        // TODO: Display the student's original information.
        System.out.println("Original Student Name and Age ");
        student1.displayInfo();
        // TODO: Use the setter methods to change the student's data.
        System.out.print("What would you like to change the name of the student to?  ");
        name = sushi.nextLine();
        student1.setName(name);
        System.out.print("What would you like to change the age of the student to? ");
        age = sushi.nextInt();
        sushi.nextLine();
        student1.setAge(age);
        // TODO: Display the student again.
        // Question: Did the SAME object change? yes because it uses the setter of that object
        System.out.println("Updated Student Name and Age");
        student1.displayInfo();
        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        System.out.println("Immutable Student");
        System.out.print("What is the name of the immutable student? ");
        name = sushi.nextLine();
        System.out.printf("How old is %s? ", name);
        System.out.println();
        age = sushi.nextInt();
        sushi.nextLine();
        ImmutableStudent student2 = new ImmutableStudent(name, age);
        // TODO: Display the student's information.
        System.out.println("Original Immutable Student Name and Age");
        student2.displayInfo();
        System.out.print("What is the name of the second immutable student? ");
        name = sushi.nextLine();
        System.out.printf("How old is %s? ", name);
        System.out.println();
        age = sushi.nextInt();
        sushi.nextLine();
        ImmutableStudent student3 = new ImmutableStudent(name, age);
        System.out.println("First Immutable Student Name and Age");
        student2.displayInfo();
        System.out.println("Second Immutable Student Name and Age");
        student3.displayInfo();
        sushi.close();
        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods? There are no setter methods and the fields are final
        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable? MutableStudent
        // 2. Which class is immutable? ImmutableStudent
        // 3. What is the biggest difference you noticed? you can change the fields with
        //setters for objects that are mutable while you can not for immutable ojects
    }
}
