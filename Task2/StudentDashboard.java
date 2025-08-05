public class StudentDashboard {
    public static void main(String[] args) {

        // Declaring and initializing student details
        long rollNumber = 2023123456L;      // Unique student roll number
        String name = "Aditi Sharma";       // Full name of the student
        float marks = 85.75f;               // Marks in percentage (float allows decimals)
        char gender = 'F';                  // Gender: 'M' for Male, 'F' for Female, etc.
        boolean isPassed = true;            // Pass/Fail status

        // Displaying the student summary
        System.out.println("===== Student Summary Slip =====");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Gender      : " + gender);
        System.out.println("Marks       : " + marks + "%");
        System.out.println("Status      : " + (isPassed ? "Passed" : "Failed"));
        System.out.println("================================");
    }
}
