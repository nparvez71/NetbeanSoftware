package newpackage;
public class User {
    private int id;
    private String username;
    private String country;
    private String email;
    public User(int id, String username, String country, String email) {
        this.id = id;
        this.username = username;
        this.country = country;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }
    public static void main(String[] args) {
    }
    
}
