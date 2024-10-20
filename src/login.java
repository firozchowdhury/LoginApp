
        import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        // initialized Scanner and varibales 
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        String companyDomain;

    // getting user input
        System.out.println("First name: ");
        firstName = in.nextLine();

        System.out.println("Last name: ");
        lastName = in.nextLine();
        
        System.out.println("Business domain name?");
        companyDomain = in.nextLine();

        // gave the condition, if user input is blank or empty
        if (firstName.equals("") || lastName.equals("")) {
            System.out.println("Error! First and/or last name is missing"); // printing the error message
        } else {
            
            // calling method and storing in the variables
            String formattedEmail = generateEmail(firstName,lastName,companyDomain);
            String formatedUsername = generateUsername(firstName, lastName);

            // Printing the result while lowering case
            System.out.println(formattedEmail.toLowerCase());
            System.out.println(formatedUsername.toLowerCase());
        }
    }

    // initialize the methods
    private static String generateUsername(String fName, String lName) {
        return fName.substring(0, 4 )+ lName.substring(lName.length()- 4);// returning formatted text
    }

    private static String generateEmail(String firstName, String lastName, String companyDomain) {
        return firstName+ "."+ lastName+ "@"+ companyDomain;   // returning formatted text
    }
}


