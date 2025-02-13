# language: pt
@BancoTeste
Funcionalidade: Testar as operacoes basicas de banco
  O sistema deve prover opera��es b�sicas de banco de forma correta.
  
  Contexto: Cria todas as contas e associa ao banco
    Dado que as contas sao do "Banco do Brasil"
      | dono                       | numero | saldo |
      | Abias Corpus Da Silva      | 111    | 100   |
      | Ant�nio Morrendo das Dores | 222    | 200   |
      | Carabino Tiro Certo        | 333    | 200   |
  
  @tipo1
  Cenario: Verifica o total de contas criadas
    Dado o calculo do total de contas criadas
    Entao o total de contas e 3
  
  @tipo1 @tipo2
  Cenario: Verifica o total de dinheiro no banco
    Dado o calculo do total de dinheiro
    Entao o total de dinheiro no banco e 500
  

    