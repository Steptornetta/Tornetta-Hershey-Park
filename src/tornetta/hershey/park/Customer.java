/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

import java.io.PrintStream;

/**
 *
 * @author stept
 */
public class Customer {
    
    private int CustomerID;
    private String Fname;
    private String Lname;
    private int Age;
    private double Height;

    public Customer(int CustomerID, String Fname, String Lname, int Age, double Height) {
        this.CustomerID = CustomerID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Age = Age;
        this.Height = Height;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public int getAge() {
        return Age;
    }

    public double getHeight() {
        return Height;
    }

    
    
    
    @Override
    public String toString() {
        return "" + CustomerID + "," + Fname + "," + Lname + "," + Age + "," + Height; 
                
    }
    
    

    

}
