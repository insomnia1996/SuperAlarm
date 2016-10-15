package basic;

/**
 * date:2016-10-02
 * @author wangjksjtu
 */

public class User {
    private String mail;
    private String password;
    private String sex;
    private String name;
    private int age;
    private int vertifictionCode;
    private boolean isActivated = false; 
    ItemManager itemManager;
    static int count = 0;
    User(String m, String p, String n, int a, String s) {
        mail = m; password = p;
        name = n; age = a; sex = s;
    }
    User(String m, String p) {
        mail = m; password = p;
        sex = ""; name = ""; age = 0;
        ++count;
    }
    User() {this("","");}
    void setAll(String m, String p, String n, int a, String s) {
        mail = m; password = p;
        name = n; age = a; sex = s;        // May be I will delete this method
    }
    void setSex(String s) {sex = s;}
    void setName(String n) {name = n;}
    void setPassword(String p) {password = p;}
    void setAge(int a) {age = a;}
    void setVertifictionCode(int v) {vertifictionCode = v;}
    void activate() {isActivated = true;}
    void inactivate() { isActivated = false;}
    String getMail() {return mail;}
    String getSex() {return sex;}
    int getAge() {return age;}
    String getName() {return name;}
    String getPassword() {return password;}
    int getVertifictionCode() {return vertifictionCode;}
    int getCount() {return count;}
    public void finalize() {--count;}
    boolean equals(User user) {
        return mail.equals(user.mail) && password.equals(user.password) && name.equals(user.name)
                && age == user.age && sex.equals(user.sex);
    }
}