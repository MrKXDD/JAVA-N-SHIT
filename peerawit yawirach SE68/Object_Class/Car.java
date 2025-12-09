package Object_Class;

public class Car {
    String Color;
    int Speed;
    int Mileage;

    public Car(String col){
        Color = col;
        Speed = 0;
        Mileage = 0;
    }

    public String getcolor(){
        return Color;
    }

    public int getspeed(){
        return Speed;
    }

    public int getmileage(){
        return Mileage;
    }

    public void setSpeed(int spd){
        Speed = spd;
    }

    public void setMileage(int mile){
        Mileage = mile;
    }
}
