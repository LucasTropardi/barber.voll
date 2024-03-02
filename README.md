## 💻 Sobre o projeto

Voll.barber é uma REST API para uma aplicação fictícia de uma barbearia.

## ⚙️ Funcionalidades

- [x] CRUD de barbeiros;
- [x] CRUD de clientes;
- [X] Agendamento de cortes;

## 📄 Regras de negócio

- O horário de funcionamento da barbearia é de segunda a sábado, das 07:00 às 19:00;
- Os cortes tem duração fixa de 1 hora;
- Os cortes devem ser agendados com antecedência mínima de 30 minutos;
- Não permitir o agendamento de cortes com clientes inativos no sistema;
- Não permitir o agendamento de cortes com barbeiros inativos no sistema;
- Não permitir o agendamento de mais de um corte no mesmo dia para um mesmo cliente;
- Não permitir o agendamento de um corte com um barbeiro que já possui outro corte agendado na mesma data/hora;
- A escolha do barbeiro é opcional, sendo que nesse caso o sistema deve escolher aleatoriamente algum barbeiro disponível na data/hora informada.

## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Maven](https://maven.apache.org)**
- **[MySQL](https://www.mysql.com)**
- **[Hibernate](https://hibernate.org)**
- **[Flyway](https://flywaydb.org)**
- **[Lombok](https://projectlombok.org)**