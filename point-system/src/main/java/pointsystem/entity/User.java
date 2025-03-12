package pointsystem.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = "usuario_email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private int userId;

    @Column(name = "usuario_nome")
    private String username;

    @Column(name = "usuario_senha")
    private String password;

    @Column(name = "usuario_email", unique = true)
    private String email;



    public User() {}

    public User(int userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}