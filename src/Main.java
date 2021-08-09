public class Main {
    public static void main(String[] args) {
        Shape A = new Triangle();
        Shape B = new Square();
        Shape C = new Octagon();
        Dimensions Print = new Dimensions();
        Print.PrintDimensions(A);
        Print.PrintDimensions(B);
        Print.PrintDimensions(C);
    }
}
