package edu.iu.habahram.ducksservice.model;

public final class Customer {

    private String username;
    private String password;
    private String email;

    public Customer(){}

    public Customer(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername(){return this.username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword(){return this.password;}
    public void setPassword(String password) {this.password = password;}
    public String getEmail(){return this.email;}
    public void setEmail(String email) {this.email = email;}




}
