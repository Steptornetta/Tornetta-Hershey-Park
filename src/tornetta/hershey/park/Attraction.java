/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

/**
 *
 * @author stept
 */
public class Attraction {
    
    private int AttractionID;
    private String Name;
    private int Price;
    private String Status;
    private int NumofStaff;

    public Attraction(int AttractionID, String Name, int Price, String Status, int NumofStaff) {
        this.AttractionID = AttractionID;
        this.Name = Name;
        this.Price = Price;
        this.Status = Status;
        this.NumofStaff = NumofStaff;
    }

    public int getAttractionID() {
        return AttractionID;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public String getStatus() {
        return Status;
    }

    public int getNumofStaff() {
        return NumofStaff;
    }
    
    
    
    

    @Override
    public String toString() {
        return "" + AttractionID + "," + Name + "," + Price + "," + Status + "," + NumofStaff;
    }



}
