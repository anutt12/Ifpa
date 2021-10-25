package com.pinball.ifpa.crawler;

import org.jsoup.Jsoup;
import org.springframework.data.mongodb.core.mapping.Document;

public class Scraper {

    Document page = Jsoup.connect("http://books.toscrape.com/index.html").get();
}
