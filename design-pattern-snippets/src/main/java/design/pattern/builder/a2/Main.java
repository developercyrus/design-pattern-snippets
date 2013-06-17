package design.pattern.builder.a2;

public class Main {
    
    /*
     * 1) sort of GOF
     */
    
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ProductABuilder());
        director.createProduct();
        Product productA = director.getProd();
        productA.showProd();

        director.setBuilder(new ProductBBuilder());
        director.createProduct();
        Product productB = director.getProd();
        productB.showProd();
    }
}
