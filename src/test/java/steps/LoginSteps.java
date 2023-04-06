package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage(driver);


    @Dado("^que acesso a aplicação$")
    public void que_acesso_a_aplicação(){
        loginPage.accessApplication();
    }

    @Dado("^clico no link de Login$")
    public void clico_no_link_de_Login() {
        loginPage.linkLogin();


    }

    @Dado("^preencho o input de login$")
    public void preencho_o_input_de_login(){
       loginPage.inputLogin();

    }

    @Dado("^preencho input de senha$")
    public void preencho_input_de_senha() {
        loginPage.inputPassword();

    }

    @Quando("^eu clico no botão login$")
    public void eu_clico_no_botão_login() {
        loginPage.btnLogin();
    }

    @Então("^devo logar com sucesso$")
    public void devo_logar_com_sucesso(){
       loginPage.loginSuccess();
       loginPage.loginSuccessbtn();
    }

}
