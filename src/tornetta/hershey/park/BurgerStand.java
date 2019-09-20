/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

/**
 *
 * @author stept
 */
public class BurgerStand extends Attraction {
    
    private int NumofBurgers;
    private int NumofFries;
    private String Condiments;

    public BurgerStand(int AttractionID, String Name, int Price, String Status, int NumofBurgers, int NumofFries, String Condiments, int NumofStaff) {
        super(AttractionID, Name, Price, Status, NumofStaff);
        this.NumofBurgers = NumofBurgers;
        this.NumofFries = NumofFries;
        this.Condiments = Condiments;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    
    
    
}
