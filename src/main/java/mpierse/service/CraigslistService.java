package mpierse.service;

import com.gargoylesoftware.htmlunit.WebClient;

public class CraigslistService {

public HtmlPage retreivePage(){
String searchQuery = "Iphone 6s" ;

WebClient client = new WebClient();  
client.getOptions().setCssEnabled(false);  
client.getOptions().setJavaScriptEnabled(false);  
try {  
  String searchUrl = "https://newyork.craigslist.org/search/sss?sort=rel&query=" + URLEncoder.encode(searchQuery, "UTF-8");
  HtmlPage page = client.getPage(searchUrl);
}catch(Exception e){
  e.printStackTrace();
}
}

}