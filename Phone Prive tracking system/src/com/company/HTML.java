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


        
        
        //PCWorldIphone11
    public void PCWorldIphone11() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/apple-phones-broadband-and-sat-nav/mobile-phones-and-accessories/mobile-phones/362_3412_32041_267_ba00011553-bv00313386%7Cbv00313387%7Cbv00313391/xx-criteria.html"), 100000);
        Elements element = doc.select("header.productTitle a");
        for (Element element1 : element) {
            System.out.println(element1.text());
            String aLink = element1.attr("href");
            System.out.println(aLink);
        }
    }

    //PCWorldIphone11pro
    public void PCWorldIphone11pro() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/apple-iphone-11-pro/mobile-phones-and-accessories/mobile-phones/362_3412_32041_267_ba00011553-bv00313387/xx-criteria.html"), 100000);
        Elements element = doc.select("header.productTitle a");
        for (Element element1 : element) {
            System.out.println(element1.text());
            String aLink = element1.attr("href");
            System.out.println(aLink);
        }
    }


    //PCWorldIphone11proMax
    public void PCWorldIphone11proMax() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/apple-iphone-11-pro-max/mobile-phones-and-accessories/mobile-phones/362_3412_32041_267_ba00011553-bv00313391/xx-criteria.html"), 100000);
        Elements element = doc.select("header.productTitle a");
        for (Element element1 : element) {      
            System.out.println(element1.text());
            String aLink = element1.attr("href");
            System.out.println(aLink);
        }
    }

    //PC world iPhone XS。
    public void PCWorldIphoneXS() throws Exception{       
        Document doc = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-xs/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00312946/xx-criteria.html"), 100000);
        Elements element = doc.select("header.productTitle a");
        for (Element element1 : element) {         
            System.out.println(element1.text());
            String aLink = element1.attr("href");
            System.out.println(aLink);
        }
    }

    //PC world iPhone XSMax。
    public void PCWorldIphoneXSMax() throws Exception{     
        Document doc = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-xs-max/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00312947/xx-criteria.html"), 100000);
        Elements element = doc.select("header.productTitle a");
        for (Element element1 : element) {          
            System.out.println(element1.text());
            String aLink = element1.attr("href");
            System.out.println(aLink);
        }
    }

    //PC world iPhone XR。
    public void PCWorldIphoneXR() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-xr/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00313051/xx-criteria.html"), 100000);
        Elements element = doc.select("header.productTitle a");
        for (Element element1 : element) {          
            System.out.println(element1.text());
            String aLink = element1.attr("href");
            System.out.println(aLink);
        }
    }

    //PC world iPhone SE。
    public void PCWorldIphoneSE() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-se/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00309808/xx-criteria.html"), 100000);
        Elements element = doc.select("header.productTitle a");
        for (Element element1 : element) {
            System.out.println(element1.text());
            String aLink = element1.attr("href");
            System.out.println(aLink);
        }
    }


    //Argos iPhone11 。
    public void ArgosiPhone11() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-iphone-11?tag=ar:river:apple:iphone11:fromtable:iphone11"), 100000);
        Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
        for (Element element1 : element) {
            String aLink = element1.attr("abs:href");
            System.out.println(aLink);

        }
    }
    //Argos iPhone11 pro 。
    public void ArgosIPhone11Pro() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-iphone-11-pro?tag=ar:river:apple:iphone11:fromtable:iphone11pro"), 100000);
        Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
        for (Element element1 : element) {
            String aLink = element1.attr("abs:href");
            System.out.println(aLink);

        }
    }
    //Argos iPhone11 pro Max 。
    public void ArgosIPhone11ProMax() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-iphone-11-pro?tag=ar:river:apple:iphone11:fromtable:iphone11promax"), 100000);
        Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
        for (Element element1 : element) {
            String aLink = element1.attr("abs:href");
            System.out.println(aLink);

        }
    }
    //Argos iPhoneXS 。
    public void ArgosIPhoneXS() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-for-iphone-xs-range?tag=ar:iphoneriverpage"), 100000);
        Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
        for (Element element1 : element) {
            String aLink = element1.attr("abs:href");
            System.out.println(aLink);

        }
    }


    //Argos iPhoneXSMax 。
    public void ArgosIPhoneXSMax() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/search/iphone-xs-max/?clickOrigin=searchbar:search:term:iphone+xs+max"), 100000);
        Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
        for (Element element1 : element) {
            String aLink = element1.attr("abs:href");
            System.out.println(aLink);

        }
    }
    //Argos iPhoneXR 。
    public void ArgosIPhoneXR() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-for-iphone-xr/?tag=ar:apple-iphone-xr:link-1"), 100000);
        Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
        for (Element element1 : element) {
            String aLink = element1.attr("abs:href");
            System.out.println(aLink);

        }
    }
    //Argos iPhoneSE 。
    public void ArgosIPhoneSE() throws Exception{
        Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/pre-order-new-iphone-se/?tag=ar:search:m020:iphonese-preorder"), 100000);
        Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
        for (Element element1 : element) {
            String aLink = element1.attr("abs:href");
            System.out.println(aLink);

        }
    }


        return null;

    }
}
