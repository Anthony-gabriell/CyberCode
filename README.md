# 🧠 CyberCode — Sistema de Check & Recarga 

## 📌 Visão Geral

**CyberCode** é um projeto desenvolvido em **Java**, com **fundamentos da linguagem**, **lógica de programação** e **Programação Orientada a Objetos (POO)**.

O sistema simula um cenário **cyberpunk / industrial**, onde cidadãos precisam passar por uma **validação de acesso** antes de utilizar um **terminal de recarga de energia**.

O objetivo principal do projeto **não é o produto final**, mas sim a **construção do raciocínio lógico**, controle de fluxo e estruturação correta do código.

---

## 🧩 Funcionamento do Sistema

### 1️⃣ Validação de Acesso (Primeira Porta)

O usuário deve informar:

- **Nível do cidadão**
- **Nível da ameaça**

Regras:
- Nível do cidadão ≥ 50
- Nível da ameaça entre 1 e 3

Somente se essas condições forem atendidas o acesso é **permitido**.

---

### 2️⃣ Sistema de Carregamento (Segunda Porta)

Após a autorização:

O usuário pode:
1. Carregar a bateria
2. Consultar status da bateria
3. Encerrar o sistema de carregamento

Regras de carregamento:
- Valores inválidos (negativos ou acima de 100) são rejeitados
- O sistema calcula automaticamente quanto falta para atingir 100%
- O menu de carregamento se repete até o usuário encerrar

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **GitHub**



