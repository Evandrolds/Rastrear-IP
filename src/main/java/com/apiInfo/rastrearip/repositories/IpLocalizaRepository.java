package com.apiInfo.rastrearip.repositories;


import com.apiInfo.rastrearip.models.IpLocalizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpLocalizaRepository extends JpaRepository<IpLocalizacao,String> {
}
