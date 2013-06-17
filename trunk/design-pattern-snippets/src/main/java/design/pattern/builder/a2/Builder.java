package design.pattern.builder.a2;

public abstract class Builder {
    protected Product prod;

    public Product getProduct() {
        return this.prod;
    }

    public void createNewProd() {
        this.prod = new Product();
    }

    public abstract void setName();
    
    public abstract void addPart();
    
    public abstract void setCreatedDate();
}