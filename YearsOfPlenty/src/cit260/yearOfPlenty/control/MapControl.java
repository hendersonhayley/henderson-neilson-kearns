/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

import cit260.yearOfPlenty.Game;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.Location;
import cit260.yearOfPlenty.Map;

/**
 *
 * @author brennanneilson
 */
public class MapControl {

    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] items) {
        /* Algorithm
        if noOfRows < 0 OR numOfColumns < 0
        return null
        endif
        if items is null OR its length is < 1
        RETURN null
        endif
       Map map = new Map object
       save the noOfRows in the map
       save the noOfColumns in the map
       locations = createLocations(noOfRows, noOfColumns)
       Assign the locations array to the map
       questions = createQuestions()
       assignQuestionsToScenes()
       assignItemsToScenes() 
        */
        if (noOfRows < 0 || noOfColumns < 0) {
            System.out.println("\nThere was an error creating the map.");
        }
        
        if (items == null || items.length < 1) {
            System.out.println("\nThere was an error loading items.");
        }
        Location[][] locations = MapControl.createLocations(noOfRows, noOfColumns);
        
        //Saving things to our Map
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColCount(noOfColumns);
        map.setLocations(locations);
        
        Game game = new Game();
        game.setMap(map);
        
        return map;
    }
    
    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 0 || noOfColumns < 0) {
            System.out.println("\nThere was an error creating the locations.");
        }
        // Create locations array. Nested for loops to set locations in the array.
        Location[][] locations = new Location[noOfRows][noOfColumns];
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                Location location = new Location();
                locations[i][j] = location;
            }
        }
        String nile = "\nYou have reached the Nile River."
                    + "\nYou cannot go further East.";
        locations[0][1].setDescription(nile);
        //System.out.println(locations[0][1].getDescription() + " " + items[2].getDescription());
        
        return locations;
    }
    
}