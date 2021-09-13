import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        String amount = input.next();
        double convAmount = Double.parseDouble(amount);

        Scanner input2 = new Scanner(System.in);
        System.out.println("What state do you live in?");
        String state = input2.next();


        double rate;
        double tax = 0;

        if(state.equals("Wisconsin"))
        {
            rate = .05;
            tax = convAmount * rate;

            Scanner input3 = new Scanner(System.in);
            System.out.println("What county do you live in?");
            String county = input3.next();

            if(county.equals("Eau Claire"))
            {
                tax = tax + .005;
            }
            else if(county.equals("Dane"))
            {
                tax = tax+  .004;
            }
            System.out.println("The tax is $"+String.format("%.2f",tax)+".");
        }
        else if(state.equals("Illinois"))
        {
            rate = .08;
            tax = convAmount * rate;
            System.out.println("The tax is $"+String.format("%.2f",tax)+".");
        }

        convAmount = convAmount + tax;
        System.out.println("The total is $"+String.format("%.2f",convAmount)+".");
    }
}
