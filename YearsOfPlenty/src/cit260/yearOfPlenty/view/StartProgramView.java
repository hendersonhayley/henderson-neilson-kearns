/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Darren
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage="\nPlease enter your name: ";
        //Display the banner when view created.
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n**********************************************"
              + "\n*                                            *"
              + "\n* This is the game of Year of Plenty         *"
              + "\n* in this game you will feed your people     *"
              + "\n* and keep the pharaoh happy or face the     *"
              + "\n* consequences.                              *"
              + "\n*                                            *"
              + "\n**********************************************"
  
        );
    }

    public void displayStartProgramView() {
        /*displayView(): void
        BEGIN
        do
            Prompt for and get the input value
            if (value == “Q”) then
                return

            do requested action and display the next view
        
        while the view is not done
        END */
        
        String playerName = this.getPlayerName();
        GameControl.createPlayer(playerName);
        
        GameControl.createCrops();
        
        System.out.println("\n\n\n\n");
        System.out.println(playerName + ", you have been appointed overseer for your");
        System.out.println("village. Tread carefully, if your people are not fed well");
        System.out.println("you may lose your head.");
        
        displayNextView();
    }
    public static void displayNextView() {
        //System.out.println("\n *** displayNextView() called *** \n");
        MainMenuView.displayMainMenu();
        //control returns to this point when user exits to main menu
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String playerName = ""; //value to be returned
        
        do {
            System.out.println("\n" + this.promptMessage);
            
            playerName = keyboard.nextLine(); //get next line typed on keyboard
            playerName = playerName.trim(); //trim off leading and trailing blanks
            
            if (playerName.length() < 2) { //must have at least 2 characters
                System.out.println("\nInvalid input: name must be at least 2 characters");
            }
        } while (playerName.length() < 2);
        
        return playerName;
    }
    
}