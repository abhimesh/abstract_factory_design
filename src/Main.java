public class Main {
    public static void main(String[] args) {
        typeofShapeFactory typeofShapeFactory=new typeofShapeFactory();
        abstractFactory shapeFactory=typeofShapeFactory.gettypeofshapeFactory("corner");
        shape shape1=shapeFactory.abstractshape("Rectangle");
        System.out.println(shape1.calculateArea());
    }
}