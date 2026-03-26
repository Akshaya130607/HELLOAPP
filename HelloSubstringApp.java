// UC6 - Hello App using Enhanced For Loop + substring
// Program Name: HelloSubstringApp
// Description: Displays greeting for multiple names using for-each loop and removes trailing delimiter using substring

public class HelloSubstringApp {

    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length > 0) {

            String combinedNames = "";

            // Build comma-separated names
            for (String name : args) {
                combinedNames += name + ", ";
            }

            // Remove trailing ", "
            combinedNames = combinedNames.substring(0, combinedNames.length() - 2);

            System.out.println("Hello, " + combinedNames + "!");

        } else {
            // Default message
            System.out.println("Hello, World!");
        }
    }
}
