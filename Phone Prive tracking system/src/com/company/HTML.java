package com.company;

public class HTML {


    public static String html(String key){

        if(key.equals("XS")) {
            String IphoneXS = new String("https://www.currys.co.uk/gbuk/phones-broadband-and-sat-nav/mobile-phones-and-accessories/mobile-phones/apple-iphone-se-64-gb-black-10204868-pdt.html");
            return IphoneXS;
        }


        if(key.equals("SE")) {
            String IphoneSE = new String("https://www.amazon.co.uk/dp/B0875K11W6/ref=uk_a_phone11_3");
            return IphoneSE;
        }

        if(key.equals("11")) {
            String Iphone11 = new String("https://www.amazon.co.uk/dp/B07XRNSMW5/ref=uk_a_phone11_2");
            return Iphone11;
        }



        if(key.equals("11pro")) {
            String Iphone11pro = new String("https://www.amazon.co.uk/dp/B07XRDXNQ5/ref=uk_a_phone11_1");
            return Iphone11pro;
        }




        return null;

    }
}
