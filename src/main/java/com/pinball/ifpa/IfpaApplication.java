package com.pinball.ifpa;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gargoylesoftware.htmlunit.*;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class IfpaApplication {

    public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
        SpringApplication.run(IfpaApplication.class, args);

//        Document page = Jsoup.connect("https://www.barnesandnoble.com/b/books/fiction/thrillers/_/N-1z0zta0Z29Z8q8Z1d3u?Nrpp=20&page=1").get();
//
//        //selecting all hyperlinks
//        Elements pageElements = page.select("a[title]");
//
//        ArrayList<String> hyperLinks = new ArrayList<String>();
//
//        //iterating and extracting
//        for (Element e:pageElements) {
//            hyperLinks.add("Text: " + e.text());
//        }
//
//        for (String s : hyperLinks) {
//            System.out.println(s);
//        }
//    }


        WebClient webClient = new WebClient(BrowserVersion.CHROME);

        //configuring options
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setPrintContentOnFailingStatusCode(false);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 62; i++) {
            list.add(i);
        }

        //fetching the web page
        HtmlPage page = webClient.getPage("https://www.ifpapinball.com/rankings/page-");

        List<?> anchors = page.getByXPath("//li[@class='card-link']");
        for (int i = 0; i < anchors.size(); i++) {
            HtmlAnchor link = (HtmlAnchor) anchors.get(i);
            String recipeTitle = link.getAttribute("title").replace(',', ';');
            String recipeLink = link.getHrefAttribute();
        }


//   *********** THE BELOW CODE RETURNS DATA ONLY FROM A SINGLE PAGE***********
        //selecting all headings
        DomNodeList<DomNode> headings = page.querySelectorAll("title");
//
//        //iterating and extracting
        for (DomNode content : headings) {
            System.out.println(content.asText());
        }

    }

