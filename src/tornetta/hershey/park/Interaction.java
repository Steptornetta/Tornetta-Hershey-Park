/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

/**
 *
 * @author stept
 */
public class Interaction implements Comparable {
    
    private int InteractionID;
    private Customer Customer;
    private Attraction Attraction;
    private String Date;
    private int Time;

    public Interaction(int InteractionID, Customer Customer, Attraction Attraction, String Date, int Time) {
        this.InteractionID = InteractionID;
        this.Customer = Customer;
        this.Attraction = Attraction;
        this.Date = Date;
        this.Time = Time;
    }

    public int getInteractionID() {
        return InteractionID;
    }

    public String getDate() {
        return Date;
    }

    public int getTime() {
        return Time;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public Attraction getAttraction() {
        return Attraction;
    }
    

    @Override
    public String toString() {
        return  "InteractionID = " + InteractionID + "\n     Customer=" + Customer + "\n     Attraction=" + Attraction + "\n     Date=" + Date + ", Time=" + Time;
    }

    @Override
    public int compareTo(Object o) {
        int compareTime = ((Interaction)o).getTime();
        
        return this.Time-compareTime;
    }



}
