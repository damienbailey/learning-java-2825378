public class Triangle {


    //These are attribute or instance variables.
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;


    //This is the constructor. It initializes the instance variables.
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        this.base = base;                       //Allows you to assign values to inputs.
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
