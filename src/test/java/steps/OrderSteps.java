package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.OrderPage;
import runner.RunCucumberTest;



public class OrderSteps extends RunCucumberTest {
    OrderPage orderPage = new OrderPage(driver);

    @Dado("^que estou na tela de checkout$")
    public void que_estou_na_tela_de_checkout() {
        orderPage.setScreenCheckout();
    }

    @Dado("^visualizo a tabela Your Orders$")
    public void visualizo_a_tabela_Your_Orders() {
        orderPage.setTableOrder();
    }

    @Dado("^escolho a forma de pagamento$")
    public void escolho_a_forma_de_pagamento() {
        //Já selecionada por default

    }

    @Quando("^clico no botão Place order$")
    public void clico_no_botão_Place_order() {
        orderPage.setBtnPlaceOrder();
    }
    @Então("^é apresentado o modal de sucesso$")
    public void é_apresentado_o_modal_de_sucesso () {
        orderPage.modal();
        }
    }

