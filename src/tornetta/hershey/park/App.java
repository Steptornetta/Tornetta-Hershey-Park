/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tornetta.hershey.park;

import java.io.*; 
import java.util.*; 
import com.opencsv.CSVWriter; 


/**
 *
 * @author stept
 */
public class App {

    /**
     * @param args the command line arguments
     */  
 
    public static void main(String[] args) {
        
       
        Park myPark = new Park("Hershey Park");
        
        System.out.println(myPark);
        myPark.addRollerCoaster(1, "Rowdy RollerCoaster", "Running", 5, "Blue", "Fast", "High", 2); //AttractionID, Name, Status, Price, Color, Speed, Thrill, NumofStaff
        myPark.addLogFlume(2, "Lousy LogFlume", "Running", 3, 2, 5); //AttractionID, Name, Status, Price, Wetness, NumofStaff
        myPark.addBurgerStand(3, "Quick Burgers and Fries", 1, "Running", 20, 25, "K + M", 15); //AttractionID, Name, Price, Status, NumofBurgers, NumofFries, Condiments, NumofStaff
        myPark.addIceCreamStand(4, "Icy IceCream Stand", 1, "Running", "V + C", 25, 5); //AttractionID, Name, Price, Status, IceCreams, NumofCones, NumofStaff
        myPark.addShow(5, "Trusty Theatre", 15, "Running", "Musical", 5, 1, "5:00", 1); //AttractionID, Name, Price, Status, ShowType, NumActors, NumAnimals, RunTime, NumofStaff
        
        myPark.addCustomer(1, "Alex", "Lewis", 15, 5.0);
        myPark.addCustomer(2, "John", "Frank", 20, 5.1);
        myPark.addCustomer(3, "Mike", "White", 25, 5.2);
        myPark.addCustomer(4, "Steve", "Brown", 30, 5.3);
        myPark.addCustomer(5, "Janice", "LeVon", 35, 5.4);
        
        myPark.addCustomer(6, "Oliver", "Lewis", 15, 5.0);
        myPark.addCustomer(7, "Jack", "Frank", 20, 5.1);
        myPark.addCustomer(8, "Harry", "White", 25, 5.2);
        myPark.addCustomer(9, "Jacob", "Brown", 30, 5.3);
        myPark.addCustomer(10, "Charlie", "LeVon", 35, 5.4);

        myPark.addCustomer(11, "Thomas", "Lewis", 15, 5.0);
        myPark.addCustomer(12, "George", "Frank", 20, 5.1);
        myPark.addCustomer(13, "Oscar", "White", 25, 5.2);
        myPark.addCustomer(14, "James", "Brown", 30, 5.3);
        myPark.addCustomer(15, "William", "LeVon", 35, 5.4);

        myPark.addCustomer(16, "Jake", "Lewis", 15, 5.0);
        myPark.addCustomer(17, "Callum", "Frank", 20, 5.1);
        myPark.addCustomer(18, "Connor", "White", 25, 5.2);
        myPark.addCustomer(19, "Jacob", "Brown", 30, 5.3);
        myPark.addCustomer(20, "Kyle", "LeVon", 35, 5.4);

        myPark.addCustomer(21, "Joe", "Lewis", 15, 5.0);
        myPark.addCustomer(22, "Reece", "Frank", 20, 5.1);
        myPark.addCustomer(23, "Rhys", "White", 25, 5.2);
        myPark.addCustomer(24, "Charlie", "Brown", 30, 5.3);
        myPark.addCustomer(25, "Damian", "LeVon", 35, 5.4);

        myPark.addCustomer(26, "Noah", "Lewis", 15, 5.0);
        myPark.addCustomer(27, "Liam", "Frank", 20, 5.1);
        myPark.addCustomer(28, "Jacob", "White", 25, 5.2);
        myPark.addCustomer(29, "William", "Brown", 30, 5.3);
        myPark.addCustomer(30, "Ethan", "LeVon", 35, 5.4);

        myPark.addCustomer(31, "Michael", "Lewis", 15, 5.0);
        myPark.addCustomer(32, "Alexander", "Frank", 20, 5.1);
        myPark.addCustomer(33, "Mike", "White", 25, 5.2);
        myPark.addCustomer(34, "James", "Brown", 30, 5.3);
        myPark.addCustomer(35, "Daniel", "LeVon", 35, 5.4);

        myPark.addCustomer(36, "Margaret", "Lewis", 15, 5.0);
        myPark.addCustomer(37, "Emma", "Frank", 20, 5.1);
        myPark.addCustomer(38, "Sophia", "White", 25, 5.2);
        myPark.addCustomer(39, "Patricia", "Brown", 30, 5.3);
        myPark.addCustomer(40, "Elizabeth", "LeVon", 35, 5.4);

        myPark.addCustomer(41, "Amelia", "Lewis", 15, 5.0);
        myPark.addCustomer(42, "John", "Frank", 20, 5.1);
        myPark.addCustomer(43, "Susan", "White", 25, 5.2);
        myPark.addCustomer(44, "Jessica", "Brown", 30, 5.3);
        myPark.addCustomer(45, "Isabella", "LeVon", 35, 5.4);

        myPark.addCustomer(46, "Charlotte", "Lewis", 15, 5.0);
        myPark.addCustomer(47, "Mary", "Frank", 20, 5.1);
        myPark.addCustomer(48, "Pat", "White", 25, 5.2);
        myPark.addCustomer(49, "Neil", "Brown", 30, 5.3);
        myPark.addCustomer(50, "Linda", "LeVon", 35, 5.4);
        
        myPark.showAll();
        
        ParkSimulation mySimulation = new ParkSimulation(myPark);
        
        mySimulation.addSimulation();
        //mySimulation.showAll();
        
        mySimulation.performSelectionSort(mySimulation.getInteractionList());
        System.out.println("\nSorted List: Sorted by Time");
        mySimulation.showAll();
        
        System.out.println("Customer Total Interaction Time: RideTime, FoodTime, ShowTime, TotalTime");
        for(int i = 1; i <= myPark.getCustomerList().size(); ++i)
        {
            System.out.println("Customer ID: " + i + " | " + mySimulation.calculateCustomerTime(i));
        }        
        
        mySimulation.writeData();
        
    }
    

    
    
}
