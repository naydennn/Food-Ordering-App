package bg.foodorderingapplication.model.binding;


public class RestaurantAddBindingModel {

    private String name;
    private String description;
    private String url;
    private String address;

    public RestaurantAddBindingModel() {
    }

    public String getName() {
        return name;
    }

    public RestaurantAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RestaurantAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RestaurantAddBindingModel setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantAddBindingModel setAddress(String address) {
        this.address = address;
        return this;
    }
}
