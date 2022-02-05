import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Inventory
{
    private ArrayList<Screen> listInventory;
    public Inventory()  // default constructor of list inventory
    {
        this.listInventory = new ArrayList<>();
    }
    public int inventoryCount(){return listInventory.size(); }  // size of listinventory

    public boolean addToInventory(Screen R) // add the correct values to listinventory
    {
    if(!listInventory.contains(R)){
        listInventory.add(R);
        return true;
    }
    else
        try
        {
            throw new Exception("The inventory contains a similar Screen object");
        }
        catch (Exception e) { }
        return false;
    }

    public ArrayList<ComputerMonitor> listComputerMonitor() // creating an arraylist of type computermonitor
    {
        ArrayList<ComputerMonitor> CompMon = new ArrayList<>();
        for (int i =0; i <listInventory.size();i++)
        {
         if (listInventory.get(i) instanceof ComputerMonitor)
         {
            ComputerMonitor data = (ComputerMonitor) listInventory.get(i);
            CompMon.add(data);
         }
        }
        return CompMon;
    }

    public ArrayList<SmartTV> listSmartTV() // creating an arraylist of type smarttv
    {
        ArrayList<SmartTV> smarttv = new ArrayList<>();
        for (int i = 0; i < listInventory.size();i++){
            if (listInventory.get(i) instanceof SmartTV)
            {
            SmartTV data = (SmartTV) listInventory.get(i);
            smarttv.add(data);
            }
        }
        return smarttv;
    }
    public void printInventory() // creating the grid and the correct outputs
    {
        String y[] = {"    Type","     ID","    Price","  Make Date"," Manufacturer","   Model","Glass","     OS"};
        String x = "+-------------+-------------+-------------+------------+--------------+----------+-------+------------+";
        System.out.println(x);
     System.out.printf("%S %12S %15S %15S %14S %7S %8S %-12S %S %n","|"+y[0]," |"+y[1],"|"+y[2],"|"+y[3],"|"+y[4],"|"+y[5],"| " + y[6],"|"+y[7],"|");
        for (int i =0; i<listInventory.size();i++)
        {
            // outputting the grid by formating the date in the correct way and creating a new Screen holder to use in outputs
            Screen holder = listInventory.get(i);
            String date = "";
            String dateholder[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
            String  month = holder.getMakeDate().toString().substring(4,6);
            int j;
            for (j =0;j<12;j++){
                if (dateholder[j].equals(month)){
                    j = j+1;
                    break;
                }
            }
            // creating
            if (j < 10) date += "0" + j + "/";
            else date += j + "/";
            date += holder.getMakeDate().toString().substring(8,10)+"/";
            date += holder.getMakeDate().toString().substring(26,28);
            double hold = 0;
            String additional = "";
            System.out.println(x);
            if(holder.toString().equals("SmartTV (2)"))

            if (listInventory.get(i) instanceof CRT)
            {
                System.out.printf("%1S %-14S %-13S %-12S %-14S %-10S %-7S %-12S %S %n","|"+holder.toString()," |"+holder.getid(),"|"+holder.getPrice(),"|"+date,"|"+holder.getManufacturer(),"|"+holder.getModel(),"| " + ((CRT) listInventory.get(i)).getGlassThickness(),"|","|");
            }
            else if (listInventory.get(i) instanceof SmartTV)
            {
                System.out.printf("%1S %-14S %-13S %-12S %-14S %-10S %-7S %-12S %s %n","|"+holder.toString()," |"+holder.getid(),"|"+holder.getPrice(),"|"+date,"|"+holder.getManufacturer(),"|"+holder.getModel(),"| ","|"+ ((SmartTV) listInventory.get(i)).getOperatingSystem(),"|");
            }
            else

             System.out.printf("%1S %-14S %-13S %-12S %-14S %-10S %-7S %-12S %s %n","|"+holder.toString()," |"+holder.getid(),"|"+holder.getPrice(),"|"+date,"|"+holder.getManufacturer(),"|"+holder.getModel(),"|" ,"|","|");
            else if (listInventory.get(i) instanceof CRT)
            {
               System.out.printf("%-12S %-14S %-13S %-12S %-14S %-10S %-7S %-12S %s %n","|"+holder.toString()," |"+holder.getid(),"|"+holder.getPrice(),"|"+date,"|"+holder.getManufacturer(),"|"+holder.getModel(),"|" + ((CRT) listInventory.get(i)).getGlassThickness(),"|","|");
            }
            else if (listInventory.get(i) instanceof SmartTV)
            {
                System.out.printf("%-12S %-14S %-13S %-12S %-14S %-10S %-7S  %-12S %s %n","|"+holder.toString()," |"+holder.getid(),"|"+holder.getPrice(),"|"+date,"|"+holder.getManufacturer(),"|"+holder.getModel(),"| " ,"|"+ ((SmartTV) listInventory.get(i)).getOperatingSystem(),"|");
            }
            else

                System.out.printf("%-12S %-14S %-13S %-12S %-14S %-10S %-7S %-12S %s %n","|"+holder.toString()," |"+holder.getid(),"|"+holder.getPrice(),"|"+date,"|"+holder.getManufacturer(),"|"+holder.getModel(),"| ","|","|");
        }

        System.out.println(x);
    }
}
