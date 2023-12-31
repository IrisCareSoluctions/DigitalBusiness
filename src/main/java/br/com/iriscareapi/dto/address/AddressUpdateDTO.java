package br.com.iriscareapi.dto.address;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressUpdateDTO {

    @Length(max = 15)
    @JsonFormat(pattern = "#####-###")
    private String zipCode;

    private String number;

    @Length(max = 50)
    private String street;

    @Length(max = 50)
    private String neighborhood;

    @Length(max = 50)
    private String city;

    @Length(max = 50)
    private String state;

}
