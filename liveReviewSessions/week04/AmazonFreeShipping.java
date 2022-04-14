package week04;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        double totalPrice = 55.50;
        String result = "";
        if (totalPrice >= 25.0){
            result = "Free Shipping Eligible.Your order total : " + totalPrice;
        }else{
                result="Not Eligible For Free Shipping" + totalPrice;
            }
        System.out.println(result);
        System.out.println("Thanks for shopping with us!");
        }
    }

