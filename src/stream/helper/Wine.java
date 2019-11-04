package stream.helper;

/**
 * @author padovese
 * @since 03/11/2019
 */

public class Wine {
    private String name;
    private Grape grape;
    private WineType wineType;
    private int year;

    @Override
    public String toString(){
        return getName();
    }

    public Wine(String name, Grape grape, WineType wineType, int year) {
        this.name = name;
        this.grape = grape;
        this.wineType = wineType;
        this.year = year;
    }

    public Grape getGrape() {
        return grape;
    }

    public WineType getWineType() {
        return wineType;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
