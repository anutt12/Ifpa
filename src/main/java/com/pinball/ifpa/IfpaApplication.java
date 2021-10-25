package com.pinball.ifpa;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class IfpaApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(IfpaApplication.class, args);

        Document page = Jsoup.connect("http://books.toscrape.com/index.html").get();

        //selecting all hyperlinks
        Elements pageElements = page.select("a[href]");

        ArrayList<String> hyperLinks = new ArrayList<String>();

        //iterating and extracting
        for (Element e:pageElements) {
            hyperLinks.add("Text: " + e.text());
            hyperLinks.add("Link: " + e.attr("href"));
        }

        for (String s : hyperLinks) {
            System.out.println(s);
        }

    }



}
