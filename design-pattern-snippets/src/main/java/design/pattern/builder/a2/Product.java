package design.pattern.builder.a2;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private final List<String> parts = new ArrayList<String>(); 
    private String createdDate;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void addPart(String part) {
        parts.add(part);
    }

    public void showProd() {
        System.out.println("Prod name = " + name);
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("Prod infor = " + parts.get(i));
        }
        System.out.println("createdDate = " + createdDate);
    }
    
    public void setCreatedDate(String createdDate) {
        this.createdDate =  createdDate;
    }
}
