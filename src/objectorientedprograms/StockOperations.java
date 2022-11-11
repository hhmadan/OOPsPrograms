package objectorientedprograms;

import java.util.Scanner;

public class StockOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME..!");
        StockAccount sa = new StockAccount("username", 100000);

            System.out.println("----MAIN MENU----\n1.Buy Stock\n2.Sell Stock\n3.Credit Amount in Account\n4.Display Balance\nEnter the Option Number: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    sa.buy();
                    break;
                case 2:
                    sa.sell();
                    break;
                case 3:
                    sa.save();
                    break;
                case 4:
                    sa.valueOf();
                    break;
                case 5:
                    Portfolio pf = new Portfolio();
                    pf.printReport();
                    break;
                default:
                    break;
            }
        }
    }
