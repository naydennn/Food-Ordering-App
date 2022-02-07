package bg.foodorderingapplication.model.binding;

public class UserUpdateBindingModel {

    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public UserUpdateBindingModel() {
    }

    public String getEmail() {
        return email;
    }

    public UserUpdateBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserUpdateBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserUpdateBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserUpdateBindingModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserUpdateBindingModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
