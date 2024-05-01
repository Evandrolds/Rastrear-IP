package com.apiInfo.rastrearip.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class IpLocalizacao {
    @Id
    private String ip;
    private String loc;
    private String org;
    private String hostname;
    private String city;
    private String region;
    private String country;
    private String postal;
    private String readme;
    private String timezone;
}
