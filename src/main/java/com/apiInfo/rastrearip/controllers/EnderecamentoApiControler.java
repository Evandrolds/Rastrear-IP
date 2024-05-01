package com.apiInfo.rastrearip.controllers;

import com.apiInfo.rastrearip.service.EnderecamentoApiService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecamentoApiControler {
    @Autowired
    private EnderecamentoApiService service;

    @GetMapping("/dados-ip")
    public ResponseEntity<String> obterdadosDoIP(HttpServletRequest request) { // Passe um IP valido aqui para teste do tipo "String"
        return new ResponseEntity<>(service.salvarDadosDoIP(request.getLocalAddr()), HttpStatus.OK);
    }


}
