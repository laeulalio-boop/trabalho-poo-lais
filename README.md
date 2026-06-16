# poo-desafio-ong

Sistema para gestão de uma ONG, desenvolvido como desafio da disciplina de
Programação Orientada a Objetos. A ideia é aplicar os três pilares pedidos:
**encapsulamento, herança e composição**.

## Sobre o projeto

O sistema modela as pessoas envolvidas em uma ONG e um projeto social tocado por elas.

- **MembroONG** – classe base com os dados comuns a qualquer pessoa da ONG
  (nome, cpf e dias de atuação). Os atributos são privados e acessados por
  getters/setters. O `setDiasAtuacao` não aceita valores negativos.
- **Voluntario** – herda de `MembroONG` e acrescenta o `setor` onde a pessoa atua.
  Sobrescreve o `exibirResumo()` pra mostrar também o setor.
- **Doador** – herda de `MembroONG` e acrescenta o `valorDoadoMensal`.
  Sobrescreve o `exibirResumo()` mostrando o status "Doador Ativo" e o valor.
- **ProjetoSocial** – usa composição: o projeto **tem um** voluntário como líder.
  O método `iniciarProjeto()` mostra o projeto, a meta e quem está liderando.
- **SistemaMain** – classe com o `main`, onde tudo é instanciado e testado.

## Como executar

Tendo o JDK instalado:

```bash
javac *.java
java SistemaMain
```

## Pilares aplicados

| Pilar           | Onde aparece                                              |
|-----------------|----------------------------------------------------------|
| Encapsulamento  | atributos privados + getters/setters em `MembroONG`      |
| Herança         | `Voluntario` e `Doador` que estendem `MembroONG`         |
| Composição      | `ProjetoSocial` que tem um atributo do tipo `Voluntario` |
