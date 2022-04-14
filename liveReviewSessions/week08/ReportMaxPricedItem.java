package week08;

public class ReportMaxPricedItem {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        double maxPrice = prices[0]; // assume that first one is max price
        int indexOfMaxPrice = 0; //assume that first one is max price

        //Assumptions for the minimm price can be same with max assumption.
        double minPrice = prices[0];
        int indexOfMinPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
            if(prices[i]<minPrice){
                minPrice=prices[i];
                indexOfMinPrice=i;
            }
        }

        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("-------------------------");
        System.out.println("indexOfMinPrice = " + indexOfMinPrice);
        System.out.println("minPrice = " + minPrice);

    }
}
