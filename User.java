public class User {
    private String id;
    private String password;
    private Role role;

    public User(String id, String password, Role role) {
        this.id = id;
        this.password = password;
        this.role = role;
    }

    public boolean login(String id, String pw) {
        return this.id.equals(id) && this.password.equals(pw);
    }

    public Role getRole() {
        return role;
    }

    public void akses() {
        role.aksesFitur();
    }
}
