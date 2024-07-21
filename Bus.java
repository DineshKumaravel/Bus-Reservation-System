public class Bus{
    private int busNo;
    boolean ac;
    private int capacity;

    Bus(int busNo,boolean ac,int capacity){
        this.busNo=busNo;
        this.ac=ac;
        this.capacity=capacity;

    }
    /// getters and setters
    public int getBusNo()
    {
        return busNo;
    }
    public void setCapacity(int N)
    {
        capacity=N;

    }
    public int getCapacity()
    {
        return capacity;
    }
    ///method that print bus information
    public void busInfo()
    {
        System.out.println("BusNo:"+busNo+"|| AC:"+ac+"|| Capacity:"+capacity);
    }
}
