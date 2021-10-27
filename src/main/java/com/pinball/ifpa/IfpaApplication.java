package com.pinball.ifpa;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.pinball.ifpa.model.WorldRankings;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.MalformedURLException;

@SpringBootApplication
public class IfpaApplication {


    public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {


        try {
            WebClient webClient = new WebClient(BrowserVersion.CHROME);


            //configuring options
            webClient.getOptions().setUseInsecureSSL(true);
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setJavaScriptEnabled(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.getOptions().setThrowExceptionOnScriptError(false);

            //fetching the web page

            HtmlPage page = webClient.getPage("https://www.ifpapinball.com/rankings/overall.php?s=w&t=500&p=1");

            // this code isolates only the top 500 players in order and prevents other sections from printing
            HtmlTable attributes = (HtmlTable) page.getByXPath("//table[@class='table table-striped table-hover table-sm']").get(0);

//            for (int i = 0; i < attributes.getRowCount(); i++) {
//                for (int j = 0; j < attributes.getEndColumnNumber(); j++) {
//                    System.out.println(attributes.getCellAt(1, 3));
//                }
//            }
//      *****Returns Individual Cell data*****
//            System.out.println(attributes.asText());
            for (final HtmlTableRow row : attributes.getRows()) {
                for(final HtmlTableCell cell : row.getCells()){
                    System.out.println(cell);
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



