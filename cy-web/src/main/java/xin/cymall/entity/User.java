package xin.cymall.entity;


import java.io.Serializable;

public class User implements Serializable {

    //主键
    private  int id;
    //用户名
    private  String user_name;
    //密码
    private  String password;
    //年龄
    private  int age;

    public int getId() {
        return id;
    }


    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

}

