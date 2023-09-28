public class circle implements shape{
    int r;
    circle(int r)
    {
        this.r=r;
    }

    @Override
    public int calculateArea() {
        return (int)(3.14*r*r);
    }
}
