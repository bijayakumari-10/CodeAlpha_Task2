import java.util.Scanner;

public class TwoStockTrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int applePrice = 100;
        int googlePrice = 200;

        int userMoney = 1000;
        int appleStocks = 0;
        int googleStocks = 0;

        System.out.println("Welcome to Simple Stock Trading!");
        System.out.println("You have ₹" + userMoney);
        System.out.println("Apple stock price: ₹" + applePrice);
        System.out.println("Google stock price: ₹" + googlePrice);

        System.out.print("How many Apple stocks do you want to buy? ");
        int buyApple = sc.nextInt();
        int appleCost = buyApple * applePrice;

        if (appleCost <= userMoney) {
            userMoney -= appleCost;
            appleStocks += buyApple;
            System.out.println("You bought " + buyApple + " Apple stocks.");
        } else {
            System.out.println("Not enough money to buy Apple stocks.");
        }

        System.out.print("How many Google stocks do you want to buy? ");
        int buyGoogle = sc.nextInt();
        int googleCost = buyGoogle * googlePrice;

        if (googleCost <= userMoney) {
            userMoney -= googleCost;
            googleStocks += buyGoogle;
            System.out.println("You bought " + buyGoogle + " Google stocks.");
        } else {
            System.out.println("Not enough money to buy Google stocks.");
        }

        System.out.println("You now have ₹" + userMoney);
        System.out.println("Apple Stocks: " + appleStocks);
        System.out.println("Google Stocks: " + googleStocks);

        System.out.print("How many Apple stocks do you want to sell? ");
        int sellApple = sc.nextInt();
        if (sellApple <= appleStocks) {
            int income = sellApple * applePrice;
            userMoney += income;
            appleStocks -= sellApple;
            System.out.println("You sold " + sellApple + " Apple stocks.");
        } else {
            System.out.println("You don't have that many Apple stocks.");
        }

        System.out.print("How many Google stocks do you want to sell? ");
        int sellGoogle = sc.nextInt();
        if (sellGoogle <= googleStocks) {
            int income = sellGoogle * googlePrice;
            userMoney += income;
            googleStocks -= sellGoogle;
            System.out.println("You sold " + sellGoogle + " Google stocks.");
        } else {
            System.out.println("You don't have that many Google stocks.");
        }

        System.out.println("\n--- Final Summary ---");
        System.out.println("Money: ₹" + userMoney);
        System.out.println("Apple Stocks: " + appleStocks);
        System.out.println("Google Stocks: " + googleStocks);

        sc.close();
    }
}
