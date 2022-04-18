package week14.browserPagesInheritance;

public class ProductPage extends AmazonHomePage {
    public int quantity;

    public ProductPage(String name, int quantity){
        super(name);
        this.quantity=quantity;
    }

    @Override
    public void shopFor(String product) {
        this.product=product;
        System.out.println("Automating "+getName());
        System.out.println("Adding "+quantity+" amount of "+super.product+" to cart");
    }




}
