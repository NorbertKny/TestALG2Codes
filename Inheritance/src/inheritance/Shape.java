/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author norbert.roland.kny
 */
public abstract class Shape {
    //private String name;
    protected String name = "Geom shape";
    //prepouzija sa v potomcich        
    public String getShapeName(){
        return this.getClass().getSimpleName();
    }
    //je treba ju prekryt v potomcich
    public abstract double area();
    
    public abstract double circum();
    //prekryva toString tridy Object a muze byt v potomcich
    @Override
    public String toString(){
        return name + ":" + getShapeName();
    }
}
