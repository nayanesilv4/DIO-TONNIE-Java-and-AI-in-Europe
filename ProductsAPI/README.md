# 📦 Products API

Esta é uma API RESTful simples desenvolvida em Java como parte da aula **"Escrevendo Prompts Eficazes"** do **Bootcamp TONNIE - Java and AI in Europe**, promovido pela [DIO](https://web.dio.me/track/67966d9a-e33d-4e88-a167-ec7acd68b701).

A API permite realizar operações básicas de **CRUD** (Create, Read, Update, Delete) para uma lista de produtos.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Springdoc OpenAPI (Swagger)
- Maven
- IDE: IntelliJ
- Insomnia (para testes manuais)

---

## 🛠 Funcionalidades

- ✅ Cadastrar novo produto
- 📋 Listar todos os produtos
- ✏️ Atualizar produto existente
- ❌ Deletar produto

---

## 📄 Modelo de Produto (JSON)

```json
{
  "id": 1,
  "name": "Produto Exemplo",
  "price": 99.90
}
```

## 🔧 Endpoints da API

| Método | Rota                | Descrição                     |
|--------|---------------------|-------------------------------|
| POST   | `/products`         | Cadastrar um novo produto     |
| GET    | `/products`         | Listar todos os produtos      |
| PUT    | `/products/{id}`    | Atualizar produto existente   |
| DELETE | `/products/{id}`    | Remover produto por ID        |

## 📘 Documentação com Swagger 
A API possui documentação interativa gerada automaticamente com Swagger UI, facilitando a visualização e testes dos endpoints.

# ✅ Acessar a documentação
Após iniciar a aplicação, acesse no navegador:

```bash
http://localhost:8080/swagger-ui.html
```

## ▶️ Como Executar o Projeto

1. **Clone o repositório:**
```bash
   git clone
```
   
2. **Navegue até o diretório do projeto:**
```bash
   cd api-cadastro-produtos
```
   
3. **Abra o projeto na sua IDE (IntelliJ, por exemplo).**

4. **Compile e execute o Maven.** 
```bash
    ./mvnw spring-boot:run
```
5. **Acesse a API:**
```bash
    http://localhost:8080/products
```

## 📫 Contato

Projeto desenvolvido por **Nayane da Siva** como parte do bootcamp TONNIE - Java and AI in Europe.
Em caso de dúvidas ou sugestões, entre em contato:

**Email:** nayanecosilva@gmail.com

**LinkedIn:** https://www.linkedin.com/in/nayanecosta/

> 🚧  Este projeto tem fins educacionais e foi criado para praticar os conceitos aprendidos na aula sobre escrita de prompts eficazes no contexto de APIs REST com Java. 

   