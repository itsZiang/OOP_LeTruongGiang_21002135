package iterator.demoprogram;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;

    public ProductCatalog(String[] productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int position;

        public ProductIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < productCatalog.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return productCatalog[position++];
            }
            return null;
        }
    }
}
