interface Shape
{
    double calArea();
    double calPermitere();

}

class Rectangle implements  Shape
{
    double width = 5;
    double height = 10 ;

    @Override
    public double calArea() {

        return height * width;
    }

    @Override
    public double calPermitere() {
        return (width + height) + 2;
    }
}

class Triangle implements  Shape
{
    double base = 5;
    double height = 10;

    double a_s1 = 5;
    double c_s2 = 5;


    @Override
    public double calArea() {
        return (base * height) * 2;
    }

    @Override
    public double calPermitere() {
        return a_s1 + c_s2 + base;
    }
}

class Circle implements  Shape
{

    double r = 3;
    @Override
    public double calArea() {
        return 3.14 * Math.pow(r,2);
    }

    @Override
    public double calPermitere() {
        return 2 * 3.14 * r;
    }
}

