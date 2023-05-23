package com.webFlux.crudOperation.practise.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
