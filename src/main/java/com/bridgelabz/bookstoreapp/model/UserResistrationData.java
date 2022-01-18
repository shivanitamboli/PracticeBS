package com.bridgelabz.bookstoreapp.model;
        import com.bridgelabz.bookstoreapp.dto.UserRegistrationDto;

        import lombok.Data;

        import javax.persistence.*;
        import java.time.LocalDate;


@Entity
@Table(name = "userregistration")
@Data
public class UserRegistrationData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "firstName")
    private String fullName;
    @Column(name = "emailId")
    private String emailId;
    @Column(name = "password")
    private String password;
    @Column(name = "mobileNo")
    private String mobileNo;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "type")
    private String type;

    private LocalDate updatedDate;

    public UserRegistrationData() {

    }

    public void createUser(UserRegistrationDto userDTO) {
        this.fullName = userDTO.fullName;
        this.emailId = userDTO.emailId;
        this.password = userDTO.password;
        this.mobileNo = userDTO.mobileNo;
        this.address = userDTO.address;
        this.city = userDTO.city;
        this.state = userDTO.state;
        this.type = userDTO.type;

    }

    public void updateUser(UserRegistrationDto userDTO) {
        this.fullName = userDTO.fullName;
        this.emailId = userDTO.emailId;
        this.password = userDTO.password;
        this.mobileNo = userDTO.mobileNo;
        this.address = userDTO.address;
        this.city = userDTO.city;
        this.state = userDTO.state;
        this.type = userDTO.type;

    }
}