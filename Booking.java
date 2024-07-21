import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of the Passanger: ");
        passengerName=in.next();
        System.out.println("Enter Bus No: ");
        busNo= in.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput=in.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
        int capacity=0;
        for(Bus bus:buses)
        {
            if(bus.getBusNo()==busNo)
            capacity=bus.getCapacity();
        }
        int booked=0;
        for(Booking b:bookings)
        {
            if(b.busNo==busNo && b.date.equals(date))
            {
                booked++;

            }

        }
        return booked<capacity?true:false;

        

    }
  
   

}
