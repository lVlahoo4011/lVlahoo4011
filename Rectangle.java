public class Rectangle{
    public float width;
    public float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getArea() {
        return (this.length * this.width);
    }

    public static void main (String[] args){
        System.out.println("");
    }
}