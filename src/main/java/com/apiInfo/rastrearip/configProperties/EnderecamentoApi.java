package com.apiInfo.rastrearip.configProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecamentoApi {
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
