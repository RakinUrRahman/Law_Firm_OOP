package mainpkg.lawfirm.arafat;

import java.time.LocalDate;

public class RegisterClient {
    private String clientname;
    private String email;
    private Integer phonenumber;
    private String password;
    private String address;
    private LocalDate dateofBirth;
    private String gender;

    public RegisterClient(String clientname, String email, Integer phonenumber, String password, String address, LocalDate dateofBirth, String gender) {
        this.clientname = clientname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
        this.address = address;
        this.dateofBirth = dateofBirth;
        this.gender = gender;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
