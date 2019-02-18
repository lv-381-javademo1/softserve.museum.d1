package entity;

public class BookedExcursion {

    private int id;
    private Excursion excursion;
    private String userName;
    private String email;
    private String bookingTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
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

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookedExcursion that = (BookedExcursion) o;

        if (id != that.id) return false;
        if (excursion != null ? !excursion.equals(that.excursion) : that.excursion != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return bookingTime != null ? bookingTime.equals(that.bookingTime) : that.bookingTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (excursion != null ? excursion.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (bookingTime != null ? bookingTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookedExcursion{" +
                "id=" + id +
                ", excursion=" + excursion +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", bookingTime='" + bookingTime + '\'' +
                '}';
    }
}
