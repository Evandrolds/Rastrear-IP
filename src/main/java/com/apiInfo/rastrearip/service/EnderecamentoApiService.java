package com.apiInfo.rastrearip.service;

import com.apiInfo.rastrearip.configProperties.EnderecamentoApi;
import com.apiInfo.rastrearip.models.IpLocalizacao;
import com.apiInfo.rastrearip.repositories.IpLocalizaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecamentoApiService {
    @Autowired
    private IpLocalizaRepository repository;
    @Value("${apiInfo.url}")
    private String apiUrl;

    public EnderecamentoApi getDadoApiIP(String enderecoIp) {
        try {
            String url = apiUrl + enderecoIp + "/json";
            RestTemplate restTemplate = new RestTemplate();
            EnderecamentoApi enderecamentoApi = restTemplate.getForObject(url, EnderecamentoApi.class);
            return enderecamentoApi;
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new NullPointerException("Dados não fornecidos!");
    }

    public String salvarDadosDoIP(String localizacao) {

        if (localizacao != null)
            return verificarSeExisteIp(localizacao);
        else
            return verificarSeExisteIp(localizacao);
    }

    public String verificarSeExisteIp(String ip) {
        boolean ipExiste = repository.existsById(ip);
        if (ipExiste)
            return "IP ja cadastro!";

        EnderecamentoApi end = getDadoApiIP(ip);
        repository.save(copiarPropriedadesIplocalizacao(end));
        return end.getCity();
    }

    public IpLocalizacao copiarPropriedadesIplocalizacao(EnderecamentoApi enderecamentoApi) {
        IpLocalizacao localizacao = new IpLocalizacao();
        BeanUtils.copyProperties(enderecamentoApi, localizacao);
        return localizacao;
    }
}

