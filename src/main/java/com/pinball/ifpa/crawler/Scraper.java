package com.pinball.ifpa.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

//public class Scraper {
//
//    Document page = Jsoup.connect("http://books.toscrape.com/index.html").get();
//
//    Elements pageElements = page.select("a[href]");
//
//    ArrayList<String> hyperLinks = new ArrayList<String>();
//
//// iterating and extracting
//for (
//    Element e:pageElements) {
//        hyperLinks.add("Text: " + e.text());
//        hyperLinks.add("Link: " + e.attr("href"));
//    }
//
//for (String s : hyperLinks) {
//        System.out.println(s);
//    }
//}
