package Practice;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class ArraySortWithComparable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of test cases : ");
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            System.out.print("Enter ID : ");
            int id = in.nextInt();
            System.out.print("Enter fname : ");
            String fname = in.next();
            System.out.print("Enter cgpa : ");
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname).thenComparing(Student::getId));

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}