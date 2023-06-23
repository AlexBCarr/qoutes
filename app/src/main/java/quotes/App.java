package quotes;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File filePath = new File("src/main/resources/recentquotes.json");
        QuoteReader quoteReader = new QuoteReader(filePath);
        Quote randQuote = quoteReader.getRandomQuote();

        System.out.println("Quote: " + randQuote.getText());
        System.out.println("Author: " + randQuote.getAuthor());
    }
}