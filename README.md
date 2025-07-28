# 💻 Desafio DIO – Banco Digital com Java

---

## 🧠 Objetivo

Este projeto prático tem como foco reforçar os conhecimentos em **Programação Orientada a Objetos (POO)** em Java, por meio da **implementação de um banco digital** simples e funcional.

---

## 📚 Conceitos Aplicados

Durante o desenvolvimento do desafio, foram aplicados os **quatro pilares da POO**:

- ✅ **Abstração**  
- ✅ **Encapsulamento**  
- ✅ **Herança**  
- ✅ **Polimorfismo**

---

## 🛠️ Proposta adcional da Atividade 

No desafio também foi colocado como sugestão: desenvolver e implementar melhorias no codigo.

Desenvolvimento de melhorias:

### 📦 Criação de novo pacote

- **Pacote `exceptions`** criado para centralizar e organizar o tratamento de exceções personalizadas da aplicação.

### 📄 Nova classe adicionada

- `DomainExceptions.java`  
  Classe de exceção personalizada (`extends RuntimeException`) utilizada para lançar erros específicos do domínio bancário (como tentativa de saque com saldo insuficiente).

---

### 🔄 Métodos atualizados

#### ✅ `sacar(double valor)`
- Agora lança `DomainExceptions` caso o valor solicitado seja maior que o saldo disponível.
- Exibe uma mensagem personalizada com o nome do cliente e uma instrução para tentar novamente.

#### ✅ `transferir(double valor, Conta contaDestino)`
- Também passou a lançar `DomainExceptions`.
- Após uma transferência, exibe uma mensagem indicando:
  - Quem **recebeu** a transferência
  - Quem **enviou** (remetente)
  - Valor, agência e número da conta do remetente

#### ✅ Interface `IConta`
- Métodos `sacar` e `transferir` atualizados com a cláusula `throws DomainExceptions`.

---

### 📌 Observações

- Essa melhoria torna o código mais **robusto** e **organizado**, facilitando o tratamento de erros e aumentando a **manutenibilidade**.
- A separação em pacotes respeita os princípios de **responsabilidade única** e ajuda a manter a estrutura do projeto **escalável**.


## 🚀 Tecnologias Utilizadas

<p align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="50" alt="Java"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/eclipse/eclipse-original.svg" height="45" alt="Eclipse"/>
</p>

---
