import java.util.Date;

public class LED extends ComputerMonitor {
public LED (long id, double price, Date makeDate, String manufacturer, String model){
    setId(id);
    setPrice(price);
    setMakeDate(makeDate);
    setManufacturer(manufacturer);
    setModel(model);
}
    @Override
    public boolean equals(Object other)
    {
        if(this == other)
            return  true;
        if(other != null && other instanceof Screen)
        {
            Screen screen = (Screen)other;
            if( this.getid() == ((Screen) other).getid() && this.getPrice() == ((Screen) other).getPrice()) return  true;
        }
        return false;
    }
    @Override
    public String toString()
    {
    return String.format("CRT (3)");
    }
}