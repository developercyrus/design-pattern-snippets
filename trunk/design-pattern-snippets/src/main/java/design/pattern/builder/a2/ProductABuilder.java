package design.pattern.builder.a2;

public class ProductABuilder extends Builder {
    @Override
    public void setName() {
        prod.setName("A");
    }

    @Override
    public void addPart() {
        prod.addPart("PART 1");
    }
    
    @Override
    public void setCreatedDate() {
        prod.setCreatedDate("2013-06-17");         
    }
}