package org.activiti;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name = "ApplicantDTO")
public class ApplicantDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    public ApplicantDto(String name, String email, String phoneNumber) {
    }

    public ApplicantDto() {

    }

}