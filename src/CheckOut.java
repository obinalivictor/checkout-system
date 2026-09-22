import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.time.LocalDateTime;
public class CheckOut {
    private ArrayList<Integer> cart = new ArrayList<>();

    public int cart() {
        return cart.size();
    }
    public static String CustomerName(){
       Scanner Scanner = new Scanner(System.in);

       System.out.println("what is the customer name");
       String name = Scanner.nextLine();

       return name;
    }
    public static String itemName(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("what did the user buy");
        String name = Scanner.nextLine();

        return name;
    }
    public static int NumberOfItem(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("how many pieces");
        int numberItem = Scanner.nextInt();
            return numberItem;
    }
    public static double unitPrice(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("how much per unit");
        double price = Scanner.nextDouble();

        return price;
    }
    public static String  cashierName(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("enter cashier name");
        String name = Scanner.nextLine();

        return name;
    }

    public static double discountCheck(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter discount");
        double discount = Scanner.nextInt();

        return discount;
    }

    public static String addItem(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("should more items be added");
        String answer = Scanner.nextLine();

        return answer;
    }

    public static void main(String[] args) {
        String answer = "";
        String customerNames = "";


        String nameOfItem = "";
        int itemSize = 0;
        double pricePerItem = 0;
        double total = 0;
        double subtotal = 0;

        ArrayList<String>name = new ArrayList<>();
        ArrayList<Integer>quantity = new ArrayList<>();
        ArrayList<Double>price = new ArrayList<>();
        ArrayList<Double>totalPrice = new ArrayList<>();

        while(!answer.equals("no")){
            customerNames =  CustomerName();

         nameOfItem =  itemName();
         name.add(nameOfItem);

          itemSize =  NumberOfItem();
          quantity.add(itemSize);

           pricePerItem =  unitPrice();
           price.add( pricePerItem);

            total = itemSize *  pricePerItem;
            totalPrice.add( total);


            subtotal += total;

            answer = addItem();
        }

        double theDiscount = discountCheck();
         String  nameOfCashier = cashierName();


         double Vat = subtotal * 0.75;


        String address = """
           semicolon stores
           main branch
           location:312,herbert macaulay way,sabo yaba,lagos
           tel: 07051308290
           """;
        LocalDateTime now = LocalDateTime.now();
        System.out.println(address);
        System.out.println(now);
        System.out.println("cashier: "+nameOfCashier +"\ncustomers name: "+ customerNames);
        System.out.println("==================================================================================================================");
        System.out.printf("%-10s%-10s%-10s%-10s%n","item","qty","price","total");
        System.out.println("==================================================================================================================");
        for(int count = 0 ; count < name.size(); count++){
            System.out.printf("%-10s%-10s%-10s%-10s%n",name.get(count),quantity.get(count),price.get(count),totalPrice.get(count));

        }

        System.out.println("==================================================================================================================");
        System.out.println("subtotal:  " + subtotal);
        System.out.println("discount:  "+theDiscount);
        System.out.println("Vat @ 7.5%: "+ Vat);
        System.out.println("==================================================================================================================");
            double billTotal = (subtotal - theDiscount) + Vat;
        System.out.println("Bill total: "+billTotal);
        System.out.println("==================================================================================================================");
        System.out.println("this is not a receipt pay: "+billTotal);
        System.out.println("==================================================================================================================");

    }

}
