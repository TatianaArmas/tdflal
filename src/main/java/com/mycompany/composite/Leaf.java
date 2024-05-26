
package com.mycompany.composite;

public class Leaf implements Component{
    
    public String name;
    
    public Leaf(String name){
        this.name= name;
    }
    
    @Override
    public void show(){
        System.out.println(name);
    }
}
