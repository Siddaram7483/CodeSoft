import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class StudentFileHandler {
        // Method to write student data to a text file
        public static void writeStudentsToFile(List<Student> students, String filename) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                for (Student student : students) {
                    writer.println(student.getName() + "," + student.getRollNumber() + "," + student.getGrade());
                }
                System.out.println("Student data has been successfully written to " + filename);
            } catch (IOException e) {
                System.err.println("Error writing to the file: " + e.getMessage());
            }
        }

        // Method to read student data from a text file
        public static List<Student> readStudentsFromFile(String filename) {
            List<Student> students = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        String name = parts[0];
                        int rollNumber = Integer.parseInt(parts[1]);
                        char grade = parts[2].charAt(0);
                        Student student = new Student(name, rollNumber, grade);
                        students.add(student);
                    }
                }
                System.out.println("Student data has been successfully read from " + filename);
            } catch (IOException e) {
                System.err.println("Error reading from the file: " + e.getMessage());
            }
            return students;
        }

        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("John Doe", 101, 'A'));
            students.add(new Student("Jane Smith", 102, 'B'));

            // Writing student data to a file
            writeStudentsToFile(students, "students.txt");

            // Reading student data from a file
            List<Student> loadedStudents = readStudentsFromFile("students.txt");

            // Displaying loaded student data
            for (Student student : loadedStudents) {
                student.displayDetails();
            }
        }
    }


