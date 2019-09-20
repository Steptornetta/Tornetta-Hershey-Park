/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

/**
 *
 * @author stept
 */
public class Show extends Attraction {
    
    private String ShowType;
    private int NumActors;
    private int NumAnimals;
    private String RunTime;

    public Show(int AttractionID, String Name, int Price, String Status, String ShowType, int NumActors, int NumAnimals, String RunTime, int NumofStaff) {
        super(AttractionID, Name, Price, Status, NumofStaff);
        this.ShowType = ShowType;
        this.NumActors = NumActors;
        this.NumAnimals = NumAnimals;
        this.RunTime = RunTime;
    }

    
    @Override
    public String toString() {
        return super.toString();
    }




    
}
