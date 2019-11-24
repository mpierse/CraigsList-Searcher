package mpierse.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLElement;

public class CraigslistService {

  public HtmlPage retreivePage() {
    String searchQuery = "kayak";
    WebClient client = new WebClient();
    client.getOptions().setCssEnabled(false);
    client.getOptions().setJavaScriptEnabled(false);
    HtmlPage page =getPage(client, searchQuery);
    client.close();
    return page;
  }

  public HtmlPage getPage(WebClient client, String searchQuery){
  try {
    String searchUrl = "https://delaware.craigslist.org/search/sss?sort=rel&query="
        + URLEncoder.encode(searchQuery, "UTF-8");
        return client.getPage(searchUrl);
  } catch (Exception e) {
    e.printStackTrace();
    System.out.println(e.getMessage());
  }
  return null;
}

  public void getItems(HtmlPage page) {
    List<HTMLElement> items = (List<HTMLElement>) page.getByXPath("//li[@class='result-row']");
    if (items.isEmpty()) {
      System.out.println("No items found !");
    } else {
      for (HTMLElement item : items) {
        System.out.println(item.getId());
        // HtmlAnchor itemAnchor = ((HtmlAnchor)
        // item.getFirstByXPath(".//p[@class='result-info']/a"));

        // HTMLElement spanPrice = ((HTMLElement)
        // item.getFirstByXPath(".//a/span[@class='result-price']"));

        // String itemName = itemAnchor.asText();
        // String itemUrl = itemAnchor.getHrefAttribute();

        // // It is possible that an item doesn't have any price
        // String itemPrice = spanPrice == null ? "0.0" : spanPrice.asText() ;

        // System.out.println( String.format("Name : %s Url : %s Price : %s", itemName,
        // itemPrice, itemUrl));
      }
    }
  }

  public void printIds() {
    try {
      getItems(retreivePage());
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
}

}