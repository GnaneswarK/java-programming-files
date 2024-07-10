class Shape {
    int length;
    int breadth;

    public Shape() {
        length = 0;
        breadth = 0;
        System.out.println("length,breadth = " + length + "," + breadth);
    }

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("length,breadth = " + length + "," + breadth);
    }

    Shape(int lb) {
        length = lb;
        breadth = lb;
        System.out.println("length,breadth = " + length + "," + breadth);
    }

    Shape(Shape s) {
        length = s.length;
        breadth = s.breadth;
        System.out.println("length,breadth = " + length + "," + breadth);
    }

    public int Shape(int i, int j, int k) {
        length = i + k;
        breadth = j + k;
        return length * breadth;
    }
}

public class VariousTypesOfConstructors {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape = new Shape(20, 30);
        shape = new Shape(15);
        shape = new Shape(shape);
        System.out.println("Length*breadth using return type Int " + shape.Shape(12, 13, 15));
    }
}