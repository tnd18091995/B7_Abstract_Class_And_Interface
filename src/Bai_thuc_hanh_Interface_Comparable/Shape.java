package Bai_thuc_hanh_Interface_Comparable;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return "Green";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return true;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "A Shape with color of" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
