
public class Apple {
    private String sort;
    private String color;
    private double diameter;

    public Apple(String sort, String color, double diameter) {
        this.sort = sort;
        this.color = color;
        this.diameter = diameter;
    }

    public String getSort() {
        return sort;
    }

    public String getColor() {
        return color;
    }

    public double getDiameter() {
        return diameter;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(diameter, 3) / 6;
    }
}

