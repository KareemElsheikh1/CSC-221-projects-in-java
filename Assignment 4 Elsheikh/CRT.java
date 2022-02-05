import java.util.Date;

public class CRT extends ComputerMonitor {
    double glassThickness;
    public CRT (double glassThickness, long id, double price, Date makeDate, String manufacturer, String model){
        this.glassThickness = glassThickness;
        setId(id);
        setPrice(price);
        setMakeDate(makeDate);
        setManufacturer(manufacturer);
        setModel(model);
    }
    public void setGlassThickness(double glassThickness){this.glassThickness = glassThickness;}
    public double getGlassThickness(){return this.glassThickness;}

    @Override
    public boolean equals(Object other)
    {
        if(this == other)
            return  true;
        if(other != null && other instanceof Screen)
        {
            Screen screen = (Screen)other;
            if( this.getid() == ((Screen) other).getid() && this.getModel().contains(((Screen) other).getModel())) return  true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return String.format("CRT (3)");
    }
}