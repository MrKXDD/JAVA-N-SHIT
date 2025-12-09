package Object_Class;

public class Rectangle {
    float height;
    float width;

    public Rectangle(float w, float h) {
        height = h;
        width = w;
    }

    public float area(){
        float Area;
        Area = width*height;
        return Area;
    }

    public float perimeter(){
        float Perimeter;
        Perimeter = 2*(width+height);
        return Perimeter;
    }
}
