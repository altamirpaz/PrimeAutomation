#language: pt
#encoding: UTF-8
@ui
Funcionalidade: : Trello UI
    @ui
    Esquema do Cenario: : Criando, comentando e deletaqndo um card
        Dado que eu esteja logado no trello
        E acesse o board
        Quando crio um card com o nome "<card Name>"
        E comento "<Comment>"
        Entao o card deve estar na lista
        Quando excluo o card
        Entao o card não existe mais
        Exemplos: :
            | card Name     | Comment               |
            | Test Card     | Comentário test Card  |
            | Test 2 Card   | Comentário 2          |