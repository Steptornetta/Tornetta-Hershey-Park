/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

import java.util.ArrayList;

/**
 *
 * @author stept
 */
public class Park {
    
    private String ParkName;

    public Park(String ParkName) {
        this.ParkName = ParkName;
    }
    
    
    private ArrayList<Attraction> AttractionList = new ArrayList<Attraction>();
    private ArrayList<Customer> CustomerList = new ArrayList<Customer>();    

    public ArrayList<Attraction> getAttractionList() {
        return AttractionList;
    }

    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }
   
    
    public boolean addRollerCoaster(int AttractionID, String Name, String Status, int Price, String Color, String Speed, String Thrill, int NumofStaff)
    {
        RollerCoaster myCoaster = new RollerCoaster(AttractionID, Name, Status, Price, Color, Speed, Thrill, NumofStaff);
        
        for(Attraction checkAttraction: AttractionList)
        {
            if(checkAttraction.getAttractionID()== myCoaster.getAttractionID()) //Check if there is already a runner with the same ID
            {
                System.out.println("AttractionID " + myCoaster.getAttractionID()+ " already exists.");
                
                return false;
            }
        }   
        
        AttractionList.add(myCoaster);

        return true;
    }
    
    public boolean addLogFlume(int AttractionID, String Name, String Status, int Price, int Wetness, int NumofStaff)
    {
        LogFlume myLogFlume = new LogFlume(AttractionID, Name, Status, Price, Wetness, NumofStaff);
        
        for(Attraction checkAttraction: AttractionList)
        {
            if(checkAttraction.getAttractionID()== myLogFlume.getAttractionID()) //Check if there is already a runner with the same ID
            {
                System.out.println("AttractionID " + myLogFlume.getAttractionID()+ " already exists.");
                
                return false;
            }
        }   
        
        AttractionList.add(myLogFlume);

        return true;
    }  
    
    
    public boolean addBurgerStand(int AttractionID, String Name, int Price, String Status, int NumofBurgers, int NumofFries, String Condiments, int NumofStaff)
    {
        BurgerStand myBurgerStand = new BurgerStand(AttractionID, Name, Price, Status, NumofBurgers, NumofFries, Condiments, NumofStaff);
        
        for(Attraction checkAttraction: AttractionList)
        {
            if(checkAttraction.getAttractionID()== myBurgerStand.getAttractionID()) //Check if there is already a runner with the same ID
            {
                System.out.println("AttractionID " + myBurgerStand.getAttractionID()+ " already exists.");
                
                return false;
            }
        }   
        
        AttractionList.add(myBurgerStand);

        return true;
    }  
        
    public boolean addIceCreamStand(int AttractionID, String Name, int Price, String Status, String IceCreams, int NumofCones, int NumofStaff)
    {
        IceCreamStand myIceCreamStand = new IceCreamStand(AttractionID, Name, Price, Status, IceCreams, NumofCones, NumofStaff);
        
        for(Attraction checkAttraction: AttractionList)
        {
            if(checkAttraction.getAttractionID()== myIceCreamStand.getAttractionID()) //Check if there is already a runner with the same ID
            {
                System.out.println("AttractionID " + myIceCreamStand.getAttractionID()+ " already exists.");
                
                return false;
            }
        }   
        
        AttractionList.add(myIceCreamStand);

        return true;
    }      
        
    public boolean addShow(int AttractionID, String Name, int Price, String Status, String ShowType, int NumActors, int NumAnimals, String RunTime, int NumofStaff)
    {
        Show myShow = new Show(AttractionID, Name, Price, Status, ShowType, NumActors, NumAnimals, RunTime, NumofStaff);
        
        for(Attraction checkAttraction: AttractionList)
        {
            if(checkAttraction.getAttractionID()== myShow.getAttractionID()) //Check if there is already a runner with the same ID
            {
                System.out.println("AttractionID " + myShow.getAttractionID()+ " already exists.");
                
                return false;
            }
        }   
        
        AttractionList.add(myShow);

        return true;
    }          
    
    public boolean addCustomer(int CustomerID, String Fname, String Lname, int Age, double Height)
    {
        Customer myCustomer = new Customer(CustomerID,Fname, Lname, Age, Height);
        
        for(Customer checkCustomer: CustomerList)
        {
            if(checkCustomer.getCustomerID()== myCustomer.getCustomerID()) //Check if there is already a runner with the same ID
            {
                System.out.println("AttractionID " + myCustomer.getCustomerID()+ " already exists.");
                
                return false;
            }
        }   
        
        CustomerList.add(myCustomer);

        return true;
    }           

    @Override
    public String toString() {
        return "ParkName = " + ParkName;
    }
    

   public void showAll()
    {
        System.out.println("Attraction List");
        for(Attraction myAttraction: AttractionList)
        {
            System.out.println(myAttraction.toString());
        }

        System.out.println("\nCustomer List");
        for(Customer myCustomer: CustomerList)
        {
            System.out.println(myCustomer);
        }
        
    }
            
}