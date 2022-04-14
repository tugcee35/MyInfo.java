package day31.Constructors.day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.setInfo("VA", "Amazon", "SDET", 90.000, true, true, true, true);

        Offer offer2 = new Offer();

        offer2.setInfo("LA", "Apple", "SDET", 111000, true, false,true, true);

        Offer offer3 = new Offer();

        offer3.setInfo("CA", "Sony", "QA", 900.0000, false,false, true, true);

        Offer offer4 = new Offer();

        offer4.setInfo("FL", "Facebook", "QE", 125000, true, true, true, false);

        Offer offer5 = new Offer();

        offer5.setInfo("TX", "Capital One", "SM", 115500, false, false, false,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("-----------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffer = new ArrayList<>(Arrays.asList(myOffers));
        localOffer.removeIf(p-> !(p.location.equals("VA") || p.location.equals("CA")));

        System.out.println(localOffer.size());

        for (Offer localOffers : localOffer) {
            System.out.println(localOffers.companyName +" : "+ localOffers.salary);
        }
    }
}
