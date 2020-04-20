package com.company;

import net.sf.json.JSONObject;

import javax.swing.text.html.HTML;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import net.sf.json.JSONObject;

public class IPhone {

    public static void AmazonIPHONE(String urll) {
        try {
            String username = "yy";
            String apiKey = "JBeBKHtj6uatVmQzOYp3Krvwu";
            String originalInput = username + ":" + apiKey;
            String encodedString = "Basic " + Base64.getEncoder().encodeToString(originalInput.getBytes());

            String apiEndPoint = "http://api.scraping-bot.io/scrape/retail";
            URL url = new URL(apiEndPoint);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Authorization", encodedString);

            String useChrome = "false";//set to "true" if you want to use headless chrome for javascript rendering
            String premiumProxy = "false";//set to "true" if you want to use premium proxies Unblock Amazon,Google,Rakuten
            String urlToScrape = urll;

            String param = "{\"url\":\"" + urlToScrape + "\"," +
                    "\"options\":{" +
                    "\"useChrome\":" + useChrome + "," +
                    "\"premiumProxy\":" + premiumProxy +
                    "}" +
                    "}";

            con.setDoOutput(true);
            OutputStream out = con.getOutputStream();
            out.write(param.getBytes());
            out.flush();
            out.close();

            //int status = con.getResponseCode();
            //System.out.println(status);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            String jsonResponse = content.toString();
            System.out.println(jsonResponse);

            JSONObject json2 = JSONObject.fromObject(jsonResponse);

            String data=json2.getString("data");
            JSONObject json3= JSONObject.fromObject(data);
            String title=json3.getString("title");
            String price=json3.getString("price");
            String siteURL=json3.getString("siteURL");
            String host=json3.getString("host");



            System.out.println(title);
            System.out.println(price);
            System.out.println(siteURL);
            System.out.println(host);





//            String[] json = jsonResponse.split(",");
//            String model = json[1].substring(16);
//            System.out.println("    model:" + model);
//
//            String image = json[3];
//            System.out.println("    " + image);
//
//            String price = json[4].substring(8);
//            System.out.println("    price: £" + price);
//
//
//            String siteURL = json[15];
//            System.out.println("    " + siteURL);
//
//
//            String description = json[26].substring(17);
//            System.out.println("    description:" + description);


            in.close();
            con.disconnect();


        } catch (Exception e) {
            System.out.println("An error occured while scraping:" + e);
        }

    }

}