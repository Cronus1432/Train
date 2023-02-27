/**
 * 
 * @author ENTER YOUR NAME HERE.
 * @version 
 */
public class Train
{
    //Fields
    /* Destination of the Train */
    private String destination;

    /* Train number - identifies the Train */  
    private int TrainNumber;
    
    /* Capacity of the Train - how many customers can be in it */  
    private int capacity;
    
    /* Number of customers currently in the Train */      
    private int numberInTrain;
    
    /* Ticket price - how much a ticket costs. */
    private int ticketPrice;
    
   /* Total Takings - total money taken for train tickets. */
    private int totalTakings;

    public int getTotalTakings(){return totalTakings;}
    public void resetTotalTakings(){totalTakings=0;}
    public int setTicketPrice(int newTicketPrice){this.ticketPrice=newTicketPrice; return ticketPrice;}
   

    /** Constructor for Train
     * @param dest the destination of the Train
     * @param num the number of the Train
     * @param cap the capacity of the Train
     */
    public Train(String dest, String driverName, int num, int cap, int id, int price)
    {
        destination = dest;
        capacity = cap;
        TrainNumber = num;
        setTicketPrice(price);
        numberInTrain = 0;
        ticketPrice = price;
        Driver currentDriver = new Driver(driverName, id);
    }
   
  
    
    
   
    
    /* Records customer taking Train */
    public void enterTrain () {
        if(numberInTrain<=capacity){
            numberInTrain = numberInTrain + 1;
            totalTakings=totalTakings+ticketPrice;
        }
        else{
            System.out.println("The train is full!");
        }
    }

    /* Records customer leaving Train */
    public void leaveTrain ()
    {
        numberInTrain = numberInTrain - 1;
    }
    
    
}