package entity;

/**
 * @author Andrii Senchakevych
 */
public class Hall {

    private int id;
    private String hallName;

    public Hall(int id, String hallName) {
        this.id = id;
        this.hallName = hallName;
    }

    public Hall() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Hall hall = (Hall) o;

        if (id != hall.id) {
            return false;
        }
        return hallName.equals(hall.hallName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + hallName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "hall{" +
                "id=" + id +
                ", hallName='" + hallName + '\'' +
                '}';
    }
}
