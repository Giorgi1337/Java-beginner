package Enum;

public enum Season {
    SUMMER(25), WINTER(-22), AUTUMN(15), SPRING(22);

     private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "the temperature is : " + temp;
    }

    public int getTemp() {
        return temp;
    }
}
