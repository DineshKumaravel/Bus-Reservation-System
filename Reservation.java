import java.util.*;
public class Reservation {
    public static void main(String[] args) {

        ArrayList<Bus> buses=new ArrayList<Bus>();      //using Collections(ArrayList) to store multiple bus objects instead of using data base connectivity          
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2,false,30));
        buses.add(new Bus(3,true,20));
        ArrayList<Booking> bookings=new ArrayList<Booking>();    //using Collections(ArrayList) to store multiple booking objects instead of using data base connectivity 

        for(Bus d:buses)    //print bus informations
        {
            d.busInfo();
        }

        int userIp=1;
        Scanner in=new Scanner(System.in);
        while(userIp==1)
        {
            System.out.println("Enter 1 to Book and 2 to Exit");
            userIp=in.nextInt();
            if(userIp==1)
            {
                Booking booking=new Booking();
                if(booking.isAvailable(buses,bookings)) // check for the bus capacity and date availability
                {
                
                    bookings.add(booking);
                    System.err.println("Your Booking is Confirmed");
                }
                else
                {
                    System.out.println("Sorry. Bus is Full. Try another Bus or Date");
                    
                }
            }

        }
    }
    
}
