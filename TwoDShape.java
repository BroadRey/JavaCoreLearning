/*
 * Создайте класс Circle, производный от класса TwoDShape. В нём должен быть
 * определён метод area(), вычисляющий площадь круга, а также конструктор с
 * ключевым словом super для инициализации членов, уснаследованных от класса TwoDShape.
 */


abstract class TwoDShape {
    private final double HIGHT;
    private final double WIDTH;

    TwoDShape() {
        HIGHT = 0.0;
        WIDTH = 0.0;
    }

    TwoDShape(int hight, int width) {
        this.HIGHT = hight;
        this.WIDTH = width;
    }

    TwoDShape(TwoDShape obj) {
        HIGHT = obj.HIGHT;
        WIDTH = obj.WIDTH;
    }

    abstract double area();
}

class Circle extends TwoDShape {

    private final double PI = 3.14;
    private final double R;

    Circle(int r) {
        this.R = r;
    }

    Circle(Circle obj) {
        super(obj);
        R = obj.R;
    }

    @Override
    double area() {
        return PI * R * R;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        System.out.println(circle.area());
    }
}
