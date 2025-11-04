package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.Executa;

public class funcionalidadeLogin {

    // Tudo que for público na classe Executa, essa classe terá acesso através dessa variável de referência
    Executa executa = new Executa();

    @Given("que eu esteja na tela de login")
    public void que_eu_esteja_na_tela_de_login() {
        executa.abrirNavegador();
    }

    @When("preencher os dados de login")
    public void preencher_os_dados_de_login() {

    }
    @Then("login sera realizado com sucesso")
    public void login_sera_realizado_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
