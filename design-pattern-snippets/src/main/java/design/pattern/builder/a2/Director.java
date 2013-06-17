package design.pattern.builder.a2;

public class Director {
    private Builder builder;
    
    public void setBuilder(Builder p){
        this.builder = p;
    }

    public Product getProd(){
        return builder.getProduct();
    }

    public void createProduct(){        
        builder.createNewProd();
        builder.setName();
        builder.addPart();
        builder.setCreatedDate();
    }
}