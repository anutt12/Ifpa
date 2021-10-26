package com.pinball.ifpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

@SpringBootApplication
public class IfpaApplication {

    public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
        SpringApplication.run(IfpaApplication.class, args);

//        Document page = Jsoup.connect("http://books.toscrape.com/index.html").get();
//
//        //selecting all hyperlinks
//        Elements pageElements = page.select("a[href]");
//
//        ArrayList<String> hyperLinks = new ArrayList<String>();
//
//        //iterating and extracting
//        for (Element e:pageElements) {
//            hyperLinks.add("Text: " + e.text());
//            hyperLinks.add("Link: " + e.attr("href"));
//        }
//
//        for (String s : hyperLinks) {
//            System.out.println(s);

//        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
//        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);

        WebClient webClient = new WebClient(BrowserVersion.CHROME);

        //configuring options
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);

        try {

            //fetching the web page

                HtmlPage page = webClient.getPage("https://books.toscrape.com/catalogue/page-");

                //selecting all headings
                DomNodeList<DomNode> headings = page.querySelectorAll("p, h3");

            if (headings.isEmpty()) {
                System.out.println("No items found.");
            } else {
                //iterating and extracting
                for (DomNode content : headings) {
                    System.out.println(content.asText());

                    ObjectMapper mapper = new ObjectMapper();
                    String jsonString = mapper.writeValueAsString(headings);
                    System.out.println(jsonString);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
