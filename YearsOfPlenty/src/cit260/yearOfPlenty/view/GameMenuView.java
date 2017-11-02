/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import java.util.Scanner;

/**
 *
 * @author Brennan.Neilson
 */
public class GameMenuView {
    public static final int MAX = 5;

    static void displayGameMenu() {
        
        Scanner keyboard = new Scanner(System.in);
        int option;
        
        System.out.println( "\n*************************************"
              + "\n*                                   *"
              + "\n*  Main Menu                        *"
              + "\n*                                   *"
              + "\n*  1 - View the map                 *"
              + "\n*  2 - View Lists                   *"
              + "\n*  3 - Move to a new location       *"
              + "\n*  4 - Manage Crops                 *"
              + "\n*  5 - Quit                         *"
              + "\n*                                   *"
              + "\n*************************************"
        );
        
        do {
            System.out.println("Please enter an option.");
            option = keyboard.nextInt();     //get the entered input
            
            if(option<1 || option>MAX){
                System.out.println("Invalid entry, Please choose an option of 1-5.");
            }
            if (option==1){
            MapView.displayMapView();
            }
            else if (option==2){
            ListView.displayListView();
            }
            else if (option==3){
            GameMenuView.newLocation();
            }
            else if (option==4){
            CropsView.displayCropsView();
            }
            else if (option==5){
            MainMenuView.displayMainMenu();
            }
        } while (option!=MAX);
       
    }
    
    static void newLocation(){
        System.out.println("newLocation function will start.");
    }
    
}