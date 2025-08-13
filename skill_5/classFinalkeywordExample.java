package skill_5;

class FinalKeywordExample {
    // Final variable
    private final int constantValue;

    // Constructor to initialize the final variable
    public FinalKeywordExample(int value) {
        this.constantValue = value;
    }

    // Final method
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        // Demonstrating final variable (initialized in constructor)
        FinalKeywordExample obj = new FinalKeywordExample(100);
        System.out.println("Constant Value: " + obj.constantValue);

        // Demonstrating final method
        obj.displayMessage();

        // Final reference variable pointing to a mutable object
        final StringBuilder str = new StringBuilder("Initial Value");
        
        // Modifying the content of the mutable object
        str.append(" - Modified");
        System.out.println("Modified StringBuilder: " + str);

        // The following line would cause a compile-time error because 
        // the reference 'str' cannot be reassigned.
        // str = new StringBuilder("New Value"); // Uncommenting this line will give an error
    }
}