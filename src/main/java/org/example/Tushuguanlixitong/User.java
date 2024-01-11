package org.example.Tushuguanlixitong;

/**
 * 子类--用户类
 * @author 86150
 * @date 2024/1/10 16:30
 */
public class User extends BaseEntity{
    private String username;   //用户名
    private String password;   //密码

    public User() {
    }

    public User(int id) {
        super(id);
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(int id, String username, String password) {
        super(id);
        this.username = username;
        this.password = password;
    }
}
