// Section 1
public class Variables {
    public static void main(String[] args) {
        int IntegerValue = 12;
        double DoubleValue = 0.1;
        String StringValue = 'Test';
        boolean booleanValue = true;
    }
}

// Section 2
public class operations {
    public static void main(String[] args) {
        int num1 = 25;
        double num2 = 50.5;

        int addNums = num1 + num2;
        int subNums = num1 - num2;
        int multiplyNums = num1 * num2;
        int divideNums = num2  / num1;
        int modulusNums = num2 % num1;

        System.out.println('Addition Value: ' + addNums)
        System.out.println('Subtraction Value: ' + subNums)
        System.out.println('Multiply Value: ' + multiplyNums)
        System.out.println('Divide Value: ' + divideNums)
        System.out.println('Modulus Value: ' + modulusNums)
        
    }
}
// Section 3
public class conditions {
    public static void main(String[] args) {
        int age = 25

        if (age < 18) {
            System.out.println('This person is a minor')
        }

        else if (18 <= age < 30) {
            System.out.println('This person is a young adult')
        }

        else if (30 < age < 60) {
            System.out.println('This person is an adult')
        }

        else if (60 <= age) {
            System.out.println('This person is a senior citizen')
        }
    }
}

// Section 4
public class loops {
    public static void main(String[] args) {
        System.out.println('For loop');
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + ' ');
        }

        System.out.println('While loop');
        int j = 1;
        while (j <= 10) {
            System.out.println(j + ' ');
            j++;
        }
    }
}

// Section 5
public class methods {
    public static void main(String[] args) {
        int year = 2024;
        boolean LeapYearCheck = methods(LeapYear);

        if (LeapYearCheck) {
            System.out.println(year + 'Is a leap year');
        } else {
            System.out.println(year + 'Is not a leap year');
        }

    public static boolean LeapYearCheck(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    }
}

// Section 6
import java.util.scanner;
public class student {
    private int age;
    private String name;
    private String TeacherName;
    private double gpa;

    public student(int age, String name, double gpa) {
        student.age = age;
        student.name = name;
        student.gpa = gpa;
    }

    public void welcome() {
        System.out.println('Welcome, ' + name + '!')
    }

    public void calc_grade(){
        if (gpa >= 3.5) {
            System.out.println(name + "'s grade: A");
        } else if (gpa >= 3.0) {
            System.out.println(name + "'s grade: B");
        } else if (gpa >= 2.0) {
            System.out.println(name + "'s grade: C");
        } else {
            System.out.println(name + "'s grade: D");
        }
    }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.ln);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();

        System.out.print("Enter student GPA: ");
        double studentGPA = scanner.nextDouble();

        Student student1 = new Student(studentAge, studentName, studentGPA);

        student1.welcome();
        student1.calc_grade;
        
        scanner.close();
    }
}

