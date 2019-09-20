/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

/**
 *
 * @author stept
 */
public class LogFlume extends Attraction {
    
    private int Wetness; //out of 5

    public LogFlume(int AttractionID, String Name, String Status, int Price, int Wetness, int NumofStaff) {
        super(AttractionID, Name, Price, Status, NumofStaff); 
        this.Wetness = Wetness;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    

}
