<details>
<summary>Lesson 47. Layered architecture in Java</summary>

# Lesson 47. Layered architecture in Java

## Lesson objectives

### Understand the principles of multi-layered architecture

Layered architecture is an approach to software development in which an application is divided into
separate layers, each of which has its own tasks and responsibilities. This helps to organize the code in such a way
that it is more manageable, modular, and easy to test and maintain. The main layers include:

- **Presentation Layer**: Responsible for user interaction, data display, and
  interpretation of user commands.
- **Business Logic Layer**: Contains data processing logic that defines the rules of operation
  applications.
- **Data Access Layer**: Provides access to data stored in a database or other
  repositories, hiding implementation details.

### Learn how to highlight services, repositories, and models in Java projects

- **Models**: Classes representing the data structure that the application works with. For example, the `User` class
  It can represent a user with fields for name, email, etc.
- **Repositories**: Interfaces and their implementations that provide abstraction for accessing data,
  hiding database queries behind them. This makes it easy to change the way data is stored without making changes to the
  business logic.
- **Services**: Components containing the business logic of the application. They work with models and repositories for
  performing operations such as user registration, order processing, etc.

### Apply the acquired knowledge on a practical example

In practice, we implement a simple application using a multi-layered architecture. For example, an application for
library management, where it will be necessary:

- Define models for representing books, authors, and readers.
- Create repositories to access the database for these entities.
- Develop services that will use repositories to perform operations such as adding a new book
  to the catalog or registering a reader in the system.
  This will help students understand how to apply layered architecture in practice and see the benefits of such
  an approach in real development.

## Introduction

### Overview of the concept of multi-layered architecture

Layered architecture is a popular approach in software development that involves dividing
an application into separate layers, where each layer performs its own unique function. This approach facilitates the development,
testing, management and support of the application by clearly dividing responsibilities between components.
The multi-layered architecture allows developers and teams to work on different parts of the application in parallel,
minimizing risks and simplifying integration.

### Why layered architecture is important for large projects

For large projects, multi-layered architecture is the key to successful development and support for several reasons:

- **Scalability**: Easily add new functions and modules without affecting existing logic.
- **Lightweight support**: Changes in one layer are made independently, which reduces the likelihood of errors and simplifies
  updates.
- **Flexibility**: The ability to replace or modify individual layers without affecting the rest of the system.
- **Testability**: It is easier to write and maintain tests for individual components.

### Architecture layers: representation, business logic (services), data access (repositories)

- **Presentation Layer**: Responsible for user interaction. Interfaces are implemented here
  applications, including web pages and mobile applications.
- **Business Logic Layer**: Contains the main functionality of the application. This layer processes
  user requests by performing relevant operations through services such as order processing or management
  accounts.
- **Data Access Layer**: Provides communication with data sources such as databases and
  external services. Repositories in this layer encapsulate the logic of data queries, providing an abstract interface
  for working with them.

These layers work together to create a structured and efficiently functioning application where each part
specializes in performing its tasks and interacts with others only through strictly defined interfaces.

## Basic concepts

### Model (Model)

A model in a layered architecture is a representation of the data that an application works with. Models describe the structure
of data through classes and objects, including their attributes and behavior. In the context of Java, the model is usually implemented as
classes with private fields and public methods for accessing (getters) and changing (setters) these fields. The models serve
to transfer data between application layers, allowing, for example, services to process user data or
product information.

### Repository

A repository in a multi—layered architecture is a component responsible for accessing data. It provides abstraction over
a data storage layer such as a database, allowing the service layer to interact with the data without having to
know about the specific details of implementing data access. Repositories contain methods for performing operations with data,
such as creating, reading, updating and deleting (CRUD). Using repositories helps to separate
business logic from the details of data access implementation, simplifying application development and support.

### Service

The service layer in a multi-layered architecture contains the business logic of the application. Services process business operations
using models and repositories. The service layer is responsible for executing business rules and provides the logic needed
to perform application-specific operations. For example, in an e-commerce application, the service can
process the order processing, including checking the availability of goods in stock, calculating the cost of delivery and processing
payments. Services can interact with one or more repositories to receive and save data, and
they can also call other services to perform complex operations.

## Analysis of architecture layers

### Model

#### Defining model classes

Model classes in Java are usually defined using public classes that encapsulate application data.
These classes contain private fields for storing data and public methods for accessing and modifying this data (getters and
setters). Models can also include business logic related directly to the data.

#### Examples of models: User, Product, Order

- **User**: Represents the system user with fields for name, email and password.
- **Product**: Describes the product with fields for name, price and description.
- **Order**: Represents an order containing information about the customer, the list of ordered products and the status of the order.

### Repository

#### The role of the repository in the architecture

The repository serves as a bridge between the business logic layer and the data storage layer, providing an abstract interface for
data queries. This allows you to change the way data is stored without affecting the business logic.

#### Example of creating a repository interface and its implementation

```java
public interface UserRepository {
    User findById(Long id);

    void save(User user);
}

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findById(Long id) {
        // Implementation of the method for searching for a user by ID
    }

    @Override
    public void save(User user) {
        // Implementation of the method to save the user in the database
    }
}
```

### Service

#### Tasks of the service layer

The service layer is responsible for executing the business logic of the application, processing business-specific rules and operations. It
uses models to represent data and repositories to store and retrieve it.

#### Creating a service: interface and implementation

```java
public interface UserService {
    User registerUser(User user);
}

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        // User registration logic
        userRepository.save(user);
        return user;
    }
}
```

Interaction of the service with the repository
The service layer interacts with the repository to perform data operations. In the example above, `UserServiceImpl`
uses `UserRepository` to save the user to the database. This demonstrates how services can use
repositories for accessing and manipulating data, while ensuring that business rules and logic are followed.

</details>

----------------



<details>
<summary>Урок 47. Многослойная архитектура в Java</summary>

# Урок 47. Многослойная архитектура в Java

## Цели урока

### Понять принципы многослойной архитектуры

Многослойная архитектура — это подход к разработке программного обеспечения, при котором приложение разделяется на
отдельные слои, каждый из которых имеет свои задачи и ответственность. Это помогает организовать код таким образом,
чтобы он был более управляемым, модульным и легким в тестировании и поддержке. Основные слои включают:

- **Слой представления (Presentation Layer)**: Отвечает за взаимодействие с пользователем, отображение данных и
  интерпретацию пользовательских команд.
- **Слой бизнес-логики (Business Logic Layer)**: Содержит логику обработки данных, которая определяет правила работы
  приложения.
- **Слой доступа к данным (Data Access Layer)**: Обеспечивает доступ к данным, хранящимся в базе данных или других
  хранилищах, скрывая детали реализации.

### Научиться выделять сервисы, репозитории и модели в Java-проектах

- **Модели (Models)**: Классы, представляющие структуру данных, с которыми работает приложение. Например, класс `User`
  может представлять пользователя с полями для имени, электронной почты и т.д.
- **Репозитории (Repositories)**: Интерфейсы и их реализации, которые обеспечивают абстракцию для доступа к данным,
  скрывая за собой запросы к базе данных. Это позволяет легко изменять способы хранения данных без внесения изменений в
  бизнес-логику.
- **Сервисы (Services)**: Компоненты, содержащие бизнес-логику приложения. Они работают с моделями и репозиториями для
  выполнения операций, таких как регистрация пользователя, обработка заказов и т.д.

### Применить полученные знания на практическом примере

На практике мы реализуем простое приложение, используя многослойную архитектуру. Например, приложение для управления
библиотекой, где будет необходимо:

- Определить модели для представления книг, авторов и читателей.
- Создать репозитории для обращения к базе данных для этих сущностей.
- Разработать сервисы, которые будут использовать репозитории для выполнения операций, таких как добавление новой книги
  в каталог или регистрация читателя в системе.
  Это поможет студентам понять, как применять многослойную архитектуру на практике, и увидеть преимущества такого
  подхода в реальной разработке.

## Введение

### Обзор концепции многослойной архитектуры

Многослойная архитектура — это популярный подход в разработке программного обеспечения, который предполагает разделение
приложения на отдельные слои, где каждый слой выполняет свою уникальную функцию. Этот подход облегчает разработку,
тестирование, управление и поддержку приложения за счет четкого разделения ответственности между компонентами.
Многослойная архитектура позволяет разработчикам и командам работать над разными частями приложения параллельно,
минимизируя риски и упрощая интеграцию.

### Почему многослойная архитектура важна для крупных проектов

Для крупных проектов многослойная архитектура является ключом к успешной разработке и поддержке по нескольким причинам:

- **Масштабируемость**: Легко добавлять новые функции и модули, не затрагивая существующую логику.
- **Облегченная поддержка**: Изменения в одном слое вносятся независимо, что уменьшает вероятность ошибок и упрощает
  обновления.
- **Гибкость**: Возможность заменять или модифицировать отдельные слои без влияния на остальные части системы.
- **Тестируемость**: Проще писать и поддерживать тесты для отдельных компонентов.

### Слои архитектуры: представление, бизнес-логика (сервисы), доступ к данным (репозитории)

- **Слой представления (Presentation Layer)**: Отвечает за взаимодействие с пользователем. Здесь реализуются интерфейсы
  приложения, включая веб-страницы и мобильные приложения.
- **Слой бизнес-логики (Business Logic Layer)**: Содержит основную функциональность приложения. Этот слой обрабатывает
  запросы пользователя, выполняя соответствующие операции через сервисы, такие как обработка заказов или управление
  аккаунтами.
- **Слой доступа к данным (Data Access Layer)**: Обеспечивает связь с источниками данных, такими как базы данных и
  внешние сервисы. Репозитории в этом слое инкапсулируют логику запросов к данным, предоставляя абстрактный интерфейс
  для работы с ними.

Эти слои работают вместе, чтобы создать структурированное и эффективно функционирующее приложение, где каждая часть
специализируется на выполнении своих задач и взаимодействует с другими только через строго определенные интерфейсы.

## Основные понятия

### Модель (Model)

Модель в многослойной архитектуре — это представление данных, с которыми работает приложение. Модели описывают структуру
данных через классы и объекты, включая их атрибуты и поведение. В контексте Java, модель обычно реализуется в виде
классов с приватными полями и публичными методами для доступа (getters) и изменения (setters) этих полей. Модели служат
для передачи данных между слоями приложения, позволяя, например, сервисам обрабатывать данные пользователя или
информацию о продуктах.

### Репозиторий (Repository)

Репозиторий в многослойной архитектуре — это компонент, отвечающий за доступ к данным. Он предоставляет абстракцию над
слоем хранения данных, таким как база данных, позволяя сервисному слою взаимодействовать с данными без необходимости
знать о конкретных деталях реализации доступа к данным. Репозитории содержат методы для выполнения операций с данными,
таких как создание, чтение, обновление и удаление (CRUD). Использование репозиториев способствует отделению
бизнес-логики от деталей реализации доступа к данным, упрощая разработку и поддержку приложения.

### Сервис (Service)

Сервисный слой в многослойной архитектуре содержит бизнес-логику приложения. Сервисы обрабатывают бизнес-операции,
используя модели и репозитории. Сервисный слой отвечает за выполнение бизнес-правил и обеспечивает логику, необходимую
для выполнения операций, специфичных для приложения. Например, в приложении для электронной коммерции сервис может
обрабатывать оформление заказа, включая проверку наличия товара на складе, расчет стоимости доставки и обработку
платежей. Сервисы могут взаимодействовать с одним или несколькими репозиториями для получения и сохранения данных, а
также могут вызывать другие сервисы для выполнения сложных операций.

## Разбор слоев архитектуры

### Модель

#### Определение классов модели

Классы модели в Java обычно определяются с использованием публичных классов, которые инкапсулируют данные приложения.
Эти классы содержат приватные поля для хранения данных и публичные методы для доступа и изменения этих данных (геттеры и
сеттеры). Модели могут также включать бизнес-логику, относящуюся непосредственно к данным.

#### Примеры моделей: User, Product, Order

- **User**: представляет пользователя системы с полями для имени, электронной почты и пароля.
- **Product**: описывает продукт с полями для наименования, цены и описания.
- **Order**: представляет заказ, содержащий информацию о покупателе, списке заказанных продуктов и статусе заказа.

### Репозиторий

#### Роль репозитория в архитектуре

Репозиторий служит мостом между слоем бизнес-логики и слоем хранения данных, предоставляя абстрактный интерфейс для
запросов к данным. Это позволяет изменять способы хранения данных без влияния на бизнес-логику.

#### Пример создания интерфейса репозитория и его реализации

```java
public interface UserRepository {
    User findById(Long id);

    void save(User user);
}

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findById(Long id) {
        // Реализация метода для поиска пользователя по ID
    }

    @Override
    public void save(User user) {
        // Реализация метода для сохранения пользователя в базе данных
    }
}
```

### Сервис

#### Задачи сервисного слоя

Сервисный слой отвечает за выполнение бизнес-логики приложения, обработку правил и операций, специфичных для бизнеса. Он
использует модели для представления данных и репозитории для их сохранения и извлечения.

#### Создание сервиса: интерфейс и реализация

```java
public interface UserService {
    User registerUser(User user);
}

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        // Логика регистрации пользователя
        userRepository.save(user);
        return user;
    }
}
```

Взаимодействие сервиса с репозиторием
Сервисный слой взаимодействует с репозиторием для выполнения операций с данными. В примере выше, `UserServiceImpl`
использует `UserRepository` для сохранения пользователя в базе данных. Это демонстрирует, как сервисы могут использовать
репозитории для доступа к данным и их манипуляции, обеспечивая при этом выполнение бизнес-правил и логики.

</details>
