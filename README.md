# Sistema-de-agenda-simplificado

## Descrição do projeto
Sistema de gerenciamento de agenda de contatos que é desenvolvido na linguagem de programação Java. O sistema permite cadastrar contatos com nome e data de aniverário, pesquisar aniversariantes por data, remover contatos e realizar persistência de dados em um arquivo.

## Funcionalidades do sistema
- Cadastro de contatos com nome e data de aniversário
- Pesquisa de aniversariante por dia e mês
- Persistência de dados em arquivo usando a interface Serializable
- Recuperação automática dos dados salvos

### Classes principais
- Agenda (Interface): Onde define o contrato do sistema
- AgendaDeContatosMap: Implematação da agenda usando HashMap
- Contato: Classe onde representa um contato (Serializable)
- GravadorDeDados: A responsável pela persistência de dados em arquivo
- ContatoInexistenteException: Exceção personalizada para contatos que não são encontrados

### Testes
- AgendaDeContatosTest: Classe onde são feitas os testes unitários JUnit

## Como usar 
 java
// Criar a agenda
AgendaDeContatos agenda = new AgendaDeContatos();
AgendaDeContatosMap();

// Cadastrar contatos
agenda.cadastrarContatos ("Anikely, 17,1");
agenda.cadastrarContatos ("Maria, 17,1");

//Pesquisar aniversariantes (17 de Janeiro)
Collection aniversariantes = agenda.pesquisaAniversariantes (17,1);

// Persistência de dados
agenda.salvarDados ();
agenda.recuperarDados();

## Tecnologias
- Java
- JUnit 5 (Teste Unitários)
- Serialização de objetos
- Collections Framework (Map/HashMap)

## Autor(a)
[Anikely Santos da Silva]
