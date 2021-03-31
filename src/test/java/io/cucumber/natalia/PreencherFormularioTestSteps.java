package io.cucumber.natalia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.natalia.servicos.Config;

public class PreencherFormularioTestSteps{
   
	@Dado("que eu estou no site da Tricentis")
	public void abrindoPagina() {
		Config.abrirPagina("http://sampleapp.tricentis.com/101/app.php");
    }
	
//	@Quando("clico no {string} com o {string} para escolher o {string} referente ao {string}")
//	public void escolherOsCampos(String campo, String seletorCampo, String seletorDado, String dado) throws InterruptedException {
//		Config.cssSelector(seletorCampo).click();
//		Thread.sleep(4000);
//		WebElement dadoValidado = Config.cssSelector(seletorDado);		
//		assertEquals(dado, dadoValidado.getText());
//		dadoValidado.click();
//		Thread.sleep(4000);
//	}
	
	@Dado("escolho a marca {string}")
	public void escolherAMarca(String string) {
	    Config.cssSelector("#make").click();
	    WebElement marca = Config.cssSelector("[value='Audi']");
	    assertEquals(string, marca.getText());
	    marca.click();
	}

	@Dado("escolho o modelo {string}")
	public void escolherOModelo(String string) {
		Config.cssSelector("#model").click();
	    WebElement modelo = Config.cssSelector("[value='Scooter']");
	    assertEquals(string, modelo.getText());
	    modelo.click();
	}

	@Dado("preencho capacidade do cilindro com {string}")
	public void preencherCapacidadeDoCilindro(String string) {
	    Config.cssSelector("#cylindercapacity").sendKeys(string);
	}

	@Dado("preencho desempenho do motor com {string}")
	public void preencherDesempenhoDoMotor(String string) {
		Config.cssSelector("#engineperformance").sendKeys(string);
	}

	@Dado("escolho a data de fabricacao {string}")
	public void escolherDataDeFabricacao(String string) {
		Config.cssSelector("#dateofmanufacture").sendKeys(string);
	}

	@Dado("seleciono o numero de acentos {string}")
	public void seleciono_o_numero_de_acentos(String string) {
		Config.cssSelector("#numberofseats").sendKeys(string);
		Config.cssSelector("#numberofseatsmotorcycle").sendKeys(string);
		
	}

	@Dado("escolho o tipo de combustivel {string}")
	public void escolherTipoDeCombustivel(String string) {
		Config.cssSelector("#fuel").click();
	    WebElement combustivel = Config.cssSelector("[value='Petrol']");
	    assertEquals(string, combustivel.getText());
	    combustivel.click();
	}

	@Dado("preencho a carga util com {string}")
	public void preencherACargaUtil(String string) {
		Config.cssSelector("#payload").sendKeys(string);		
	}

	@Dado("preencho o peso total com {string}")
	public void preencherPesoTotal(String string) {
		Config.cssSelector("#totalweight").sendKeys(string);		
	}

	@Dado("preencho o preco de tabela com {string}")
	public void preencherPrecoDeTabela(String string) {
		Config.cssSelector("#listprice").sendKeys(string);
	}

	@Dado("preencho a milhagem anual com {string}")
	public void preencherMilhagemAnual(String string) {
		Config.cssSelector("#annualmileage").sendKeys(string);		
	}

	@Entao("devo clicar em Next")
	public void clicarEmNext() {
		Config.cssSelector("#nextenterinsurantdata").click();
	}
	
	@Entao("preencho o primeiro nome {string}")
	public void preencherPrimeiroNome(String string) {
		Config.cssSelector("#firstname").sendKeys(string);		
	}

	@Entao("preencho o ultimo nome {string}")
	public void preencho_o_ultimo_nome(String string) {
		Config.cssSelector("#lastname").sendKeys(string);		
	}

	@Entao("preencho a data de nascimento {string}")
	public void preencho_a_data_de_nascimento(String string) {
		Config.cssSelector("#birthdate").sendKeys(string);		
	}

	@Entao("escolho o pais {string}")
	public void escolherPais(String string) {
		Config.cssSelector("#country").click();
	    WebElement pais = Config.cssSelector("[value='Brazil']");
	    assertEquals(string, pais.getText());
	    pais.click();
	}

	@Entao("preencho o codigo postal {string}")
	public void preencherCodigoPostal(String string) {
		Config.cssSelector("#zipcode").sendKeys(string);
	}

	@Entao("preencho a ocupacao {string}")
	public void preencherOcupacao(String string) {
		Config.cssSelector("#occupation").click();
	    WebElement ocupacao = Config.cssSelector("[value='Employee']");
	    assertEquals(string, ocupacao.getText());
	    ocupacao.click();
	}

	@Entao("escolho o hobby Speeding")
	public void escolherHobby(){		
	    Config.cssSelector(".ideal-check").click();
	}

	@Entao("devo clicar em proximo")
	public void clicarEmProximo() {
		Config.cssSelector("#nextenterproductdata").click();
	}
	
	@Entao("preencho data de inicio com {string}")
	public void preencherDataDeInicio(String string) {
		Config.cssSelector("#startdate").sendKeys(string);		
	}

	@Entao("escolho soma do seguro {string}")
	public void escolherSomaDoSeguro(String string) {
		Config.cssSelector("#insurancesum").sendKeys(string);
	}

	@Entao("escolho a classificacao {string}")
	public void escolherClassificacao(String string) {
		Config.cssSelector("#meritrating").click();
	    WebElement classificacao = Config.cssSelector("[value='Super Bonus']");
	    assertEquals(string, classificacao.getText());
	    classificacao.click();
	}

	@Entao("escolho seguro de danos {string}")
	public void escolho_seguro_de_danos(String string) {
		Config.cssSelector("#damageinsurance").click();
	    WebElement danos = Config.cssSelector("[value='No Coverage']");
	    assertEquals(string, danos.getText());
	    danos.click();	
	}

	@Entao("escolho produtos opcionais {string}")
	public void escolherProdutosOpcionais(String string){		
		WebElement opcional = Config.cssSelector(".idealforms-field.idealforms-field-checkbox:nth-child(5)");
		assertEquals(true, opcional.getText().contains(string));
		opcional.click();
	}

	@Entao("escolho carro de cortesia No")
	public void escolherCarroDeCortesia() {
		Config.cssSelector("#courtesycar").click();
		Config.cssSelector("[name='Courtesy Car'] [value='No']").click();
	}
	
	@Entao("devo clicar no botao next")
	public void clicarNoBotaoNext() {
	    Config.cssSelector("#nextselectpriceoption").click();
	}

	@Entao("seleciono a opcao de preco {string}")
	public void selecionarOpcaoDePreco(String string) {
		Config.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span").click();
	}

	@Entao("devo clicar no botao proximo")
	public void clicarNoBotaoProximo() throws InterruptedException {
		Thread.sleep(4000);
		Config.cssSelector("#nextsendquote").click();
	}
	
	@Dado("preencho o campo email com {string}")
	public void preencherEmail(String string) {
		Config.cssSelector("#email").sendKeys(string);		
	}
	
	@Dado("preencho o campo telefone com {string}")
	public void preencherTelefone(String string) {
		Config.cssSelector("#phone").sendKeys(string);
	}
	
	@Dado("preencho o campo nome de usuario com {string}")
	public void preencherUsuario(String string) {
		Config.cssSelector("#username").sendKeys(string);
	}
	
	@Dado("preencho o campo senha com {string}")
	public void preencherSenha(String string) {
		Config.cssSelector("#password").sendKeys(string);
	}
	
	@Dado("preencho o campo confirmar senha com {string}")
	public void preencherConfirmarSenha(String string) {
		Config.cssSelector("#confirmpassword").sendKeys(string);
	}
	
	@Dado("preencho os comentarios com {string}")
	public void preencherComentarios(String string) {
		Config.cssSelector("#Comments").sendKeys(string);
	}
	
	@Entao("devo clicar em send")
	public void clicarEmSend() throws InterruptedException {
		Thread.sleep(4000);
		Config.cssSelector("#sendemail").click();
	}
	
	@Dado("devo ver a mensagem de sucesso")
	public void mensagemSucesso() throws InterruptedException {
		Thread.sleep(9000);		
		assertEquals(true, Config.cssSelectors(".showSweetAlert").size() > 0);
		Config.fecharPagina();
	}
	

}


