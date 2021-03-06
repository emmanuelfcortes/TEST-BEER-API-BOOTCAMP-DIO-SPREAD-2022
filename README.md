<h2>Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja.</h2>

Este é um projeto realizado para o Bootcamp DIO-SPREAD0-2021/2022. 
As etapas para realização deste projeto foram as seguintes:


* Baixar um projeto através do Git para desenvolver os testes unitários e acompanhar aulas sobre. 
* A pirâmide dos tipos de testes, e também a importância de cada tipo de teste durante o ciclo de desenvolvimento.
* Testes unitários e a importância do desenvolvimento deste tipo de teste como parte do ciclo de desenvolvimento de software.
* Principais frameworks para testes unitários em Java: JUnit, Mockito e Hamcrest. 
* Desenvolvimento de testes unitários para validação de funcionalides básicas: criação, listagem, consulta por nome e exclusão de cervejas.
* TDD: apresentação e exemplo prático em 2 funcionaliades importantes: incremento e decremento do número de cervejas no estoque.
* Execução de correções e novas implementações a partir do projeto original.

Para executar o projeto no terminal, e necessário digitar o seguinte comando:

```shell script
mvn spring-boot:run 
```

Para executar a suíte de testes, basta executar o seguinte comando:

```shell script
mvn clean test
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/beers
```

São necessários os seguintes pré-requisitos para a execução do projeto:

* Java 14 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE de preferência.
* Controle de versão GIT instalado localmente na máquina.


Abaixo, seguem links bem bacanas, sobre tópicos mencionados:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
* [Site oficial Mockito](https://site.mockito.org/)
* [Site oficial Hamcrest](http://hamcrest.org/JavaHamcrest/)
* [Referências - testes em geral com o Spring Boot](https://www.baeldung.com/spring-boot-testing)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
* [Referência pirâmide de testes - Martin Fowler](https://martinfowler.com/articles/practical-test-pyramid.html#TheImportanceOftestAutomation)

[Neste link](https://drive.google.com/file/d/1KPh19mvyKirorOI-UsEYHKkmZpet3Ks6/view?usp=sharing)
, seguem os slides apresentados como o roteiro utilizado para o desenvolvimento do projeto.
Github original do projeto:
[Neste link] (https://github.com/rpeleias/beer_api_digital_innovation_one)



