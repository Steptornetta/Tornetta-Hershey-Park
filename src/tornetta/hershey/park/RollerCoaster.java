/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

/**
 *
 * @author stept
 */
public class RollerCoaster extends Attraction{
    
    private String Color;
    private String Speed;
    private String Thrill;
    private String Status;

    public RollerCoaster(int AttractionID, String Name, String Status, int Price, String Color, String Speed, String Thrill, int NumofStaff) {
        super(AttractionID, Name, Price, Status, NumofStaff);
        this.Color = Color;
        this.Speed = Speed;
        this.Thrill = Thrill;
    }

    @Override
    public String toString() {
        return super.toString();
    }




    


    
    
    

}
