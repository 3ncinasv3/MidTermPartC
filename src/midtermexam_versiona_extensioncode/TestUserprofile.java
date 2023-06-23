/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author jv
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your desired username:");
        String userName = input.nextLine();
        System.out.println("\n\nChoose your favorite genre from the following list: ");
        System.out.println("\n\nComedy");
        System.out.println("Drama");
        System.out.println("Action");
        System.out.println("Mystery\n\n");
        String userGenre = input.nextLine();
        UserProfile user1 = new UserProfile(userName, userGenre);
        System.out.println("New User created!");
            
    }
    
}
