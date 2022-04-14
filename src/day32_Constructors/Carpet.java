package day32_Constructors;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersion;

    public Carpet(double width, double length, double unitPrice, boolean isPersion) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersion = isPersion;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersion){
            totalPrice+= 200;
        }
        return  totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersion=" + isPersion +
                ", totalPrice= $" + calcCost() +
                '}';
    }

}
