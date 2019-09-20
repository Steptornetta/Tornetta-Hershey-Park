/*
    Stephen Tornetta. PSU 2018
*/

package tornetta.hershey.park;

import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author stept
 */
public class ParkSimulation {

    private Park myPark;
    private ArrayList<Interaction> InteractionList = new ArrayList<Interaction>();    

    public ParkSimulation(Park myPark) {
        this.myPark = myPark;
    }

    public ArrayList<Interaction> getInteractionList() {
        return InteractionList;
    }
    
    public void addSimulation()
    {
        ArrayList<String> Date = new ArrayList<String>();
        ArrayList<Attraction> AttractionList = myPark.getAttractionList();
        ArrayList<Customer> CustomerList = myPark.getCustomerList();  
        
        for(int i = 1; i <= 1000; i++)
        {
          
            Random Rand = new Random();

            Date.add("1/2/19");
            Date.add("1/9/19");
            Date.add("2/2/19");

            Attraction RandomAttraction = myPark.getAttractionList().get(Rand.nextInt(AttractionList.size()));
            Customer RandomCustomer = myPark.getCustomerList().get(Rand.nextInt(CustomerList.size()));
            int RandomDuration = Rand.nextInt(25) + 1;
            String RandomDate = Date.get(Rand.nextInt(3));
            
            Interaction myInteraction = new Interaction(i, RandomCustomer, RandomAttraction, RandomDate, RandomDuration);
            InteractionList.add(myInteraction);

            //System.out.println("Interaction:\n" + RandomAttraction + "\n" + RandomCustomer + "\nDuration: " + RandomDuration + ", Date: " + RandomDate + "\n");
        }
        
    }
    
    
   public void swap(ArrayList<Interaction> InteractionList, int intswap1, int intswap2) // We now need an ArrayList of Interactions
  {
      // Setting tempSwap variables. Need an extra swap variable.
      Interaction tempSwap = InteractionList.get(intswap1);
      Interaction tempSwap2 = InteractionList.get(intswap2);
      
      // Completing the swaps.
      InteractionList.set(intswap1, tempSwap2);
      InteractionList.set(intswap2, tempSwap);
  }

  public int getMin(ArrayList<Interaction> InteractionList, int startPos)
  {
      // Finding the min interaction time 
      int min = InteractionList.get(startPos).getTime();
      int minPos = startPos;

      for (int i= startPos+1 ; i < InteractionList.size(); i++)
      {
        if (InteractionList.get(i).getTime() < min)
        {
          min = InteractionList.get(i).getTime();
          minPos = i;
        }
    }

    return minPos;

  }

  public void performSelectionSort(ArrayList<Interaction> InteractionList)
  {
    for (int i = 0; i < InteractionList.size() - 1; i++)
      {
        int min = getMin(InteractionList, i);
        if (InteractionList.get(min).getTime() < InteractionList.get(i).getTime())
        {
          swap(InteractionList, min, i);
        }
      }
 }

    
  
  public String calculateCustomerTime(int FindID)
  {
      int RideTime = 0;
      int FoodServiceTime = 0;
      int ShowTime = 0;
      int TotalTime = 0;
      
      for(Interaction myInteraction:InteractionList)
      {
          if(myInteraction.getCustomer().getCustomerID() == FindID)
          {
              if(myInteraction.getAttraction().getAttractionID() == 1 || myInteraction.getAttraction().getAttractionID() == 2)
              {
                RideTime = RideTime + myInteraction.getTime();
                TotalTime = RideTime + TotalTime;
              }
              
              if(myInteraction.getAttraction().getAttractionID() == 3 || myInteraction.getAttraction().getAttractionID() == 4)
              {
                  FoodServiceTime = FoodServiceTime + myInteraction.getTime();
                  TotalTime = FoodServiceTime + TotalTime;
              }
              
              else{
                  ShowTime = ShowTime + myInteraction.getTime();
                  TotalTime = ShowTime + TotalTime;
              }
              
          }
      }
      return "" + RideTime + "," + FoodServiceTime + "," + ShowTime + "," + TotalTime;
  }
  
  
  public void writeData() //https://stackoverflow.com/questions/3666007/how-to-serialize-object-to-csv-file This link really helped me understand how to do CSV writing.
{ 
    final String CSV_SEPARATOR = ",";
  
    ArrayList<Customer> CustomerList = myPark.getCustomerList();  
    ArrayList<Attraction> AttractionList = myPark.getAttractionList();  
    
    try { 
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("HersheyParkData.csv"), "UTF-8"));
            
            StringBuffer Header = new StringBuffer();
            Header.append("AttrID");
            
            Header.append(CSV_SEPARATOR);
            Header.append("Name");
            
            Header.append(CSV_SEPARATOR);
            Header.append("Price");
            
            Header.append(CSV_SEPARATOR);
            Header.append("Status");
            
            Header.append(CSV_SEPARATOR);
            Header.append("NumStaff");
            
            bw.write(Header.toString());
            bw.newLine();           
         
            
            for (Attraction i : AttractionList)
            {
                StringBuffer oneLine = new StringBuffer();
                
                oneLine.append(i.getAttractionID());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getPrice());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getStatus());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getNumofStaff());
                
                bw.write(oneLine.toString());
                bw.newLine();
            }                        

            bw.newLine();                  
            
            StringBuffer Header1 = new StringBuffer();
            Header1.append("CustID");
            
            Header1.append(CSV_SEPARATOR);
            Header1.append("Fname");
            
            Header1.append(CSV_SEPARATOR);
            Header1.append("Lname");
            
            Header1.append(CSV_SEPARATOR);
            Header1.append("Age");
            
            Header1.append(CSV_SEPARATOR);
            Header1.append("Height");
            
            bw.write(Header1.toString());
            bw.newLine();                  
            
            for (Customer i : CustomerList)
            {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(i.getCustomerID());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getFname());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getLname());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getAge());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getHeight());
                
                bw.write(oneLine.toString());
                bw.newLine();
            }
            

            StringBuffer Header2 = new StringBuffer();
            bw.newLine();
           
            Header2.append("InterID");
            Header2.append(CSV_SEPARATOR);
            
            Header2.append("CustID");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Fname");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Lname");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Age");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Height");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("AttrID");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Name");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Price");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Status");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("NumStaff");
            
            Header2.append(CSV_SEPARATOR);            
            Header2.append("Date");
            
            Header2.append(CSV_SEPARATOR);
            Header2.append("Duration");
            
            bw.write(Header2.toString());
            bw.newLine();    
            
            for (Interaction i : InteractionList)
            {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(i.getInteractionID());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getCustomer());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getAttraction());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getDate());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(i.getTime());
                
                bw.write(oneLine.toString());
                bw.newLine();
            }            

            bw.newLine();                  
            
            StringBuffer Header3 = new StringBuffer();
            Header3.append("CustID");
            Header3.append(CSV_SEPARATOR);
            
            Header3.append("RideTime");
            
            Header3.append(CSV_SEPARATOR);
            Header3.append("FoodTime");
            
            Header3.append(CSV_SEPARATOR);
            Header3.append("ShowTime");

            Header3.append(CSV_SEPARATOR);
            Header3.append("TotalTime");   
            
            bw.write(Header3.toString());
            bw.newLine();               
            
            for(int i = 1; i <= myPark.getCustomerList().size(); ++i)
            {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(i);
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(calculateCustomerTime(i));
                
                bw.write(oneLine.toString());
                bw.newLine();                
            }
            bw.flush();
            bw.close();
    } 
    catch (IOException e) { 
        // TODO Auto-generated catch block 
        e.printStackTrace(); 
    } 

    
}
  
  
  
    public void showAll()
    {
        System.out.println("\nInteraction List");
        for(Interaction myInteraction:InteractionList)
        {
            System.out.println(myInteraction);
            //System.out.println(myInteraction.compareTo(InteractionList.get(1)));
            
        }
        
        // Not utilized Collections.sort import. Still going to leave the commented out code here
        /*
        Collections.sort(InteractionList);
        
        System.out.println("\nSorted Interaction List");
        for(Interaction myInteraction:InteractionList)
        {
            System.out.println(myInteraction);
            //System.out.println(myInteraction.compareTo(InteractionList.get(1)));
            
        }        
        */
    }
}
