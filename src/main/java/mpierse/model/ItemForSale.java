package mpierse.model;

public class ItemForSale {

    private String url;
    private String title;
    private Integer price;
    private String city;

    public ItemForSale() {
    }

    public ItemForSale(String url, String title, Integer price, String city) {
        this.url = url;
        this.title = title;
        this.price = price;
        this.city = city;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}