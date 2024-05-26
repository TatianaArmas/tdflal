
package com.mycompany.composite;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void show() {
        System.out.println(name);
        for (Component component : children) {
            component.show();
        }
    }
}
