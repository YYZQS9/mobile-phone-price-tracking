package com.company;

public class HTML {


    public static String html(String key){

        if(key.equals("IphoneXS")) {

            //Argos iPhone XS。
            Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-for-iphone-xs-range?tag=ar:iphoneriverpage"), 100000);
            Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
            for (Element element1 : element) {
                String aLink = element1.attr("abs:href");
                System.out.println(aLink);
            }

            //第二个网站PCWorld
            Document doc1 = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-xs/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00312946/xx-criteria.html"), 100000);
            Elements element2 = doc1.select("header.productTitle a");
            for (Element element1 : element2) {
                String aLink = element1.attr("href");
                System.out.println(aLink);
            }
        }


        if(key.equals("IphoneSE")) {
            //Argos iPhone SE。
            Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/pre-order-new-iphone-se/?tag=ar:search:m020:iphonese-preorder"), 100000);
            Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
            for (Element element1 : element) {
                String aLink = element1.attr("abs:href");
                System.out.println(aLink);
            }

            //第二个网站PCWorld
            Document doc1 = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-se/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00309808/xx-criteria.html"), 100000);
            Elements element2 = doc1.select("header.productTitle a");
            for (Element element1 : element2) {
                String aLink = element1.attr("href");
                System.out.println(aLink);
            }
        }

        if(key.equals("Iphone11")) {
            //Argos iPhone 11。
            Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-iphone-11?tag=ar:river:apple:iphone11:fromtable:iphone11"), 100000);
            Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
            for (Element element1 : element) {
                String aLink = element1.attr("abs:href");
                System.out.println(aLink);
            }

            //第二个网站PCWorld
            Document doc1 = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/apple-phones-broadband-and-sat-nav/mobile-phones-and-accessories/mobile-phones/362_3412_32041_267_ba00011553-bv00313386%7Cbv00313387%7Cbv00313391/xx-criteria.html"), 100000);
            Elements element2 = doc1.select("header.productTitle a");
            for (Element element1 : element2) {
                String aLink = element1.attr("href");
                System.out.println(aLink);
            }
        }



        if(key.equals("Iphone11pro")) {
            //Argos iPhone 11pro。
            Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-iphone-11-pro?tag=ar:river:apple:iphone11:fromtable:iphone11pro"), 100000);
            Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
            for (Element element1 : element) {
                String aLink = element1.attr("abs:href");
                System.out.println(aLink);
            }

            //第二个网站PCWorld
            Document doc1 = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/apple-iphone-11-pro/mobile-phones-and-accessories/mobile-phones/362_3412_32041_267_ba00011553-bv00313387/xx-criteria.html"), 100000);
            Elements element2 = doc1.select("header.productTitle a");
            for (Element element1 : element2) {
                String aLink = element1.attr("href");
                System.out.println(aLink);
            }
        }


        if(key.equals("Iphone11proMax")) {
            //Argos iPhone 11promax。
            Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-iphone-11-pro?tag=ar:river:apple:iphone11:fromtable:iphone11promax"), 100000);
            Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
            for (Element element1 : element) {
                String aLink = element1.attr("abs:href");
                System.out.println(aLink);
            }

            //第二个网站PCWorld
            Document doc1 = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/apple-iphone-11-pro-max/mobile-phones-and-accessories/mobile-phones/362_3412_32041_267_ba00011553-bv00313391/xx-criteria.html"), 100000);
            Elements element2 = doc1.select("header.productTitle a");
            for (Element element1 : element2) {
                String aLink = element1.attr("href");
                System.out.println(aLink);
            }
        }


        if(key.equals("IphoneXSMax")) {
            //Argos iPhone XS Max。
            Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/search/iphone-xs-max/?clickOrigin=searchbar:search:term:iphone+xs+max"), 100000);
            Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
            for (Element element1 : element) {
                String aLink = element1.attr("abs:href");
                System.out.println(aLink);
            }

            //第二个网站PCWorld
            Document doc1 = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-xs-max/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00312947/xx-criteria.html"), 100000);
            Elements element2 = doc1.select("header.productTitle a");
            for (Element element1 : element2) {
                String aLink = element1.attr("href");
                System.out.println(aLink);
            }
        }


        if(key.equals("IphoneXR")) {
            //Argos iPhone XR。
            Document doc = Jsoup.parse(new URL("https://www.argos.co.uk/list/shop-for-iphone-xr/?tag=ar:apple-iphone-xr:link-1"), 100000);
            Elements element = doc.select("div.ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb a");
            for (Element element1 : element) {
                String aLink = element1.attr("abs:href");
                System.out.println(aLink);
            }

            //第二个网站PCWorld
            Document doc1 = Jsoup.parse(new URL("https://www.currys.co.uk/gbuk/iphone-xr/mobile-phones-and-accessories/mobile-phones/362_3412_32041_xx_ba00011553-bv00313051/xx-criteria.html"), 100000);
            Elements element2 = doc1.select("header.productTitle a");
            for (Element element1 : element2) {
                String aLink = element1.attr("href");
                System.out.println(aLink);
            }
        }
        return null;
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
}
