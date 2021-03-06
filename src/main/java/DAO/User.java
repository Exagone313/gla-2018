package DAO;

import java.util.ArrayList;

public class User{
	public String mail;
	public String password;
	public String username;
	public ArrayList<String> friends; //Liste d'username
	public ArrayList<String> maps; // Liste de nom des maps (parce que y'a pas d'increment id)
    
	public User()
	{
		
	}
    /**
     * 
     * @param mail
     * @param password
     */
    public User(String mail,String password){
        this.mail = mail;
        this.password = password;
    }
    
    /**
     * 
     * @param username
     * @param mail
     * @param password
     */
    public User(String username, String mail,String password){
        this.username = username;
    	this.mail = mail;
        this.password = password;
    }
    
    /**
     * 
     * @param username 
     */
    public void setUsername(String username){
        this.username = username;
    }
    
    /**
     * 
     */
    public String getUsername(){
        return this.username;
    }
    
    /**
     * 
     * @param password
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     * 
     */
    public String getPassword(){
        return this.password;
    }
    
    /**
     * 
     * @param mail
     */
    public void setMail(String mail){
        this.mail = mail;
    }
    
    /**
     * 
     */
    public String getMail(){
        return this.mail;
    }
    
    /**
     * @param user
     */
    void addFriend(String user){
        this.friends.add(user);
    }
    
    public ArrayList<String> getMaps(){
        return this.maps;
    }
    public void setMaps(ArrayList<String> maps)
    {
    	this.maps = maps;
    }
    
    /**
     * @param user 
     */
    void deleteFriend(User user){
        this.friends.remove(user);
    }
    
    @Override
    public String toString(){
        return "|mail : "+this.mail+", username : "+this.username+", password : "+this.password
        		+ ", friends : "+this.friends+", maps : "+this.maps+"\n";
    }
    
    /**
     * add a new Map
     * @param map 
     */
    public void addMap(String map){
        if(maps.contains(map))
            return;
        this.maps.add(map);
    }
    
    /**
     * 
     * @param map 
     */
    public void deleteMap(Map map){
        this.maps.remove(map);
    }
    

}
