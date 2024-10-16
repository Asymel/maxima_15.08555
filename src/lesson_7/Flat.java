package lesson_7;

public class Flat {
    int square;
    int cost;
    String district;


    public Flat(int square) {
        this.square = square;
    }

    public Flat(int square, int cost) {
        this.square = square;
        this.cost = cost;



    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
