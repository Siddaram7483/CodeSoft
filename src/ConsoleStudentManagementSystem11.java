import java.util.Scanner;
import java.util.ArrayList;
public class ConsoleStudentManagementSystem11 {
        private static StudentManagementSystem sms;
        private static Scanner scanner;

        public static void main(String[] args) {
            sms = new StudentManagementSystem();
            scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Welcome to Student Management System");
                System.out.println("1. Add Student");
                System.out.println("2. Edit Student");
                System.out.println("3. Search Student");
                System.out.println("4. Display All Students");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addStudent();
                        break;

                    case 2:
                        editStudent();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        sms.displayAllStudents();
                        break;

                    case 5:
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

        private static void addStudent() {
            System.out.println("Adding New Student");
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
        }

        private static void editStudent() {
            System.out.print("Enter roll number of student to edit: ");
            int rollNumberToEdit = scanner.nextInt();
            Student existingStudent = sms.searchStudent(rollNumberToEdit);

            if (existingStudent != null) {
                System.out.println("Editing Student: " + existingStudent.getName());
                System.out.println("1. Edit Name");
                System.out.println("2. Edit Grade");
                System.out.println("3. Back to Main Menu");

                System.out.print("Enter your choice: ");
                int editChoice = scanner.nextInt();

                switch (editChoice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        scanner.nextLine(); // Consume the newline character
                        String newName = scanner.nextLine();
                        existingStudent.setName(newName);
                        System.out.println("Name updated successfully!");
                        break;

                    case 2:
                        System.out.print("Enter new grade: ");
                        char newGrade = scanner.next().charAt(0);
                        existingStudent.setGrade(newGrade);
                        System.out.println("Grade updated successfully!");
                        break;

                    case 3:
                        break;

                    default:
                        System.out.println("Invalid choice. Returning to Main Menu.");
                }
            } else {
                System.out.println("Student with Roll Number " + rollNumberToEdit + " not found.");
            }
        }

        private static void searchStudent() {
            System.out.print("Enter roll number of student to search: ");
            int rollNumberToSearch = scanner.nextInt();
            Student foundStudent = sms.searchStudent(rollNumberToSearch);
            if (foundStudent != null) {
                System.out.println("Student found:");
                foundStudent.displayDetails();
            } else {
                System.out.println("Student not found.");
            }
        }
    }


