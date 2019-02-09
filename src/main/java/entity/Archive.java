package entity;

import java.sql.Timestamp;

public class Archive {

    private int archiveId;
    private Employee employeeId;
    private Excursion excursionId;
    private Timestamp startTime;
    private Timestamp endTime;

    public Archive(int archiveId, Employee employeeId, Excursion excursionId, Timestamp startTime, Timestamp endTime) {
        this.archiveId = archiveId;
        this.employeeId = employeeId;
        this.excursionId = excursionId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(int archiveId) {
        this.archiveId = archiveId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Excursion getExcursionId() {
        return excursionId;
    }

    public void setExcursionId(Excursion excursionId) {
        this.excursionId = excursionId;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Archive archive = (Archive) o;

        if (archiveId != archive.archiveId) return false;
        if (employeeId != null ? !employeeId.equals(archive.employeeId) : archive.employeeId != null) return false;
        if (excursionId != null ? !excursionId.equals(archive.excursionId) : archive.excursionId != null) return false;
        if (startTime != null ? !startTime.equals(archive.startTime) : archive.startTime != null) return false;
        return endTime != null ? endTime.equals(archive.endTime) : archive.endTime == null;
    }

    @Override
    public int hashCode() {
        int result = archiveId;
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (excursionId != null ? excursionId.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "archiveId=" + archiveId +
                ", employeeId=" + employeeId +
                ", excursionId=" + excursionId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
