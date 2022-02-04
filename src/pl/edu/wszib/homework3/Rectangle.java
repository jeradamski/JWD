package pl.edu.wszib.homework3;

public class Rectangle {

    int length;
    int width;

    public int area () {
        return length * width;
    }

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int a) {
        this.length = a;
        this.width = a;
    }
}
