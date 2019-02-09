package entity;

import java.sql.Timestamp;

public class Excursion {

    private int excursionId;
    private String name;
    private float price;
    private Timestamp startTime;
    private Timestamp duration;

    public Excursion(int excursionId, String name, float price, Timestamp startTime, Timestamp duration) {
        this.excursionId = excursionId;
        this.name = name;
        this.price = price;
        this.startTime = startTime;
        this.duration = duration;
    }

    public Excursion() {
    }

    public int getExcursionId() {
        return excursionId;
    }

    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getDuration() {
        return duration;
    }

    public void setDuration(Timestamp duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Excursion excursion = (Excursion) o;

        if (excursionId != excursion.excursionId) return false;
        if (Float.compare(excursion.price, price) != 0) return false;
        if (name != null ? !name.equals(excursion.name) : excursion.name != null) return false;
        if (startTime != null ? !startTime.equals(excursion.startTime) : excursion.startTime != null) return false;
        return duration != null ? duration.equals(excursion.duration) : excursion.duration == null;
    }

    @Override
    public int hashCode() {
        int result = excursionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "excursionId=" + excursionId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", startTime='" + startTime + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }


}
