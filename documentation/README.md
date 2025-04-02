<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div align="center">
<img src="assets/header.png" alt="capa-readme" width="100%" />
</div>

# Planejamento das Sprints

<details>
<summary>Sprint 1</summary>

## User Stories da Sprint

| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 4 | ALTA | PS-4 | Como gestor de contratos quero adicionar empresas no sistema para vincular um funcionário.  | 5 | 1 | RF1, RNF1, RNF4  |

### Requisitos
- O sistema permite inserir nome, CNPJ e contato da empresa. 
- A empresa fica disponível para vinculação com funcionários.
- Empresas cadastradas podem ser editadas mas não removidas.

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

## Validações feitas com o Cliente

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
| Quem irá criar os funcionários no sistema será a Altave ou a empresa terceira que esta prestando serviço? | Altave |
| Empresas terceirizadas terão acesso ao sistema? Caso afirmativo, quais dados poderão ser acessados por elas? | Não |


---


| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 5 | ALTA | PS-5 |Como gestor de contratos quero adicionar funcionários no sistema para ter controle dos seus horários de trabalho.   | 5 | 1 | RF1, RNF1, RNF4  |

### Requisitos
- O sistema permite inserir nome, CPF e foto do funcionário e vinculá-lo a uma empresa existente.
- O funcionário pode ser editado ou desligado (desativado) posteriormente.
- O sistema deve validar os dados obrigatórios e garantir que o CPF não esteja duplicado antes de concluir o cadastro.

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

## Validações feitas com o Cliente

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
| Os funcionários terão acesso a esse sistema para poderem consultar o número de horas trabalhadas? | Não. O acesso é único e exclusivo do administrativo da contratante. |
| Gostaria que fosse possível inserir informações no sistema através de um arquivo CSV? | Não é requisito e não acho necessário. |

---

### Burndown
<img src="assets/burndown/burndown_sprint1.png" alt="BurnDown_Sprint1" width="100%" />

</details>

<details>
<summary>Sprint 2</summary>

## User Stories da Sprint

| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 1 | ALTA | PS-1 | Como gestor de contratos quero visualizar as marcações que o colaborador fez para saber o total de horas trabalhadas | 8 | 2 | RF2, RNF1  |

### Requisitos
- O sistema exibe todas as marcações de ponto registradas pelos colaboradores.
- Permite filtrar marcações por período, empresa e funcionário.
- O tempo total trabalhado é calculado 

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

## Validações feitas com o Cliente

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
| O ponto do funcionário deverá ser cadastrado manualmente nesse sistema através de uma interface? ou gostaria de apenas uma opção para inserir informações de um arquivo csv? | Não é requisito ter uma interface, mas de alguma forma precisamos ter como inserir os pontos. Uma interface no frontend ou um api seriam uteis. |

---

| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 3 | ALTA | PS-3 | Como gestor de contratos quero alterar um registro de ponto incorreto para manter a integridade das informações no sistema. | 5 | 2 | RF2, RNF1, RF4 |

### Requisitos
- O gestor pode editar um registro de ponto existente.
- As edições são registradas com um histórico de alterações.
- Apenas registros dentro de um período permitido podem ser alterados.

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

## Validações feitas com o Cliente

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
|  Gostaria que o sistema emitisse um alerta caso seja identificado algum registro faltando? (Por exemplo: foi marcado ponto de entrada mas não de saída no dia). | Temos um requisito de ser possível ajustar as entradas, mas não é necessário um alerta. |
| É necessário manter um histórico de alterações nos registros de ponto? Por exemplo, seria importante que o sistema registrasse e exibisse quando um determinado ponto foi alterado em alguma aba específica? | Sim, muito importante. |

---

| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 9 | MÉDIA | PS-9 | como gestor de contratos quero criar cargos de funcionarios no sistema para definir o pagamento por hora dos colaboradores.  | 3 | 2 | RF1, RNF1, RNF4  |

### Requisitos
- O sistema permite cadastrar cargos e definir valores por hora.
- Os cargos podem ser editados ou removidos.
-  Os cargos são vinculados corretamente aos funcionários.

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

---

| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 10 | BAIXA | PS-10 | Como gestor de contratos quero calcular quanto um funcionário receberá com base nas horas trabalhadas e cargo para garantir que as horas trabalhadas sejam devidamente pagas. | 5 | 2 | RF3, RF4, RNF1 |

### Requisitos
- O sistema calcula o valor devido ao funcionário com base no cargo e nas horas registradas.
- O cálculo considera apenas registros válidos.
- O gestor pode visualizar os valores totais por funcionário.

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

## Validações feitas com o Cliente

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
| Gostaria que fosse criada uma opção para calcular o pagamento dos funcionários por hora trabalhada e que isso fosse incluído no seu relatório individual? | Não é um requisito, mas é uma boa idéia. |
| No cálculo das horas trabalhadas, há a necessidade de definir um limite mínimo e/ou máximo de horas que os funcionários precisam ou podem trabalhar? | Não é requisito. |
|Para o cálculo do pagamento das horas trabalhadas, os valores serão fixos por cargo ou deverão ser definidos individualmente para cada funcionário? | Não é requisito. Podem definir. |

---

| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 11 | ALTA| PS-22 | Como gestor de contratos quero realizar o acesso no sistema através de email e senha para garantir a segurança dos dados contidos no mesmo | 5 | 2 | RF1, RNF1 |

### Requisitos
- O sistema valida as credenciais de acesso do usuario
- O usuario só é capaz de acessar o sistema com as credenciais corretas
- O usuario só acessa o sistema com credenciais de domínio da empresa

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

## Validações feitas com o Cliente

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
|Qual setor da Altave será responsável pela utilização do sistema? Há um funcionário específico que será o principal usuário? |  Departamento de contratos e terceirização. |

---

| Rank | Prioridade | ID | User Story | Estimativa | Sprint | Requisito do parceiro |
|------|------------|----|------------|------------|--------|-----------------------|
| 12 | MÉDIA | PS-30 | Como Administrador do Sistema quero poder cadastrar usuarios no sistema para ter controle do acesso dos funcionários gestores de contrato |8 | 2 | RF1, RNF1 |

### Requisitos
- O sistema permite o administrador cadastrar novos usuarios
- Os cadastros de usuarios no sistema devem conter email e senha provisória
-  O usuario pode alterar a senha provisória no primeiro acesso

### Definition of ready: 
- User story claramente definido, incluindo critérios de aceitação.
- Tarefas definidas, atribuidas e relacionadas às User Stories
- A user story foi estimada e priorizada corretamente na sprint.

### Definition of done: 
- Código funcional e organizado, disponibilizado no GitHub.
- A funcionalidade foi revisada por pelo menos um membro da equipe (code review).
- Código aprovado após passar por todas as etapas de testes descritos na Documentação de Testes.
- A documentação do projeto foi atualizada.
- Nenhum bug crítico foi identificado nos testes.

## Validações feitas com o Cliente

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
|Os usuários do sistema terão login próprio com domínio da Altave ou será apenas um login pro setor inteiro? |  Login próprio. |
|Gostaria que fosse criado uma interface de administrador do sistema onde será criado os usuários? assim ficaria mais simples a parte de inserir novos funcionários que irão usar o sistema! | Não é requisito, mas julgo como uma boa ideia ok. |


</details>

<details>
    <summary>Sprint 3</summary>
</details>

---

## Diagrama Entidade e Relacionamento do Banco de Dados
<img src="assets/ModeloRelacionalBD.jpg" alt="DER_BD" width="100%" />


<div align="center">
    <img src="assets/footer.png" alt="footer" width="100%" />
</div>

</body>
</html>
