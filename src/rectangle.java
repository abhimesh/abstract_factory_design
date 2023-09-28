public class rectangle implements shape{
    int a;
    int b;
    rectangle(int a,int b)
    {
        this.a=a;this.b=b;
    }
    @Override
    public int calculateArea() {
        return a*b;
    }
}
