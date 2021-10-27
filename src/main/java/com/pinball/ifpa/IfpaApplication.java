package com.pinball.ifpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.mongodb.client.MongoCollection;
import com.pinball.ifpa.model.WorldRankings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.core.mapping.Document;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

@SpringBootApplication
public class IfpaApplication {

    public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
        SpringApplication.run(IfpaApplication.class, args);

        try {
            WebClient webClient = new WebClient(BrowserVersion.CHROME);

            //configuring options
            webClient.getOptions().setUseInsecureSSL(true);
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setJavaScriptEnabled(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.getOptions().setThrowExceptionOnScriptError(false);


//        for (int page = 1; page <= 5; page++) {
            //fetching the web page

            HtmlPage page = webClient.getPage("https://www.ifpapinball.com/rankings/overall.php?s=w&t=500&p=1");
//            try {
            //selecting all headings

            DomNodeList<DomNode> headings = page.querySelectorAll("tbody");


//                if (headings.isEmpty()) {
//                    System.out.println("No items found.");
//                } else {
            //iterating and extracting
            for (DomNode content : headings) {
                System.out.println(content.asText());
//
//                ObjectMapper mapper = new ObjectMapper();
//                String jsonString = mapper.writeValueAsString(headings);
//                System.out.println(jsonString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



