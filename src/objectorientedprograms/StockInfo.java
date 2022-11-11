package objectorientedprograms;

public class StockInfo {
    private final String stockName;
    private int noOfShares;
    private final double priceOfEachStock;
    private double stockVal;

    StockInfo(String stockName, int noOfShares, double priceOfEachStock){
        this.stockVal = noOfShares * priceOfEachStock;
        this.stockName = stockName;
        this.noOfShares = noOfShares;
        this.priceOfEachStock = priceOfEachStock;
    }

    public String getStockName() {
        return stockName;
    }

//    public void setStockName(String stockName) {
//        this.stockName = stockName;
//    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
        setStockVal(this.noOfShares * this.priceOfEachStock);

    }

    public double getPriceOfEachStock() {
        return priceOfEachStock;
    }

//    public void setPriceOfEachStock(double priceOfEachStock) {
//        this.priceOfEachStock = priceOfEachStock;
//    }

    public double getStockVal() {
        return stockVal;
    }

    public void setStockVal(double stockVal) {
        this.stockVal = stockVal;
    }
}
