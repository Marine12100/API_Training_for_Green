/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.training_for_green;

/**
 *
 * @author ThomasAndres
 */
public abstract class ConnectionString {
    private String name = "StdConnection";
    private String port="5432";
    private String username="postgres";
    private String dbName="training_for_green";

    private String host="localhost"; 
    private String password="xxxxx";

    protected ConnectionString(String name) {
        this.setName(name);
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getStringConnection(){
        return "jdbc:postgresql://"+this.host+":"+this.getPort()+"/"+this.dbName+"";
    }
}

