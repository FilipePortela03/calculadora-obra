# Calculadora de Materiais para Obra Residencial

Projeto desenvolvido para a disciplina de Desenvolvimento de Sistemas.

## Objetivo
O projeto consiste em uma aplicação completa (Fullstack) que oferece uma API REST para cálculos estruturais de engenharia e uma interface web para gestão dos orçamentos gerados.

## Funcionalidades

### 1. Interface Web (Frontend - Jakarta Faces)
Interface completa para interação do usuário:
- **Solicitação de Orçamento:** Formulário para entrada de dados da planta (paredes, tijolos, concreto).
- **Validação:** Verificação em tempo real de campos obrigatórios.
- **Persistência:** Salva automaticamente o cálculo no banco de dados.
- **Gestão:** Listagem, busca e visualização de orçamentos realizados.

### 2. API REST (Backend - Spring Boot)
Endpoints disponíveis para integração externa:

- **Volume de Concreto:** `POST /concreto/calcular`
  - Calcula o volume com base em lista de arestas (paredes), largura e altura.
- **Quantidade de Tijolos:** `POST /tijolos/calcular`
  - Calcula a quantidade de tijolos com base em lista de arestas, altura da parede e dimensões do tijolo.
- **Planta Baixa em Grafo:** `GET /planta/exemplo`
  - Representa a planta como grafo (vértices=encontros, arestas=paredes).

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Jakarta Faces (JSF) / Jakarta EE
- H2 Database
- Maven
- Swagger / OpenAPI
- Bootstrap (CSS)

## Como Executar
1. Clone o projeto para sua máquina;
2. Abra o projeto no IntelliJ IDEA;
3. Execute a classe `CalculadoraObraApplication`;
4. **Interface Web:** Acesse `http://localhost:8080/index.xhtml` no navegador;
5. **API REST (Swagger):** Acesse `http://localhost:8080/swagger-ui/index.html`.


```

## Estrutura do Projeto

src/main/java/com/filipe/calculadora_obra
├── bean
│   └── OrcamentoBean
├── controller
│   ├── ConcretoController
│   ├── TijoloController
│   └── PlantaController
├── dto
│   ├── ConcretoRequest
│   ├── TijoloRequest
│   └── ArestaRequest
├── service
│   ├── ConcretoService
│   └── TijoloService
├── model
│   ├── Vertice
│   ├── Aresta
│   ├── Comodo
│   ├── Planta
│   └── Orcamento
├── repository
│   └── OrcamentoRepository
├── exception
└── CalculadoraObraApplication
```

## Autor

Filipe Portela Silva
