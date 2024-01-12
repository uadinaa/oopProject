package testingFinalProject;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import oop.DatabaseSingleton;
import oop.User;

public class LoginCheck {
	public static void main(String[] args) {
        try {
            // to read from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // to print  
            PrintWriter pw = new PrintWriter(new FileWriter("output.log"), true);

           // Get the user from the database singleton
            DatabaseSingleton database = DatabaseSingleton.INSTANCE;
            User U1 = database.getLoginning();

            // Gets email from terminal
            pw.print("Enter email: ");
            String enteredUsername = br.readLine();

            if (!enteredUsername.equals(U1.getEmail())) {
                pw.println("Invalid login, try again");
            } else {
                // Prompt the user to enter a password
                pw.print("Enter password: ");
                String enteredPassword = br.readLine();

                // Check login using User class method
                if (U1.login(enteredUsername, enteredPassword)) {
                    pw.println("Login successful!");
                } else {
                    pw.println("Invalid password. Login failed.");
                }
            }
            // Close the resources
            br.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

}
