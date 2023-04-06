# language: pt

  @login
  Funcionalidade:Checkout de usuario
    Eu como um usuário já cadastrado
    Quero me logar na aplicação
    Para poder realizar compras

     @login-sucesso
     Cenario:Realizar o login com sucesso
       Dado que acesso a aplicação
       E clico no link de Login
       E preencho o input de login
       E preencho input de senha
       Quando eu clico no botão login
       Então devo logar com sucesso



  Cenario:Preencher informações de cobrança
    Dado que estou na tela checkout
    E preencho todos os campos obrigatórios
    Quando clico no botão Salvar
    Então a mensagem de informações cadastradas com sucesso é exibida

  Cenario: Confirmar a ordem de pagamento
    Dado que estou na tela de checkout
    E visualizo a tabela Your Orders
    E escolho a forma de pagamento
    Quando clico no botão Place order
    Então é apresentado o modal de sucesso