package entity;

public class Excursion {

    private int excursionId;
    private String name;
    private int price;
    private String startTime;
    private String duration;

    public Excursion(int excursionId, String name, int price, String startTime, String duration) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Excursion excursion = (Excursion) o;

        if (excursionId != excursion.excursionId) return false;
        if (price != excursion.price) return false;
        if (name != null ? !name.equals(excursion.name) : excursion.name != null) return false;
        if (startTime != null ? !startTime.equals(excursion.startTime) : excursion.startTime != null) return false;
        return duration != null ? duration.equals(excursion.duration) : excursion.duration == null;
    }

    @Override
    public int hashCode() {
        int result = excursionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
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
