package pack1;
import java.util.Set;
import java.util.TreeSet;

public class User implements Comparable<User>{
    private String login;
    private String password;
    private boolean access;


    public User(String login, String password, boolean access) {
        this.login = login;
        this.password = password;
        this.access = access;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    @Override
    public int compareTo(User o) {
        if (login.equals(o.getLogin()) && access == o.isAccess()){
            return 0;

        }
        else if (login.compareTo(o.getLogin())<0){
            return -1;
        }
        else return 1;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", access=" + access +
                '}';
    }
}