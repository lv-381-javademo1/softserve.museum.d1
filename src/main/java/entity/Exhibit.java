package entity;

/**
 * @author Andrii Senchakevych
 */
public class Exhibit {

    private int exhibitId;
    private Employee employeeId;
    private Author authorId;
    private Hall hall_Id;
    private String name;
    private String material;
    private String technique;

    public Exhibit(int exhibitId, Employee employeeId, Author authorId, Hall hall_Id, String name, String material, String technique) {
        this.exhibitId = exhibitId;
        this.employeeId = employeeId;
        this.authorId = authorId;
        this.hall_Id = hall_Id;
        this.name = name;
        this.material = material;
        this.technique = technique;
    }

    public Exhibit() {
    }

    public int getExhibitId() {
        return exhibitId;
    }

    public void setExhibitId(int exhibitId) {
        this.exhibitId = exhibitId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }

    public Hall getHall_Id() {
        return hall_Id;
    }

    public void setHall_Id(Hall hall_Id) {
        this.hall_Id = hall_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Exhibit exhibit = (Exhibit) o;

        if (exhibitId != exhibit.exhibitId)
            return false;
        if (employeeId != null ? !employeeId.equals(exhibit.employeeId) : exhibit.employeeId != null)
            return false;
        if (authorId != null ? !authorId.equals(exhibit.authorId) : exhibit.authorId != null)
            return false;
        if (hall_Id != null ? !hall_Id.equals(exhibit.hall_Id) : exhibit.hall_Id != null)
            return false;
        if (name != null ? !name.equals(exhibit.name) : exhibit.name != null)
            return false;
        if (material != null ? !material.equals(exhibit.material) : exhibit.material != null)
            return false;
        return technique != null ? technique.equals(exhibit.technique) : exhibit.technique == null;
    }

    @Override
    public int hashCode() {
        int result = exhibitId;
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (authorId != null ? authorId.hashCode() : 0);
        result = 31 * result + (hall_Id != null ? hall_Id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        result = 31 * result + (technique != null ? technique.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Exhibit{" +
                "exhibitId=" + exhibitId +
                ", employeeId=" + employeeId +
                ", authorId=" + authorId +
                ", hall_Id=" + hall_Id +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", technique='" + technique + '\'' +
                '}';
    }
}
