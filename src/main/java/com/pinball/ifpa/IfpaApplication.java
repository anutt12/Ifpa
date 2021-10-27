package com.pinball.ifpa;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.MalformedURLException;

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

            //fetching the web page

            HtmlPage page = webClient.getPage("https://www.ifpapinball.com/rankings/overall.php?s=w&t=500&p=1");


            HtmlTable attributes = (HtmlTable) page.getByXPath("//table[@class='table table-striped table-hover table-sm']").get(0);

                System.out.println(attributes.asText());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



