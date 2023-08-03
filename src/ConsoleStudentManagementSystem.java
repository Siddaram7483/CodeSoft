import java.util.Scanner;
public class ConsoleStudentManagementSystem {
        public static void main(String[] args) {
            StudentManagementSystem sms = new StudentManagementSystem();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Welcome to Student Management System");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Search Student");
                System.out.println("4. Display All Students");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        scanner.nextLine(); // Consume the newline character
                        String name = scanner.nextLine();
                        System.out.print("Enter roll number: ");
                        int rollNumber = scanner.nextInt();
                        System.out.print("Enter grade: ");
                        char grade = scanner.next().charAt(0);

                        Student student = new Student(name, rollNumber, grade);
                        sms.addStudent(student);
                        System.out.println("Student added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter roll number of student to remove: ");
                        int rollNumberToRemove = scanner.nextInt();
                        sms.removeStudent(rollNumberToRemove);
                        break;

                    case 3:
                        System.out.print("Enter roll number of student to search: ");
                        int rollNumberToSearch = scanner.nextInt();
                        Student foundStudent = sms.searchStudent(rollNumberToSearch);
                        if (foundStudent != null) {
                            System.out.println("Student found:");
                            foundStudent.displayDetails();
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 4:
                        sms.displayAllStudents();
                        break;

                    case 0:
                        System.out.println("Exiting Student Management System. Goodbye!");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                System.out.println();
            }
        }
    }


