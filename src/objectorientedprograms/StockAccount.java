package objectorientedprograms;

import java.util.Scanner;

public class StockAccount {
    String yourName;
    double accBal;
    Portfolio portfolio;
    Scanner sc = new Scanner(System.in);

    StockAccount(String yourName, double accBal){
        this.yourName = yourName;
        this.accBal = accBal;
        this.portfolio = new Portfolio();
        System.out.println("Stock Account Created..!");
    }
    void buy(){
        System.out.println("Enter Stock Name: ");
        String sName = sc.next();
        System.out.println("Enter Number of Shares: ");
        int noOfShares = sc.nextInt();
        System.out.println("Enter Price of each Share: ");
        double priceOfEachStock = sc.nextInt();

        if(noOfShares * priceOfEachStock < accBal) {
            StockInfo stock = new StockInfo(sName, noOfShares, priceOfEachStock);
            portfolio.list.add(stock);
            this.accBal = this.accBal - (noOfShares * priceOfEachStock);
            System.out.println("\nStock added to your Portfolio successfully.\n");
            portfolio.updatePortfolio();
        } else {
            System.out.println("Your account balance is less than the stock value you're trying to buy. Press 1 to add account balance..");
            if(sc.nextInt() == 1) {
                save();
            }
        }
    }

    void sell(){
        System.out.print("Enter Stock name: ");
        String sName = sc.next();
        System.out.print("Enter number of shares to sell: ");
        int noOfSharesToSell = sc.nextInt();

        for(StockInfo stock : portfolio.list){
            if(sName.equalsIgnoreCase(stock.getStockName())){
                if(noOfSharesToSell <= stock.getNoOfShares()){
                    this.accBal = this.accBal + (noOfSharesToSell * stock.getPriceOfEachStock());
                    stock.setNoOfShares(stock.getNoOfShares() - noOfSharesToSell);
                    portfolio.updatePortfolio();
                    System.out.println("Stock sold from your Portfolio successfully.\n");
                } else {
                    System.out.println("Error..! Insufficient Stock Quantity");
                }
            }
        }
    }
    public void save(){
        System.out.println("Enter amount to Add in Account: ");
        double amt = sc.nextDouble();
        this.accBal = amt+accBal;
    }

    public void valueOf(){
        System.out.println("Account Holder Name ==> "+this.yourName);
        System.out.println("Available Balance ==> "+ this.accBal);
    }
}
