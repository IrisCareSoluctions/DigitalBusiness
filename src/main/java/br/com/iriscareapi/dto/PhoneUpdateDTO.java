package br.com.iriscareapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhoneUpdateDTO {

    @Length(min = 1, max = 3)
    private String DDD;

    @Length(max = 9)
    private String number;

}