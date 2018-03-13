package DAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


public class Map {
    public String name="NoDefined";
    public User user;
    public ArrayList<Location> locationList;
    public LocalDateTime created;
    public ArrayList<User> privateUsers;
    
    public boolean isPublic=true;
    public boolean isFavorite=false;
    
    /**
     * 
     * @param owner
     * @param name 
     */
    public Map(User owner, String name){
        this.name = name;
        this.user = owner;
        this.created = LocalDateTime.now();
    }
    
    /**
     * 
     * @param owner 
     */
    public Map(User owner){
        this.user = owner;
        this.created = LocalDateTime.now();
    }
    
    /**
     * 
     * @param name 
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * 
     */
    public void setFavorite(){
        isFavorite=true;
    }
    
    /**
     * 
     */
    public void setPrivate(){
        isPublic=false;
    }
    
    /**
     * 
     */
    public void changeFavorite(){
        isFavorite=!isFavorite;
    }
    
    /**
     * 
     */
    public void changePublic(){
        isPublic=!isPublic;
    }
    
    /**
     * 
     * @param location 
     */
    public void addLocation(Location location){
        this.locationList.add(location);
    }
    
    /**
     * 
     * @param location 
     */
    public void removeLocation(Location location){
        this.locationList.remove(location);
    }
    
    /**
     * 
     * @param user 
     */
    public void addPrivateUser(User user){
        if(this.user != user){
            
        this.privateUsers.add(user);
        user.addMap(this.name);
        }
    }
    
    /**
     * 
     * @param user 
     */
    public void removePrivateUser(User user){
        if(this.user != user){
        this.privateUsers.remove(user);
        user.deleteMap(this);
        }
    }
}