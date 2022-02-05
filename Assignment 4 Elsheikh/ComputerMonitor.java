import java.util.Date;

public abstract class ComputerMonitor extends Screen
{
    public ComputerMonitor(){}
public ComputerMonitor(long id,double price, Date makeDate,String manufacturer, String model){
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
            if( this.getid() == ((Screen) other).getid()) return  true;
        }

        return false;
    }
    @Override
    public String toString(){
        return String.format("ComputerMonitor (2)");
    }
}
