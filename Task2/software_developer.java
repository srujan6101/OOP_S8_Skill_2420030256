public class software_developer {
    public static void main(String[] args) {

        // 1. Person's age - byte (-128 to 127)
        byte age = 25;
        System.out.println("Person's age (byte): " + age);

        // 2. Current year - short (-32,768 to 32,767)
        short currentYear = 2025;
        System.out.println("Current year (short): " + currentYear);

        // 3. Population of a country - int (-2 billion to 2 billion)
        int population = 1400000000; // 1.4 billion
        System.out.println("Population of a country (int): " + population);

        // 4. Distance from Earth to Moon in meters - long (very large values)
        long distanceToMoon = 384_400_000L; // in meters
        System.out.println("Distance from Earth to Moon (long): " + distanceToMoon + " meters");

        // 5. Value of Pi - float (7 decimal digits of precision)
        float pi = 3.1415927f; // must add 'f' at the end
        System.out.println("Value of Pi (float): " + pi);

        // 6. Acceleration due to gravity - double (more precision than float)
        double gravity = 9.80665;
        System.out.println("Acceleration due to gravity (double): " + gravity + " m/s²");

        // 7. Student’s grade - char (single character)
        char grade = 'A';
        System.out.println("Student’s grade (char): " + grade);

        // 8. Is Java fun to learn? - boolean (true or false)
        boolean isJavaFun = true;
        System.out.println("Is Java fun to learn? (boolean): " + isJavaFun);
    }
}
