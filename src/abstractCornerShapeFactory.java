public class abstractCornerShapeFactory implements abstractFactory {
    @Override
    public shape abstractshape(String shapeType) {
        if(shapeType=="Rectangle")
        {
            return new rectangle(10,11);
        }
        return new square(10);
    }
}
