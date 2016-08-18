package Aug4.Demo1.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class Dog {
    private String name;
    private String color;
    private String brand;
    public Dog(){}
    public Dog(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "一条名字叫"+name+"的"+color+"颜色的"+brand+"狗";
    }
}
