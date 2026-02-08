### Could you explain the Spring Boot Bean instantiation and injection lifecycle? Specifically, how does the process differ when a class uses a default constructor versus a parameterized constructor, and how does Spring handle @Autowired dependencies in both scenarios?

### What occurs when two beans require each other via constructor injection, and what are the strategies to resolve this startup failure?"
- Key Concepts: BeanCurrentlyInCreationException, @Lazy initialization, Architectural Refactoring (Extraction to a third service).

### let’s talk about Dependency Injection. Suppose you have a Spring component with three different constructors, but none of them are marked with @Autowired. What will Spring do when it tries to initialize that bean? And if I specifically want to use the second constructor without modifying the class code, how would you achieve that?"
- Key Concept: Default constructor behavior vs. Manual Configuration.

### Imagine we need two separate instances of ReportService in the same application context. One should be initialized with a standard configuration, and the other with a 'Premium' configuration using a different constructor. How do you register both in the container, and how do you ensure the correct one gets injected into a specific Controller?"
- Key Concept: @Bean method naming, @Qualifier, and avoiding NoUniqueBeanDefinitionException.

### You've shown how to configure beans at startup. But in a real-world scenario—like a social media app—certain objects depend on user input that we only get at runtime (e.g., a Post object with a specific userId and content). Since Spring beans are usually Singletons created at startup, how would you handle creating an object that needs both Spring-managed dependencies (like a DatabaseService) and dynamic runtime data?"
- Key Concept: The Factory Pattern vs. Prototype Scope.

### You mentioned using a Factory to pass dynamic values to a constructor at runtime. Why would you go through the trouble of a Factory and Constructor injection instead of just using a standard Singleton bean and setting the values later using Setter methods? What are the architectural trade-offs here?"
- Key Concept: Immutability, Thread-safety, and "Fail-fast" validation.

### Difference between @Restcontroller and @Controller annotation in spring boot. Why do we have to explicitly add @ResponseBody annotation in @Controller methods for return JSON?

### What are the functional differences between @Entity and @Component annotations? Furthermore, how does the framework resolve constructor selection—specifically between default and parameterized—without explicit configuration, and is a no-argument constructor strictly mandatory for JPA entities?

### How does Spring Boot resolve Constructor Injection for a @Component when multiple constructors and multiple @Bean definitions of the same return type exist in a @Configuration class? Specifically, if @Autowired is used on one constructor but not others, or if both @Component and @Bean definitions are present simultaneously, how does Spring determine which source—and which specific arguments—to use for object instantiation and property population?"
- Key Concepts: Implicit vs. Explicit Autowiring, Bean Definition Overriding, Qualifiers and Parameter Matching, Component Scanning vs. Factory Methods, and the Spring Bean Lifecycle.

### 