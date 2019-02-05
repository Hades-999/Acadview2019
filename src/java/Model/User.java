/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class User 
{
    private String Username=new String();
    private String Password=new String();

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String toString()
    {
        return this.Username+" "+this.Password; 
    }
    
    public boolean equals(Object o)
    {
        User u=(User) o;
        if(Username.equals(u.getUsername())&&Password.equals(u.getUsername()))
            return true;
        else 
            return false;
    }
}
