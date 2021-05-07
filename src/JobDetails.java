public class JobDetails {
    String Title;
    String Company;
    String Location;
    String Type;
    String Levle;
    String YearsEXP;
    String Country;
    public JobDetails( String Title, String Company, String Location, String Type, String Levle ,String YearsEXP, String Country){
        this.Title=Title;
        this.Company=Company;
        this.Location=Location;
        this.Type=Type;
        this.Levle=Levle;
        this.YearsEXP=YearsEXP;
        this.Country=Country;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    public String getLevle() {
        return Levle;
    }

    public void setLevle(String Levle) {
        this.Levle = Levle;
    }
    public String getYearsExp() {
        return YearsEXP;
    }

    public void setYearsEXP(String YearsExp) {
        this.YearsEXP = YearsExp;
    }
    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

}
