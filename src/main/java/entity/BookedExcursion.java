package entity;

import java.sql.Timestamp;
import java.util.Objects;

public class BookedExcursion {
    private int id;
    private String userName;
    private String email;
    private Timestamp bookingTime;
    private Excursion excursion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Timestamp bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BookedExcursion that = (BookedExcursion) o;
        return id == that.id &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(bookingTime, that.bookingTime) &&
                Objects.equals(excursion, that.excursion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, email, bookingTime, excursion);
    }

    @Override
    public String toString() {
        return "BookedExcursion{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", bookingTime=" + bookingTime +
                ", excursion=" + excursion +
                '}';
    }
}
