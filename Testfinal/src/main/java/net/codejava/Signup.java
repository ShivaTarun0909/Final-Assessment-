package net.codejava;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Signup {
    private char email;
    private String pass;
    private String fpass;


    protected Signup() {
    }

    protected Signup(char email , String pass, String fpass) {
        super();
        this.email = email;
        this.pass = pass;
        this.fpass = fpass;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public char getId() {
        return email;
    }

    public void setemail(char email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setpass(String pass ) {
        this.pass = pass;
    }

    public String getFpass() {
        return fpass;
    }


}