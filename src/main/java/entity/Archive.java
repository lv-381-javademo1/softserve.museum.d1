package entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Archive {

    private int archiveId;
    private Employee employee;
    private Excursion excursion;
    private Timestamp startTime;
    private Timestamp endTime;

    public Archive(int archiveId, Employee employee, Excursion excursion, Timestamp startTime, Timestamp endTime) {
        this.archiveId = archiveId;
        this.employee = employee;
        this.excursion = excursion;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Archive() {
    }

    public int getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(int archiveId) {
        this.archiveId = archiveId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Archive archive = (Archive) o;
        return archiveId == archive.archiveId &&
                Objects.equals(employee, archive.employee) &&
                Objects.equals(excursion, archive.excursion) &&
                Objects.equals(startTime, archive.startTime) &&
                Objects.equals(endTime, archive.endTime);
    }

    @Override
    public int hashCode() {
        int result = archiveId;
        result = 31 * result + (employee != null ? employee.hashCode() : 0);
        result = 31 * result + (excursion != null ? excursion.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "archiveId=" + archiveId +
                ", employee=" + employee +
                ", excursion=" + excursion +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}