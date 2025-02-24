
Este projeto consiste em um **web scraper** que extrai informações sobre os **10 filmes mais populares** do Rotten Tomatoes e expõe os dados através de uma **API REST** desenvolvida com **Java + Spring Boot**.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (Spring Web, Spring MVC)
- **Jsoup** (para web scraping)
- **Maven**

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Pré-requisitos  
- **JDK 17** ou superior  
- **Maven**  
- **Git**  

### 2️⃣ Clonar o Repositório  
```bash
git clone <URL_DO_REPOSITORIO>
cd <NOME_DO_PROJETO>
```

### 3️⃣ Construir o Projeto  
```bash
mvn clean install
```

### 4️⃣ Rodar a Aplicação  
```bash
mvn spring-boot:run
```

A API ficará disponível em **http://localhost:8080**  

---

## 📌 Endpoints Disponíveis  

| Método | Endpoint                | Descrição                      |
|--------|-------------------------|--------------------------------|
| GET    | `/api/movies/top10`     | Retorna os 10 filmes extraídos |

---

## 🛠️ Melhorias Futuras  
- Adicionar banco de dados para persistência  
- Melhorar a extração de dados para evitar inconsistências  

---


