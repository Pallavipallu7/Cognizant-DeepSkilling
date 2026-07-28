# Hands-on - Demonstrate Query Methods Feature of Spring Data JPA

## Objectives

Implement Query Methods to:

- Search countries containing a given text.
- Search countries containing text in ascending order.
- Search countries whose names start with a specified alphabet.

## Query Methods Used

```java
findByNameContaining(String text)

findByNameContainingOrderByNameAsc(String text)

findByNameStartingWith(String alphabet)
```

## Technologies

- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
