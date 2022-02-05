import java.util.Date;

public abstract class Screen {

    int var1;
    String var2;

    private long id;
    private double price;
    private Date makeDate;
    private  String manufacturer;
    private  String model;

    public void Screen (long id, double price, Date makeDate, String manufacturer, String model)
    {
        this.id = id;
        this.price = price;
        this.makeDate = makeDate;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public long getid() {return this.id;}
    public double getPrice() {return this.price;}
    public Date getMakeDate() {return this.makeDate;}
    public String getManufacturer() {return this.manufacturer;}
    public String getModel() {return this.model;}

    public void setId(long id) {this.id = id;}
    public void setPrice(double price) {this.price = price;}
    public void setMakeDate(Date makeDate) {this.makeDate = makeDate;}
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}
    public void setModel(String model) {this.model = model;}

    @Override
    public boolean equals(Object other)
    {
        if(this == other)
            return  true;
        if(other != null && other instanceof Screen){
            Screen screen = (Screen)other;
            return var1 == screen.var1 && var2.equals(screen.var2);
        }
        return false;
    }
    @Override
    public String toString()
    {
        return String.format("Screen (1)");
    }
}