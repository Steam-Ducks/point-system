<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

# 🛠️ Manual de Instalação - Pontual

## 📁 Estrutura do Projeto
/point-system/
│
├── /ps-client/     # Frontend - Vue.js
└── /ps-server/     # Backend - Spring Boot

---

## ✅ Pré-requisitos

### 🔧 Backend (Spring Boot)
- Java JDK 20+
- Maven
- IDE recomendada: IntelliJ IDEA (ou Eclipse)

### 🎨 Frontend (Vue.js)
- Node.js 18+
- Vue CLI (opcional)
- IDE recomendada: VS Code

---

## ⚙️ Configuração do Back-end

### 1. Clone o projeto

```bash
git clone https://github.com/Steam-Ducks/point-system.git
cd point-system/ps-server/point-system
```
### 2. Carregue as dependências

Abra o projeto na sua IDE e aguarde o carregamento das dependências Maven.

<div align="center">
<img src="assets/maven1" alt="img" width="100%" />
</div>


<div align="center">
<img src="assets/maven2" alt="img" width="100%" />
</div>



### 3. Execute o projeto

- Via IDE:

<div align="center">
<img src="assets/execute" alt="img" width="100%" />
</div>

Execute a classe PointSystemApplication.

<div align="center">
<img src="assets/execute2" alt="img" width="100%" />
</div>

Via terminal:

```bash
mvn clean install
mvn spring-boot:run
```
O backend sera iniciado em:

```bash
http://localhost:8080
```

## 💻 Configuração do Frontend

### 1. Acesse a pasta do frontend

```bash
cd ../ps-client/ps-client
```

### 2. Instale as dependências

```bash
npm install
```

### 3. Execute o frontend

```bash
npm run serve
```

A aplicação será iniciada em:

```bash
http://localhost:8081
```

## 📝 Observações
- O backend deve estar rodando antes de iniciar o frontend.

- Certifique-se de instalar todos os componentes necessários.

- Para mais informações, acesse o repositório do sistema:
https://github.com/Steam-Ducks/point-system

</body>
</html>
