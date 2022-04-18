package week14.browserPagesInheritance;

public class Browser {
    private String browserType;
    private static String operatingSystem;

    public Browser(String name){
        browserType=name;
    }

    static {
        operatingSystem="Windows";
    }
    public String getName(){
        return browserType;
    }

    public void closeBrowser(){
        browserType=null;
    }

    public void setName(String name){
        if(browserType==null){
            this.browserType=name;
        }else{
            System.out.println("There is already an open browser : "+browserType);
        }
    }

    public static String getOSName(){
        return operatingSystem;
    }


}
