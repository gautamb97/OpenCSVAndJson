import com.opencsv.bean.CsvBindByName;

public class CSVUser {

    public CSVUser(){

    }

    public CSVUser(String name, String email, String phoneNo, String country) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    @CsvBindByName
    private String name;

    public String getName() {
        return name;
    }
    @CsvBindByName(column = "email", required = true)
    private String email;

    public String getEmail(){
        return email;
    }

    @CsvBindByName(column = "phone")
    private String phoneNo;

    public String getPhoneNo(){
        return phoneNo;
    }

    @CsvBindByName
    private String country;

    public String getCountry(){
        return country;
    }

    @Override
    public  String toString(){
        return "CSVUser{" +
                "name = '"+ name + '\'' +
                ", email ='" + email + '\'' +
                ", phoneNo = '" + phoneNo + '\'' +
                ", country = '" + country + '\'' +
                '}';
    }
}
