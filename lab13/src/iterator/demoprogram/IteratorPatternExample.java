package iterator.demoprogram;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog(new String[]{"Chair", "Table", "Board"});
        for (Iterator iterator = productCatalog.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
