
public class CarNew
{
    private String makerModel;
    private String color;
    private boolean usedOrNew;
    private boolean autoOrManual;
    private int milesPerGallon;
    private String saleDate;
    private int price;
    private int salePrice;
    private String arrival;
    private SalesPersonNew seller;
    public CarNew(String m, String c, boolean a, boolean uON, int mPG, int pPD, String ar)
    {
        makerModel = m;
        color = c;
        autoOrManual = a;
        milesPerGallon = mPG;
        price = pPD;
        salePrice = 0;
        saleDate = "";
        arrival = ar;
        usedOrNew = uON; 
      
    }

    public String getMakerModel() {
        return makerModel;
    }
    public String getColor() {
        return color;
    }
    public String getSaleDate() {
        return saleDate;
    }
    
    public int getSalePrice() {
        return salePrice;
    }
    public boolean getAuto() {
        return autoOrManual;
    }
    public int getMile() {
        return milesPerGallon;
    }
    public void setSaleDate(String s){
        saleDate = s;
    }
    
    public void setSalesPrice(int s){
        salePrice = s;
    }
    
    public void setSeller(SalesPersonNew s){
        seller = s;
    }
    
    public SalesPersonNew getSeller(){
        return seller;
    }
    
    public String sold(){
        return makerModel + " " + color + " sold on: " + saleDate + " for " + salePrice;
    }
  
    public String toString ()
    { 
        return makerModel + " " + color + ", " +  "auto: " + autoOrManual + ", is used: " + usedOrNew + ", miles per gallon: " + milesPerGallon + ", price: " + price;    
    }
    
}