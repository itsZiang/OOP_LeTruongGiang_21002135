package decorator;

import java.util.*;

public class BreadStore {
    private List<Bread> breads;

    public BreadStore() {
        breads = new LinkedList<>();
    }

    /**
     * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
     * Bắt đầu, tạo ra và cho vào cửa hàng:
     * 5 bánh mỳ ThickcrustBread chỉ có cheese,
     * 5 bánh mỳ ThickcrustBread chỉ có olives,
     * 5 bánh mỳ ThickcrustBread có cả cheese và olives,
     * 5 bánh mỳ ThincrustBread chỉ có cheese,
     * 5 bánh mỳ ThincrustBread chỉ có olives,
     * 5 bánh mỳ ThincrustBread có cả cheese và olives.
     */
    public void init() {
        /* TODO */
        for (int i = 0; i < 5; i++) {
            add(new Cheese(new ThickcrustBread()));
            add(new Olives(new ThickcrustBread()));
            add(new Cheese(new Olives(new ThickcrustBread())));
            add(new Cheese(new ThincrustBread()));
            add(new Olives(new ThincrustBread()));
            add(new Cheese(new Olives(new ThincrustBread())));
        }
    }

    /**
     * Thêm bánh mỳ vào cửa hàng.
     */
    public void add(Bread bread) {
        /* TODO */
        breads.add(bread);
    }

    /**
     * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
     * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
     * bánh mỳ yêu cầu.
     * Nếu còn bánh mỳ để bán thì trả về giá trị true,
     * nếu không còn trả về giá trị false.
     */
    public boolean sell(Bread bread) {
        /* TODO */
        for (int i = 0; i < breads.size(); i++) {
            if (breads.get(i).cost() == bread.cost()) {
                breads.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * In ra những bánh mỳ còn trong cửa hàng.
     */
    public void print() {
        /* TODO */
        for (Bread bread : breads) {
            System.out.println(bread.getDescription() + ", cost=" + bread.cost());
        }
    }

    /**
     * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
     * nếu order là true, sắp xếp theo thứ tự tăng dần,
     * nếu order là false, sắp xếp theo thứ tự giảm dần.
     * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
     */
    public List<Bread> sort(boolean order) {
        /* TODO */
        List<Bread> breadList = new ArrayList<>(breads);
        breadList.sort(Comparator.comparingDouble(Bread::cost));
        if (!order) {
            Collections.reverse(breadList);
        }
        return breadList;
    }

    /**
     * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
     * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
     * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
     */
    public List<Bread> filter(int howMany, boolean order) {
        /* TODO */
        if (breads.isEmpty()) {
            return new ArrayList<>();
        }
        List<Bread> breadList = sort(order);
        howMany = Math.min(howMany, breads.size());
        breadList = breadList.subList(0, howMany);
        return breadList;
    }

    public static void main(String args[]) {
        BreadStore breadStore = new BreadStore();
        breadStore.init();

        /*
         * Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
         * - Thêm một số bánh mỳ vào cửa hàng
         * - Bán một số bánh mỳ từ cửa hàng
         * - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
         * - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
         */
        /* TODO */
        breadStore.add(new Cheese(new ThickcrustBread()));
        breadStore.add(new Olives(new ThincrustBread()));
        breadStore.add(new ThincrustBread());
        breadStore.add(new ThickcrustBread());
        System.out.println("After add: ");
        breadStore.print();

        breadStore.sell(new Cheese(new ThickcrustBread()));
        breadStore.sell(new Olives(new ThickcrustBread()));
        breadStore.sell(new Cheese(new ThincrustBread()));
        breadStore.sell(new Olives(new ThincrustBread()));
        breadStore.sell(new Olives(new Cheese(new ThincrustBread())));
        breadStore.sell(new Olives(new Cheese(new ThickcrustBread())));
        System.out.println("\nAfter sell: ");
        breadStore.print();

        System.out.println("\nSort by increase: ");
        List<Bread> sortedBreads = breadStore.sort(true);
        for (Bread bread : sortedBreads) {
            System.out.println(bread.getDescription() + ", cost=" + bread.cost());
        }

        System.out.println("\nMost 10 low cost bread: ");
        List<Bread> lowCostBreads = breadStore.filter(10, true);
        for (Bread bread : lowCostBreads) {
            System.out.println(bread.getDescription() + ", cost=" + bread.cost());
        }
    }
}
