package eneity;

public class Persion {
    private String username;
    private String password;
    private String tel;
    private String add;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Persion(String username, String tel, String add, String password) {
        this.username = username;
        this.tel = tel;
        this.add = add;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", add='" + add + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
