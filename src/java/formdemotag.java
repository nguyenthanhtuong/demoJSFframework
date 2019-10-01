/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWall
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "formdemotag", eager = true) 
@SessionScoped
public class formdemotag {
    private String name;
  private String password;
  private String description;
  private String gender;
  private String[] favorites;
  private String[] skills;
  private String title;
  
  public String submit() {
    return "resultformtag.xhtml";
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getGender() {
    return gender;
  }
    public void setGender(String gender) {
    this.gender = gender;
  }
  public String[] getFavorites() {
    return favorites;
  }
  public void setFavorites(String[] favorites) {
    this.favorites = favorites;
  }
  public String[] getSkills() {
    return skills;
  }
public void setSkills(String[] skills) {
    this.skills = skills;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
}
