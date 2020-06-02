package eneity;

import java.sql.PreparedStatement;

public class PersionIm {
    private String name;
    private String tel;
    private String add;
    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PersionIm(String name, String tel, String add, String username) {
        this.name = name;
        this.tel = tel;
        this.add = add;
        this.username = username;
    }

    @Override
    public String toString() {
        return "PersionIm{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", add='" + add + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
