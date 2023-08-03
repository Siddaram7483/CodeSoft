public class Student {
        private String name;
        private int rollNumber;
        private char grade;

        // Constructor
        public Student(String name, int rollNumber, char grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }

        // Additional methods
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }

        public static void main(String[] args) {
            // Create a Student object and display details
            Student student1 = new Student("John Doe", 101, 'A');
            student1.displayDetails();
        }
    }


