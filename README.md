![](https://img.shields.io/badge/java-v.1.8-blue.svg)
![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)
![](https://img.shields.io/badge/maven-v.3.3-orange.svg)
<img  alt="License"  src="https://img.shields.io/badge/license-MIT-brightgreen">

---

## 🦸 Autora

<h3><b>Natália Botelho</b></h3>  

 [![Linkedin Badge](https://img.shields.io/badge/-Natália-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/natalialfbotelho/)](https://www.linkedin.com/in/natalialfbotelho/)

[![Gmail Badge](https://img.shields.io/badge/-engnataliabotelho@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:engnataliabotelho@gmail.com)](mailto:engnataliabotelho@gmail.com)

---

## Descrição do desafio 🚀
### Criar uma aplicação Selenium com os seguintes casos de teste
### Funcionalidade:
Acessar o site da Tricentis

<b>Cenário</b>: Preencher formulário<br>
Dado que eu estou no site da Tricentis              	             
              - [x] E escolho a marca "Audi"
              - [x] E escolho o modelo "Scooter"
              - [x] E preencho capacidade do cilindro com "1000"
              - [x]E preencho desempenho do motor com "125"
              - [x]E escolho a data de fabricacao "01/10/2020"
              - [x]E seleciono o numero de acentos "2"
              - [x]E escolho o tipo de combustivel "Petrol"
              - [x]E preencho a carga util com "150"
              - [x]E preencho o peso total com "115"
							- [x]E preencho o preco de tabela com "2000"
							- [x]E preencho a milhagem anual com "200"               
              - [x]Entao devo clicar em Next
             	- [x]E preencho o primeiro nome "Natalia"
             	- [x]E preencho o ultimo nome "Botelho"
             	- [x]E preencho a data de nascimento "01/05/1990"
             	- [x]E escolho o pais "Brazil"
             	- [x]E preencho o codigo postal "45000000"
             	- [x]E preencho a ocupacao "Employee"
             	- [x]E escolho o hobby Speeding
              - [x]Entao devo clicar em proximo
             	- [x]E preencho data de inicio com "05/05/2021"
             	- [x]E escolho soma do seguro "3.000.000,00"
             	- [x]E escolho a classificacao "Super Bonus"
             	- [x]E escolho seguro de danos "No Coverage"
             	- [x]E escolho produtos opcionais "Legal Defense Insurance"
             	- [x]E escolho carro de cortesia No
              - [x]Entao devo clicar no botao next
             	- [x]E seleciono a opcao de preco "Gold"
              - [x]Entao devo clicar no botao proximo
             	- [x]E preencho o campo email com "natalia@email.com"
             	- [x]E preencho o campo telefone com "5555555555"
             	- [x]E preencho o campo nome de usuario com "natalialf"       
             	- [x]E preencho o campo senha com "Natalia1"
             	- [x]E preencho o campo confirmar senha com "Natalia1"
             	- [x]E preencho os comentarios com "Comentarios"
              - [x]Entao devo clicar em send
             	- [x]E devo ver a mensagem de sucesso

---

## Tecnologias utilizadas 💡

:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

---

## Como utilizar

### Pré requisitos

- Instalar o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar [jdk](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador

### 💻 Clonando o projeto no seu computador 
 
 ```bash
git clone https://github.com/natalialfbotelho/teste-selenium-natalia-botelho
 ```
 
### 💻 Entrando na pasta do projeto
 
 ```bash
cd teste-selenium-natalia-botelho
 ```

### 💻 Configurando selenium em seu computador
 
-[x] Fazer o download do [Chrome Webdriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto

### 💻 Limpando e validando maven Unix

 ```bash
./mvnw clean
 ```
 
### 💻 Limpando e validando maven Windows

 ```bash
mvnw.cmd clean
 ```

### 💻 Executando teste no Unix

 ```bash
./test.sh
 ```

### 💻 Executando teste no Windows

 ```bash
test.bat
 ```
 
 --------------------------------------------------------------------
 
 ## ⚙️ Estrutura de arquivos
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- natalia<br>    
    |  |  |  |  |  |-- servicos<br>
    |  |  |  |  |  |  |-- Config.java -- Passos escritos em java encapsulados para uso comum<br>
    |  |  |  |  |  |-- PreencherFormularioTestSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br>
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- hopper<br>    
    |  |  |  |  |  |-- PreencherFormularioTest.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>


---
  

## 📝 Licença
  

Este projeto esta sobe a licença [MIT](./LICENSE).
  

Feito com ❤️ por Natália Botelho 👋🏽 [Entre em contato!](https://www.linkedin.com/in/natalialfbotelho/)

  

---
