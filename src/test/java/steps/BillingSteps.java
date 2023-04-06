package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.BillingPage;
import runner.RunCucumberTest;

public class BillingSteps extends RunCucumberTest {
    BillingPage billingPage = new BillingPage(driver);


    @Dado ("^que estou na tela checkout$")
    public void que_estou_na_tela_checkout(){
        billingPage.screenCheckout();
        billingPage.checkoutViewOne();




    }
    @E("^preencho todos os campos obrigatórios$")
    public void preencho_todos_os_campos_obrigatórios(){
        billingPage.inputs();
    }

    @Quando("^clico no botão Salvar$")
    public void clico_no_botão_Salvar(){
        billingPage.btnSave();


    }

    @Então("^a mensagem de informações cadastradas com sucesso é exibida$")
    public void a_mensagem_de_informações_cadastradas_com_sucesso_é_exibida(){
        billingPage.messageSuccess();

    }

}
