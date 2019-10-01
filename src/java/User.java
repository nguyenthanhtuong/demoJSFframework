/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWall
 */
//package managedbean;
//Facelet Tilte
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class User {
    String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
