public class typeofShapeFactory {
    public abstractFactory gettypeofshapeFactory(String a)
    {
        if(a=="round")
        {
            return new abstractRoundShapeFactory();
        }
        else
        {
            return  new abstractCornerShapeFactory();
        }
    }

}
