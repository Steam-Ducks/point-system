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

| Validações                                      | Respostas                                                         |
|-------------------------------------------------|-------------------------------------------------------------------|
| Os funcionários terão acesso a esse sistema para poderem consultar o número de horas trabalhadas? | Não. O acesso é único e exclusivo do administrativo da contratante. |
| Gostaria que fosse possível inserir informações no sistema através de um arquivo CSV? | Não é requisito e não acho necessário. |

</details>

<details>
<summary>Sprint 2</summary>
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
