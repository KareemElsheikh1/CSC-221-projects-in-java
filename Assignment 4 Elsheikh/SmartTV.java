import java.util.Date;

public class SmartTV extends Screen {
    private  String operatingSystem;
    public SmartTV (String operatingSystem,Long id,double price,Date makedate, String manufacturer,String model)
    {
    this.operatingSystem = operatingSystem;
    setId(id);
    setPrice(price);
    setMakeDate(makedate);
    setManufacturer(manufacturer);
    setModel(model);

    }

    public String getOperatingSystem() {return  this.operatingSystem;}
    public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}

    @Override
    public boolean equals(Object other)
        {
            if(this == other)
                return  true;
            if(other != null && other instanceof Screen)
            {
                Screen screen = (Screen)other;
                if( this.getid() == ((Screen) other).getid() && this.getPrice() == ((Screen) other).getPrice() && this.getModel().contains(((Screen) other).getModel())) return  true;
            }

            return false;
        }
    @Override
    public String toString(){
        return String.format("SmartTV (2)");
    }

}