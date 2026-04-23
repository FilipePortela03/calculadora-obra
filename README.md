# Calculadora de Materiais para Obra Residencial

Projeto desenvolvido para a disciplina de Desenvolvimento de Sistemas.

## Objetivo

Criar uma API REST em Spring Boot para cálculo de materiais utilizados em obras residenciais.

## Funcionalidades

### Volume de Concreto

```http
POST /concreto/calcular
```

Calcula o volume de concreto com base em largura, altura e comprimento.

### Quantidade de Tijolos

```http
POST /tijolos/calcular
```

Calcula a quantidade estimada de tijolos para paredes.

### Planta Baixa em Grafo

```http
GET /planta/exemplo
```

Representa a planta como grafo:

- Vértices = encontros estruturais
- Arestas = paredes
- Cômodos = ambientes internos

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- Swagger / OpenAPI
- H2 Database
- IntelliJ IDEA

## Como Executar

```bash
mvn spring-boot:run
```

Acesse o Swagger:

```text
http://localhost:8080/swagger-ui/index.html
```

## Estrutura do Projeto

```text
src/main/java/com/filipe/calculadora_obra
├── controller
│   ├── ConcretoController
│   ├── TijoloController
│   └── PlantaController
├── dto
│   ├── ConcretoRequest
│   └── TijoloRequest
├── service
│   ├── ConcretoService
│   └── TijoloService
├── model
│   ├── Vertice
│   ├── Aresta
│   ├── Comodo
│   └── Planta
├── repository
├── exception
└── CalculadoraObraApplication

## Autor

Filipe Portela Silva