/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Montesdeoca
 */
public class User {
    public static final String username = "testing";
    public static final String password = "123test";
    
    // Member variables
    private String user;
    private String pass;
    
    public User(String u, String p) {
        this.user = u;
        this.pass = p;
    }
    
    public boolean testUser() {
        if ((this.user.equals(username)) && (this.pass.equals(password))) 
            return true;
        
        return false;  
    }
    
    public String getUser() {
        return this.user;
    }
    
    public String getPassword() {
        return this.pass;
    }
    
    @Override
    public String toString() {
        return this.user + " " + this.pass;
    }
}
