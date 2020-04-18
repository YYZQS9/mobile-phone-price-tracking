package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;

public class AdvancedRawJava {
    public static String link;
    public static void main(String[] args) throws IOException {

        System.out.print("Enter an IPhone model:\n");

        Scanner sc=new Scanner(System.in);
        String keyword=new String();
        keyword=sc.next();
        System.out.println(keyword+"    detail inforamtion:");

        //if(keyword.equals("SE"))
        link=HTML.html(keyword);
        IPhone.AmazonIPHONE(link);

   }
}
