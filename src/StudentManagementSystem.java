import java.util.ArrayList;
public class StudentManagementSystem {
        private ArrayList<Student> students;

        public StudentManagementSystem() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void removeStudent(int rollNumber) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getRollNumber() == rollNumber) {
                    students.remove(i);
                    return; // Exit the method once the student is removed
                }
            }
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }

        public Student searchStudent(int rollNumber) {
            for (Student student : students) {
                if (student.getRollNumber() == rollNumber) {
                    return student; // Return the student if found
                }
            }
            return null; // Return null if student is not found
        }

        public void displayAllStudents() {
            if (students.isEmpty()) {
                System.out.println("No students in the system.");
                return;
            }

            System.out.println("List of all students:");
            for (Student student : students) {
                student.displayDetails();
            }
        }

        public static void main(String[] args) {
            StudentManagementSystem sms = new StudentManagementSystem();

            // Adding students
            Student student1 = new Student("John Doe", 101, 'A');
            Student student2 = new Student("Jane Smith", 102, 'B');
            sms.addStudent(student1);
            sms.addStudent(student2);

            // Display all students
            sms.displayAllStudents();

            // Search for a student by roll number
            int rollNumberToSearch = 101;
            Student foundStudent = sms.searchStudent(rollNumberToSearch);
            if (foundStudent != null) {
                System.out.println("Found student with Roll Number " + rollNumberToSearch + ":");
                foundStudent.displayDetails();
            } else {
                System.out.println("Student with Roll Number " + rollNumberToSearch + " not found.");
            }

            // Remove a student
            int rollNumberToRemove = 102;
            sms.removeStudent(rollNumberToRemove);

            // Display all students after removal
            sms.displayAllStudents();
        }
    }


