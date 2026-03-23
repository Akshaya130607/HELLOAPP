public class HelloMultipleNameApp {

    public static void main(String[] args) {

        // Check if names are provided
        if (args.length > 0) {

            // Loop through all names
            for (String name : args) {
                System.out.println("Hello " + name);
            }

        } else {
            // Default case
            System.out.println("Hello World");
        }
    }
}
