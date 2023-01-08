package exercise1_5;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new ResizableCircle(1);
        System.out.println(geometricObject1);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());
//        geometricObject1.resize(50);

        Circle circle1 = (Circle) geometricObject1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
//        circle1.resize(50);

        ResizableCircle resizableCircle1 = (ResizableCircle) circle1;
        System.out.println(resizableCircle1);
        System.out.println(resizableCircle1.getArea());
        System.out.println(resizableCircle1.getPerimeter());
        resizableCircle1.resize(50);
        System.out.println(resizableCircle1);

        Resizable resizable1 = new ResizableCircle(2);
        System.out.println(resizable1);
//        System.out.println(resizable1.getArea());
//        System.out.println(resizable1.getPerimeter());
        resizable1.resize(50);
        System.out.println(resizable1);

        ResizableCircle resizableCircle2 = (ResizableCircle) resizable1;
        System.out.println(resizableCircle2);
        System.out.println(resizableCircle2.getArea());
        System.out.println(resizableCircle2.getPerimeter());
        resizableCircle2.resize(50);
        System.out.println(resizableCircle2);
    }
}
