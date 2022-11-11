package objectorientedprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Portfolio {
    List<StockInfo> list = new ArrayList<>();
    double portfolioAmt = 0;
    Scanner sc = new Scanner(System.in);

    Portfolio(){
        System.out.println("Enter Number of Stocks: ");
        int numOfStocks = sc.nextInt();
        stockDetails(numOfStocks);
    }
    public void stockDetails(int numOfStocks){
        int i;
        for (i = 1; i <= numOfStocks; i++) {
            System.out.println("Enter for Stock " + i + ":");
            System.out.print("Enter Stock name: ");
            String sName = sc.next();
            System.out.println("Enter Number of Shares: ");
            int noOfShares = sc.nextInt();
            System.out.println("Enter price per share: ");
            double priceOfEachStock = sc.nextDouble();
            StockInfo stock = new StockInfo(sName, noOfShares, priceOfEachStock);
            list.add(stock);
            updatePortfolio();
        }
    }
    public void updatePortfolio(){
        double portfolio = 0;
        for (StockInfo st:
             list) {
            portfolio = portfolio + st.getStockVal();
        }
        this.portfolioAmt = portfolio;
    }

    public void printReport(){
        System.out.println("=== PORTFOLIO REPORT ===\n");
        for (StockInfo st:
             list) {
            System.out.println("Stock Name ==> "+ st.getStockName());
            System.out.println("Number Of Shares ==> "+ st.getNoOfShares());
            System.out.println("Price Of Each Stock ==> "+ st.getPriceOfEachStock());
            System.out.println("The Value of Stock ==> "+st.getStockVal());
        }
    }
}
