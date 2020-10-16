
public class SalesPersonNew
{
    private String name;
    private String address;
    private int carsSold;
    private int grossSales;
    private int commisions;
    public SalesPersonNew(String n, String a)
    {
        name = n;
        address = a;
        carsSold = 0;
        grossSales = 0;
        commisions = 0;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getCarsSold() {
        return carsSold;
    }
    public void increaseCarsSold() {
        carsSold++;
    }
    public int getGrossSales() {
        return grossSales;
    }
    public void increaseGrossSales(int gS) {
        grossSales += gS;
    }
    public int getCommisions() {
        return commisions;
    }
    public void increaseCommisions(int c) {
        commisions += c;
    }
    public String toString (){ 
        return name + " " + address + "    Cars Sold: " + carsSold +  "     gross sales: $" + grossSales + " comm: $" + commisions;    
    }
}