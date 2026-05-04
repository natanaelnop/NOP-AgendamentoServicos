# 🏛️ Sistema de Agendamento de Serviços Públicos

Este projeto é uma aplicação **Java** robusta desenvolvida para gerir fluxos de atendimento, permitindo o registro, listagem e armazenamento persistente de agendamentos. O sistema foi estruturado seguindo os princípios de Programação Orientada a Objetos (POO) e organização em camadas.

## 🚀 Funcionalidades Principais

* **Gestão de Fluxo:** Cadastro de cidadãos com nome, tipo de serviço, telefone e registro automático de data/hora via `java.time`.
* **Persistência de Dados (File I/O):**
    * **Carregamento Inicial:** Ao iniciar, o sistema lê o arquivo `agendamentos.txt` e reconstrói a lista em memória.
    * **Auto-Salvamento:** O sistema grava as alterações no disco imediatamente após cada novo agendamento e também ao encerrar a aplicação, garantindo que os dados não sejam perdidos.
* **Controle de Identidade (ID):** Uso de variáveis estáticas para garantir que o ID de cada agendamento seja único e sequencial, mantendo a integridade mesmo após o reinício do programa.

## 📁 Estrutura do Código

O projeto está dividido em pacotes para melhor manutenção e escalabilidade:

1.  **`br.com.projeto.model (Agendamento.java)`**:
    * Contém os atributos da entidade.
    * Implementa **Sobrecarga de Construtores** para tratar novos registros e registros recuperados do arquivo.
    * Sobrescreve o método `toString()` para exibição formatada.

2.  **`br.com.projeto.service (GerenciadorAgendamento.java)`**:
    * Gerencia a lógica de negócio e a lista dinâmica (`ArrayList`).
    * Implementa a leitura e escrita de arquivos usando `BufferedReader` e `BufferedWriter`.
    * Utiliza o delimitador `;` para estruturar os dados de forma legível.

3.  **`br.com.projeto.main (Principal.java)`**:
    * Ponto de entrada da aplicação (Método `main`).
    * Gerencia o menu interativo e o tratamento do buffer do teclado via `Scanner`.

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Eclipse IDE**
* **Principais bibliotecas:** `java.util`, `java.io` e `java.time`.

## 🔧 Como Executar

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/natanaelnop/NOP-AgendamentoServicos.git]
    ```
2.  Importe o projeto no **Eclipse IDE**.
3.  Certifique-se de que o **JDK 17** (ou superior) está configurado no seu ambiente.
4.  Execute a classe `Principal.java`.
5.  O arquivo `agendamentos.txt` será gerado automaticamente na raiz do projeto após o primeiro uso.

---
Desenvolvido por NATANAEL PEREIRA como parte de estudos em Java Backend.
