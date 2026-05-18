# FinConnect — Backend

API REST desenvolvida em **Java com Spring Boot**, responsável por gerenciar usuários, transações, especialistas e áreas de atuação da plataforma FinConnect.

---

## 🚀 Como rodar o projeto

Há duas formas de rodar o projeto:
- Localmente;
- Através do link do projeto em "produção".

### Rodando o projeto localmente

**Pré-requisitos:** Java 17+ e Maven instalados.

```bash
git clone https://github.com/seu-usuario/finconnect-backend.git
cd finconnect-backend
mvn spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

### Rodando o projeto através do link de "produção"

Acesse o projeto através [desse link](https://finconnect-frontend.vercel.app/login).

---

## ⚠️ Observações Importantes

### Deploy — Lentidão na primeira requisição

O backend está hospedado na **Render**.

Caso esteja acessando pelo link do deploy, **a primeira requisição pode levar até 2 minutos**.

> 🔔 **ATENÇÃO: ISSO NÃO É UM ERRO!**
>
> No plano gratuito da Render, o servidor entra em modo **sleep** após um período de inatividade. Esse atraso é o tempo necessário para ele "acordar".
>
> Basta aguardar cerca de **2 minutos** e a API responderá normalmente.

---

## 📡 Endpoints

### Usuários — `/api/usuarios`

| Método | Rota              | Descrição                  | Status de retorno |
|--------|-------------------|----------------------------|-------------------|
| GET    | `/api/usuarios`   | Lista todos os usuários    | 200 OK            |
| GET    | `/api/usuarios/{id}` | Busca usuário por ID    | 200 OK            |
| PUT    | `/api/usuarios/{id}` | Atualiza um usuário     | 200 OK            |
| DELETE | `/api/usuarios/{id}` | Remove um usuário       | 204 No Content    |

---

### Transações — `/api/transacoes`

| Método | Rota                          | Descrição                        | Status de retorno |
|--------|-------------------------------|----------------------------------|-------------------|
| POST   | `/api/transacoes`             | Cria uma nova transação          | 201 Created       |
| GET    | `/api/transacoes`             | Lista todas as transações        | 200 OK            |
| GET    | `/api/transacoes/{id}`        | Busca transação por ID           | 200 OK            |
| GET    | `/api/transacoes/usuario/{id}`| Lista transações de um usuário   | 200 OK            |
| PUT    | `/api/transacoes/{id}`        | Atualiza uma transação           | 200 OK            |
| DELETE | `/api/transacoes/{id}`        | Remove uma transação             | 204 No Content    |

---

### Especialistas — `/api/especialistas`

| Método | Rota                        | Descrição                          | Status de retorno |
|--------|-----------------------------|------------------------------------|-------------------|
| GET    | `/api/especialistas`        | Lista todos os especialistas       | 200 OK            |
| GET    | `/api/especialistas/area?id={id}` | Lista especialistas por área | 200 OK            |
| POST   | `/api/especialistas`        | Cadastra um novo especialista      | 201 Created       |

---

### Áreas de Atuação — `/api/areas-especialistas`

| Método | Rota                        | Descrição                        | Status de retorno |
|--------|-----------------------------|----------------------------------|-------------------|
| GET    | `/api/areas-especialistas`  | Lista todas as áreas de atuação  | 200 OK            |
| POST   | `/api/areas-especialistas`  | Cadastra uma nova área           | 201 Created       |