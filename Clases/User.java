public abstract class User {
    private String name;
    private String lastName;
    private String email;

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public abstract void displayUserInfo();


}
