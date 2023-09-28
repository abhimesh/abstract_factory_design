public class square implements shape{
    int a;
    square(int a)
    {
        this.a=a;
    }
    @Override
    public int calculateArea() {
        return a*a;
    }
}
