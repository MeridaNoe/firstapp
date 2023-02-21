package mx.edu.utez.firstapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.firstapp.models.person.Person;
import mx.edu.utez.firstapp.models.user.User;
import org.hibernate.validator.constraints.Length;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonDto {
    private Long id;
    @NotEmpty(message = "Campo obligaotrio!")
    @Size(min = 3,max = 50)
    private String name;
    @NotEmpty(message = "Campo obligaotrio!")
    @Size(min = 3,max = 50)
    private String surname;
    private String lastname;
    @NotEmpty
    private String birthday;
    @NotEmpty
    @Pattern(regexp = "")
    private String curp;
    private Boolean status = true;
    @NotEmpty
    private String gender;
    private User user;

    public Person getPerson(){
        return new Person(
            getId(),
            getName(),
            getSurname(),
            getLastname(),
            getBirthday(),
            getCurp(),
            getStatus(),
            getGender(),
            getUser()
        );
    }
}
