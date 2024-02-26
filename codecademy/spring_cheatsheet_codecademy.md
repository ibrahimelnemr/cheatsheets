https://www.codecademy.com/learn/learn-spring/modules/spring-controllers/cheatsheet

# Table of Contents

[How Spring Works](#how-spring-works)

[Spring Controllers](#spring-controllers)

[Boots and Beans](#boots-and-beans)

[Data Strategies](#data-strategies)

[Spring Data and JPA](#spring-data-and-jpa)

# How Spring Works
## What is Spring?
Spring is an open-source Java framework that is useful, among other things, for building RESTful web apps. Spring’s predefined code conventions and reusable templates provide project “scaffolding” so that developers can concentrate on the core logic of applications.


# Spring Controllers
## Mapping HTTP Requests
The @RequestMapping annotation can be used at the method level or the class level to map an HTTP request to the appropriate controller method.


```java
@RequestMapping("/sayhello")
public String sayHello() {
  return "Hello, world";
}
```
## Base Path Mapping
When the @RequestMapping annotation is used at the class level, the specified path attribute becomes the base path for the class.

In the example code, getallRecipes is called for every GET request to the /foodierecipes endpoint.
```java
@RequestMapping("/foodierecipes")
public class FoodieRecipesController {
  
  private final RecipeRepository recipeRepository;

  public FoodieRecipesController(RecipeRepository recipeRepo) {
    this.recipeRepository = recipeRepo;
  }

  @GetMapping()
  public Iterable<Recipe> getAllRecipes() {        
    return this.recipeRepository.findAll();
  }
}
```
## Common Request Types
Spring provides annotations that map to common request types. These methods include @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping.


```java

// Method parameters and bodies omitted for brevity

@RestController
public class FlowerController {
  
  @GetMapping("/flowers")
  public Iterable<Flower> getAllFlowers() {}
  
  @PostMapping("/flowers")
  public Flower addFlower() {}
  
  @PutMapping("/flowers/{id}")
  public Flower editFlower() {}
  
  @DeleteMapping("/flowers/{id}")
  public Flower deleteFlower() {}
}
```
## Accessing Parameters in Methods
The @RequestParam annotation can be used at the method parameter level to allow the HTTP request parameters to be accessed in the method.


```java

// Accepts GET requests to /fruit?fruitType=mango

@GetMapping("/fruit")
public fruit isFruitAvailable(@RequestParam String fruitType) {
  return fruit.find(fruitType);
}
```
## REST Controllers
@RestController is a class level annotation used to combine the functionality of the @Controller and @ResponseBody annotations.

@Controller designates the annotated class as a controller
@ResponseBody allows returned objects to be automatically serialized into JSON and returned in the HTTP response body
```java
@RestController
public class LocationController {
  
  @GetMapping("/{gpsCoordinates}")
  public City getByCoordinates(@PathVariable String gpsCoordinates) {
    return this.locations.findByCoordinates(gpsCoordinates);
  }
  
}
```
## Response Exceptions
Spring controllers can return a custom HTTP status code by throwing an instance of ResponseStatusException, which accepts an argument of type HttpStatus.


```java
@GetMapping("/{id}")
public Book isBookAvailable(@PathVariable string id) 
{
  if (id.isNumeric()) {
    int idAsInteger = Integer.parseInt(id)
    return book.findByID(idAsInteger)
  } 
  else {
    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The ID contained a non-numerical value.");
  }
}
```
## HttpStatus Type
In Spring, the HttpStatus type can be used to represent different HTTP status codes.


```java

HttpStatus.OK // 200 code

HttpStatus.MOVED_PERMANENTLY // 301 code  

HttpStatus.NOT_FOUND // 404 code

HttpStatus.BAD_GATEWAY // 502 code
```
## Spring Specifying HTTP Status Code
In Spring, we have the option of apply the @ResponseStatus annotation to a method to designate a specific HttpStatus.


```java
@PostMapping("/book")
@ResponseStatus(HttpStatus.CREATED)
public void addNewBook(@RequestParam string title) {
  this.library.add(title);
}
```
## Deserializing to an Object
In Spring, applying the @RequestBody annotation to a controller’s method enables automatic deserialization of the HTTP request body to an object bound to the method’s argument.


```java
@GetMapping("/book")
public Book isBookAvailable(@RequestBody Book book) {
  return library.find(book);
}

```

# Boots and Beans
## Spring bean
A Spring bean refers to an object that’s managed by the Spring Inversion of Control (IoC) container.

@SpringBootApplication

Applying @SpringBootApplication to a Spring app’s main application class

Enables Spring to identify the class as the configuration class that provides beans for the Spring application context
Enables Spring to scan for and configure annotated classes as beans
Enables Spring to configure beans based on code as well as jar dependencies
@SpringBootApplication is a compilation of the @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations.

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExampleApplication.class, args);
  }

}
```
## application context
The application context serves as a container into which Spring can inject beans.


## Spring Boot
Spring Boot extends the Spring framework by enabling the autoconfiguration of Spring beans, further simplifying development.


## application.properties

The application.properties file specifies the configuration properties of a Spring Boot application.

# Data Strategies
## Spring Java Persistence API
The Java Persistence API (JPA) is a specification for the set of interfaces to store, query, and update data stored in a database. JPA can be implemented by an Object Relational Mapping (ORM) which maps classes to a database table. JPA’s use of ORM allows developers to interact with the database without having to write database queries.


## Spring H2 Database
H2 is a type of database engine in Java. It is embedded into the application and supports in-memory or disk-based persistence.


# Spring Data and JPA
## Spring Java Data Model
A data model is the set of objects that represents the concepts in your problem domain, whose data you will want to ultimately store in a database.

For example in a music playlist application, the data model would consist of artists, albums, and tracks, and the possible relations between them.


## Spring JPA Entity
Applying the @Entity annotation to a class with JPA declares that the class definition will correspond to a database table with a similar name.


## Spring JPA @Id
The @Id annotation can be applied to a member of a class to designate that this member will uniquely identify the entity in the database.


```java
@Entity
@Table(name="Library")
public class Book {
  @Id
  private Integer id;
 
  @Column(name="Title")
  private String Title;
}
```
## Spring JPA @GeneratedValue
The @GeneratedValue annotation can be used with parameters alongside @Id to designate how an entity’s unique ID value will be generated. If no parameters are provided, the ID will be generated according to the default algorithm used by the underlying database.


```java
@Entity
@Table(name="TELEVISIONS")
public class Television {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
 
  @Column(name="Brand")
  private String brand;
}
```
## Spring JPA Repository
With Spring Data JPA, the developer creates a data repository by writing a repository interface and adding custom finder methods. Spring provides the implementation automatically.

```java
import org.springframework.data.repository.CrudRepository; 
import com.codecademy.people.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {}

```
## Spring JPA Repository Injection
With Spring Data JPA, listing repositories as properties allows them to be made available to other classes. This functionality is facilitated by the repository instance being injected into the class at runtime.

```java
import org.springframework.web.bind.annotation.RestController;
import com.codecademy.people.repositories.PersonRepository;
 
@RestController
public class PersonController {
  private final PersonRepository personRepository;
 
  public PersonController(final PersonRepository personRepository) {
    this.personRepository = personRepository;
}
}
```
## Spring JPA Save Method
The save method of the CrudRepository can be used to create or update an entity in the database. It returns the newly-saved / updated entity.


```java
@PostMapping("/people")
public Person createNewPerson(@RequestBody Person person) {
  Person newPerson = this.personRepository.save(person);
  return newPerson;
}

```
## Spring JPA FindAll Method
The findAll method of the CrudRepository returns an iterable collection of entities from the database.

```java
@GetMapping("/people")
public Iterable<Person> getAllPeople() {
  return this.personRepository.findAll();
}
```
## Spring JPA Delete Method
The delete method of the CrudRepository removes a given entity.

```java
@DeleteMapping("/people/{id}")
public Person deletePerson(@PathVariable("id") Integer id) {
  Optional<Person> personToDeleteOptional = this.personRepository.findById(id);
  if (!personToDeleteOptional.isPresent()) {
    return null;
  }
  Person personToDelete = personToDeleteOptional.get();
  this.personRepository.delete(personToDelete);
  return personToDelete;
}
```
## Spring JPA FindByID Method
The findById method of the CrudRepository retrieves an entity by its ID.

```java
@GetMapping("/people/{id}")
public Optional<Person> getPersonById(@PathVariable("id") Integer id) {
  return this.personRepository.findById(id);
}
```
## Spring JPA H2 Console
```java
Spring Boot configures an H2 console that allows developers to inspect the application’s database. The console can be accessed via the browser at the URI /h2-console.

```
