// Somesh Raj
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class StockMarketPredictor {

    static class StockData {
        LocalDate date;
        double openingPrice;
        double closingPrice;
        double high;
        double low;
        double volume;
        
        public StockData(LocalDate date, double openingPrice, double closingPrice,
                         double high, double low, double volume) {
            this.date = date;
            this.openingPrice = openingPrice;
            this.closingPrice = closingPrice;
            this.high = high;
            this.low = low;
            this.volume = volume;
        }
        
    }

    public double predictNextClosingPrice(List<StockData> historicalData) {
        double sum = 0;
        int count = 0;
        for (StockData data : historicalData) {
            sum += data.closingPrice;
            count++;
        }
        return sum / count; // This is a simple moving average (not necessarily reflecting real-world complexity)
    }
    
    // Main method to execute our predictor
    public static void main(String[] args) {
        List<StockData> historicalData = Arrays.asList(
            new StockData(LocalDate.of(2023, 4, 1), 150, 155, 157, 149, 3000000),
        );
        
        StockMarketPredictor predictor = new StockMarketPredictor();
        double predictedClosingPrice = predictor.predictNextClosingPrice(historicalData);
        System.out.println('Predicted next closing price: ' + predictedClosingPrice);
    }
}