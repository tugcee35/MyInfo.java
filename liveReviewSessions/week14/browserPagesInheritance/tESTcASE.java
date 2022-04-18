package week14.browserPagesInheritance;


public class tESTcASE {

    public static void main(String[] args) {

        AmazonHomePage amazonHomePage = new AmazonHomePage("Chrome");

        System.out.println("I am automating : "+ amazonHomePage.getName());
        System.out.println("My operating system is : " + Browser.getOSName());

        amazonHomePage.navigateTo("www.amazon.com");
        amazonHomePage.navigateTo("Search for laptops");
        amazonHomePage.shopFor("Samsung PC");

        ProductPage productObject = new ProductPage("Chrome", 2);
        productObject.shopFor(amazonHomePage.product);


        //productObject.navigateTo("Carl");
        CartPage cartPage = new CartPage("Chrome", "Mike Smith");
        cartPage.fillInfo();
        cartPage.payFor(9393939);
        cartPage.setName("Firefox");
        cartPage.closeBrowser();
        cartPage.setName("Firefox");
        System.out.println("I am automating : "+cartPage.getName());


    }
}
