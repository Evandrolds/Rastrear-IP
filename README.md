# Rastrear IP API

Este projeto é uma aplicação Spring Boot que rastreia informações de geolocalização de endereços IP. Ele utiliza um serviço REST para obter dados de localização para um endereço IP fornecido e armazena essas informações em um banco de dados.

## Funcionalidades

- **Consulta de IP**: A aplicação permite a consulta de informações geográficas relacionadas a um endereço IP.
- **Armazenamento de Dados**: As informações do IP obtidas de uma API externa são armazenadas em um banco de dados para uso posterior.
- **Endpoint REST**: Fornece um endpoint para obter dados de geolocalização de um endereço IP.

## Estrutura do Projeto

- **Entidades**:
  - `EnderecamentoApi`: Classe para representar dados obtidos da API de geolocalização. Contém informações como IP, localização, organização, cidade, região, país, entre outros.
  - `IpLocalizacao`: Classe que representa os dados de localização armazenados no banco de dados.
- **Serviço**:
  - `EnderecamentoApiService`: Serviço responsável por interagir com a API externa para obter dados de geolocalização e armazená-los no banco de dados.
- **Controlador**:
  - `EnderecamentoApiControler`: Controlador REST que permite a consulta de informações de geolocalização por meio do endpoint `/dados-ip`.

## Uso

Para utilizar a aplicação:

1. **Configurar a API**: Certifique-se de que a variável `apiInfo.url` no arquivo de configuração aponte para a API de geolocalização usada para obter os dados de IP.
2. **Executar a Aplicação**: Inicie a aplicação Spring Boot.
3. **Consultar Informações de IP**: Envie uma solicitação GET para o endpoint `/dados-ip` com um endereço IP válido. A aplicação retornará a cidade associada ao endereço IP e armazenará as informações no banco de dados.

## Requisitos

- Java 11 ou superior
- Spring Boot versão 3.2.5
- Dependências como Spring Data JPA, Spring web, RestTemplate, e BeanUtils
- Banco de dados H2 configurado para armazenar as informações do IP

## Contribuição

Se você quiser contribuir com este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request no repositório do GitHub.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE). Consulte o arquivo de licença para mais detalhes.
