package week14.browserPagesInheritance;

public class AmazonHomePage extends Browser{

    public String product;

    public AmazonHomePage(String name){
        super(name);
    }

    public void navigateTo(String link){
        System.out.println("Navigating to "+ link + " using " + getName());
    }

    public void shopFor(String product){
        this.product=product;
        System.out.println("Navigating to "+this.product+" 's Page");
    }

    @Override
    public String toString() {
        return "AmazonHomePage{" +
                "product='" + product + '\'' +
                '}';
    }
}
