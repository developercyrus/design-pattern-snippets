package design.pattern.builder.a2;

public class ProductBBuilder extends Builder {
    @Override
    public void setName() {
        prod.setName("B");
    }

    @Override
    public void addPart() {
        prod.addPart("PART 2");
    }
    
    @Override
    public void setCreatedDate() {
        prod.setCreatedDate("2013-06-15");         
    }
}