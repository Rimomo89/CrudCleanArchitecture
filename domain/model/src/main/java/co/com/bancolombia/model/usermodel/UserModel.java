package co.com.bancolombia.model.usermodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private Integer id;
    private String name;
    private String lastname;
    private String type;
    private Double salary;
}
