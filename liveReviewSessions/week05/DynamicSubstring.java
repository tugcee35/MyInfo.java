package week05;

public class DynamicSubstring {
    public static void main(String[] args) {

        String searchResult = "result count:12345";

        System.out.println(searchResult.substring(13));
        System.out.println(searchResult.substring(13, 18));

        System.out.println(searchResult.indexOf(":"));
        int colonIndex = searchResult.indexOf(":");

        System.out.println(searchResult.substring(colonIndex+1));
        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));
        String newsearchResult = searchResult.substring(searchResult.indexOf(":")+1);
        System.out.println("newsearchResult :" +newsearchResult);

        String searchResultTwo = " username:oscar search result count : 12345 more colon ";
        int firstColon = searchResultTwo.indexOf(":");
        System.out.println("firstColon = " +firstColon);
        int secondColon = searchResultTwo.indexOf(":",firstColon+1);
        System.out.println("secondColon = " + secondColon);

        System.out.println(searchResultTwo.substring(secondColon+1, secondColon+6));

        String today = " I coded a lot of [java] today";
        String word = today.substring(today.indexOf("[")+1, today.indexOf("]") );
        System.out.println("word = " + word);


    }
}
