package bg.foodorderingapplication.model.service;

public class RestaurantServiceModel {

    private String name;
    private String description;
    private String url;
    private String address;

    public RestaurantServiceModel() {
    }

    public String getName() {
        return name;
    }

    public RestaurantServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RestaurantServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RestaurantServiceModel setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantServiceModel setAddress(String address) {
        this.address = address;
        return this;
    }
}
