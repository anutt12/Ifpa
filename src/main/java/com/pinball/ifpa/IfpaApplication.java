package com.pinball.ifpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.pinball.ifpa.model.WorldRankings;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class IfpaApplication {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {

//        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
//        MongoDatabase database = mongoClient.getDatabase("pinball_db");
//        database.createCollection("WorldRankings");
//        System.out.println("Collection created successfully");
//        MongoCollection<Document> collection = database.getCollection("WorldRankings");

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

            // isolating the ranking table
            HtmlTable rankings = (HtmlTable) page.getByXPath("//table[@class='table table-striped table-hover table-sm']").get(0);

            // this code isolates only the top 500 players in order and converts each data type to a cell

                File fileOut = new File("rankings.csv");
                FileWriter fileWriter = new FileWriter(fileOut, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(rankings.asText());
                    bufferedWriter.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}





