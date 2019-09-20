/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

/**
 *
 * @author stept
 */
public class IceCreamStand extends Attraction {
   
    private String IceCreams;
    private int NumofCones;

    public IceCreamStand(int AttractionID, String Name, int Price, String Status, String IceCreams, int NumofCones, int NumofStaff) {
        super(AttractionID, Name, Price, Status, NumofStaff);
        this.IceCreams = IceCreams;
        this.NumofCones = NumofCones;
    }

    @Override
    public String toString() {
        return super.toString();
    }



    
    

}
