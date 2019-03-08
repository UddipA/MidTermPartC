/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author uddip
 */
public class TestUserprofile {
    public static void main (String[] args) {
        String name, genre;
        UserProfile profile;
        boolean flag = false;
        
        Scanner input = new Scanner(System.in);
        
        while (flag == false) {
            try {
                System.out.print("Please enter you name: ");
                name = input.nextLine();
                System.out.println();

                System.out.println("Comedy");
                System.out.println("Drama");
                System.out.println("Action");
                System.out.println("Mystery");
                System.out.print("Please enter your favorite genre: ");
                genre = input.nextLine();

                profile = new UserProfile(name, genre);
                flag = true;
            } catch (Exception e) {
                System.out.println("ERROR: There was a problme creating your profile. Please try again.");
            }
        }
        
        System.out.println("Your profile has been successfully created.");
    }
}
