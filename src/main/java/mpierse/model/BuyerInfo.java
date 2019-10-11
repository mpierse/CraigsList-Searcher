package mpierse.model;

public class BuyerInfo {

    private String email;
    private String zipcode;
    private String driveRadius;

    public BuyerInfo(String email, String zipcode, String driveRadius) {
        this.email = email;
        this.zipcode = zipcode;
        this.driveRadius = driveRadius;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getDriveRadius() {
        return this.driveRadius;
    }

    public void setDriveRadius(String driveRadius) {
        this.driveRadius = driveRadius;
    }

}