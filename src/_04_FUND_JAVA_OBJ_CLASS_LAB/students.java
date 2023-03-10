package _04_FUND_JAVA_OBJ_CLASS_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age
                , String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] arrStudentData = inputLine.split("\\s+");
            String firstName = arrStudentData[0];
            String lastName = arrStudentData[1];
            int age = Integer.parseInt(arrStudentData[2]);
            String town = arrStudentData[3];

            Student currentStudent = new Student(firstName,
                    lastName,age, town);
            studentList.add(currentStudent);
            inputLine = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentList){
            if(item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),
                        item.getLastName(),item.getAge());
            }
        }
    }
}
