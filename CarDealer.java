import java.util.Scanner;
public class CarDealer
{
    public static void main(String[] args){
        CarNew[] dealership = new CarNew[10];
        for(int i = 0; i < dealership.length; i++)
            dealership[i] = newCar();
        int soldsIndex = 0;    
        CarNew[] solds = new CarNew[10];
        SalesPersonNew[] dealers = new SalesPersonNew[3];
        dealers[0] = new SalesPersonNew("Kush", "Address");
        dealers[1] = new SalesPersonNew("Bush", "Address");
        dealers[2] = new SalesPersonNew("Lush", "Address");
        
        boolean game = false;
        Scanner scan = new Scanner(System.in);
        String[] options = {"Print list of cars on the lot" , "Print rent list by sales person", "Print sales person list with rent cars data" , "Record the sale of a car", "Exit the system"};
        while(!game){
            System.out.println("\nKUSH'S SICK DEALER System v1.0\n");
            for(int i = 0; i < options.length; i++)
                System.out.println(i+1 + "    " + options[i]);
            System.out.print("\nSelect a menu option: ");
            int input = scan.nextInt();
            if(input == 1){
                System.out.println(carsOnTheLot(dealership));
            }
            else if(input == 2){
                System.out.println();
                for(SalesPersonNew deal : dealers){
                    System.out.println("\n"+deal.getName() + " has sold:");
                    for(CarNew sold : solds)
                        if(sold != null && sold.getSeller() != null && deal.getName().equals(sold.getSeller().getName()) && deal.getAddress().equals(sold.getSeller().getAddress()))
                            System.out.println(sold.sold());
                }
            }
            else if(input == 3){
                System.out.println();
                for(int i = 0; i < dealers.length; i++)
                    System.out.println(i + " " + dealers[i]);
            }
            else if(input == 4){
                System.out.println(carsOnTheLot(dealership));
                System.out.print("\nEnter the number of the car that you've sold?: ");
                int car = scan.nextInt();
                for(int i = 0; i < dealers.length; i++)
                    System.out.println(i + " " + dealers[i]);
                System.out.print("\n\nWhich salesperson sold the car?: ");
                int sale = scan.nextInt();
                
                SalesPersonNew currentDealer = dealers[sale];
                
                System.out.print("\n\nWhat was the sales date?: ");
                String saleDate = scan.next();
                System.out.print("\n\nWhat was the sales price?: ");
                int salesPrice = scan.nextInt();
                
                currentDealer.increaseCarsSold();
                currentDealer.increaseGrossSales(salesPrice);
                currentDealer.increaseCommisions(salesPrice/10);
                
                for(int i = 0; i < dealers.length; i++)
                    System.out.println(i + " " + dealers[i]);
                dealership[car].setSaleDate(saleDate);
                dealership[car].setSalesPrice(salesPrice);
                dealership[car].setSeller(currentDealer);
                
                solds[soldsIndex] = dealership[car];
                soldsIndex++;
                dealership[car] = newCar();
                System.out.println("\n"+dealership[car] + "\nwas just added to the lot in spot" + car);    
                    
            }
            else if(input == 5){
                game = true;
                System.out.println("Goodbye");
            }
        }
    }
    
    public static String carsOnTheLot(CarNew[] cars){
        String carsOnLot = "";
        carsOnLot += "\nCars on the lot\n\n";
        for(int i = 0; i < cars.length; i++)
            carsOnLot += i + " " + cars[i] + "\n";
        return carsOnLot;
    }
    
    public static CarNew newCar(){
        CarNew[] cars = new CarNew[10];
        String[] models = {"Altima","Elyantra","FastCar","Big Car","VroomCar"};
        String[] colors = {"Black","Red","Purple","Orange","Magenta"};
        boolean[] auto = {true,false};
        boolean[] used = {true,false};
        int[] milesPerGallons = {25,42,32,33,52,44,65,76,56,43,65,32,12,43,54};
        int[] prices = {20000,19000,5000,200000,10000,23231,32112,432432,4322332,3223423,43242342,34242};
        return new CarNew("Nissan " + models[getRand(models.length)],colors[getRand(colors.length)],auto[getRand(auto.length)], used[getRand(used.length)],milesPerGallons[getRand(milesPerGallons.length)],prices[getRand(prices.length)],"5/13/19");
    }
    
    public static int getRand(int num){
        return (int)(Math.random() * num);
    }
}
