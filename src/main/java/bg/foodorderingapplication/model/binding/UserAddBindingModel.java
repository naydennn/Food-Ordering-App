package bg.foodorderingapplication.model.binding;

public class UserAddBindingModel {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public UserAddBindingModel() {
    }

    public String getEmail() {
        return email;
    }

    public UserAddBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserAddBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserAddBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserAddBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserAddBindingModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserAddBindingModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
