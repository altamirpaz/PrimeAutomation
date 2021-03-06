package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pom.LoginPage;

public class TrelloStep {
    LoginPage loginPage;

    @Dado(value = "^que eu esteja logado no trello$")
    public void queEuEstejaLogadoNoTrello() {
        loginPage = new LoginPage();
        loginPage.access();
        loginPage.doLogin("altamirpaz", "a01235460a");
        Assert.assertEquals("Página Inicial do Trello",
                loginPage.checkInitialPag());
    }

    @E("^acesse o board$")
    public void acesseOBoard() {
        System.out.println("acesseOBoard");
    }

    @Quando("^crio um card com o nome \"([^\"]*)\"$")
    public void crioUmCardComONome(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("crioUmCardComONome");
    }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("comento");
    }

    @Entao("^o card deve estar na lista$")
    public void oCardDeveEstarNaLista() {
        System.out.println("oCardDeveEstarNaLista");
    }

    @Quando("^excluo o card$")
    public void excluoOCard() {
        System.out.println("excluoOCard");
    }

    @Entao("^o card não existe mais$")
    public void oCardNãoExisteMais() {
        System.out.println("oCardNãoExisteMais");
    }
}
