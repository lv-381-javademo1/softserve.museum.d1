package dto;

public class ExhibitFullInfDto {

    private String exhibitID ;
    private String exhibitName ;
    private String material ;
    private String technique ;
    private String hall;
    private String authorFirstname;
    private String authorLastname;

    public String getExhibitID() {
        return exhibitID;
    }

    public void setExhibitID(String exhibitID) {
        this.exhibitID = exhibitID;
    }

    public String getExhibitName() {
        return exhibitName;
    }

    public void setExhibitName(String exhibitName) {
        this.exhibitName = exhibitName;
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

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    @Override
    public String toString() {
        return "ExhibitFullInfDto{" +
                "exhibitID='" + exhibitID + '\'' +
                ", exhibitName='" + exhibitName + '\'' +
                ", material='" + material + '\'' +
                ", technique='" + technique + '\'' +
                ", hall='" + hall + '\'' +
                ", authorFirstname='" + authorFirstname + '\'' +
                ", authorLastname='" + authorLastname + '\'' +
                '}';
    }
}
