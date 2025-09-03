public class User {

    private String userId;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String userType;
    private boolean loggedIn;

    public User(String userId, String name, String password, String email, String phone, String userType) {
        this.userId = userId;
        this.name = name;
        this.password= password;
        this.email = email;
        this.phone = phone;
        this.userType = userType;
        this.loggedIn = false;
    }

   
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            this.loggedIn = true;
            System.out.println(name + " logged in successfully!");
            return true;
        } else {
            System.out.println("Login failed. Invalid credentials.");
            return false;
        }
    }

    public void logout() {
        if (loggedIn) {
            this.loggedIn = false;
            System.out.println(name + " has logged out.");
        } else {
            System.out.println(name + " is not logged in.");
        }
    }

     public void editProfile(String newName, String newEmail, String newPhone) {
        if (newName != null) name = newName;
        if (newEmail != null) email = newEmail;
        if (newPhone != null) phone = newPhone;
        System.out.println("Profile updated successfully.");
    }

    public void changePassword(String oldPassword, String newPassword) {
    if (this.password.equals(oldPassword)) {
        this.password = newPassword;
        System.out.println("Password updated successfully.");
    } else {
        System.out.println("Incorrect old password. Password not changed.");
    }
}

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getUserType() { return userType; }
}

