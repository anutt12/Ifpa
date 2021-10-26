# ifpa

### Resources
[Web Scraping Tutorial](https://zenscrape.com/java-web-scraping-comprehensive-tutorial/)  
We first tried a simple jsoup crawler on [Books to Scrape](http://books.toscrape.com/index.html). The jsoup method successfully returned the endpoints and titles of the books on the home page. We decided to comment this code out and try the HtmlUnit because it allows us to block CSS and JavaScript to help simplify getting a website's data.  

We explored both options in the tutorial and found we understood the HtmlUnit method better. We removed the jsoup code that we tested scraping different types of data:  
>         Document page = Jsoup.connect("http://books.toscrape.com/index.html").get();

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

        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);

[Udemy: Professional Scraping with Java](https://www.udemy.com/course/learn-web-scraping-with-java-in-just-1-hour/)

[Stackoverflow](stackoverflow.com)

### ERD Diagram
[ERD Diagram!](photos/pinball-app.jpeg)
