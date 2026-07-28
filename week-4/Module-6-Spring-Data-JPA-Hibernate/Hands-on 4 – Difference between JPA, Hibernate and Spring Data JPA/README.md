# Hands-on 4 - Difference between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)

- JPA (Java Persistence API) is a Java specification (JSR 338) for persisting, reading, and managing data from Java objects.
- It defines standard APIs for Object Relational Mapping (ORM).
- JPA does not provide a concrete implementation.
- Hibernate is one of the implementations of JPA.

---

## Hibernate

- Hibernate is an Object Relational Mapping (ORM) framework.
- It implements the JPA specification.
- Hibernate provides features such as automatic table mapping, transaction management, caching, and Hibernate Query Language (HQL).
- Developers need to write more code for session and transaction management.

---

## Spring Data JPA

- Spring Data JPA is a Spring Framework module.
- It does not implement JPA itself; instead, it uses a JPA provider such as Hibernate.
- It reduces boilerplate code by providing repository interfaces.
- It automatically manages transactions and CRUD operations.

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|---------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Module |
| Implementation | No | Yes | Uses JPA Implementation |
| Boilerplate Code | More | Moderate | Very Less |
| Transaction Management | No | Manual | Automatic |
| Repository Support | No | No | Yes |
| Query Support | JPQL | HQL, JPQL, Native SQL | Query Methods, JPQL, Native SQL |

---

## Hibernate Example

```java
public Integer addEmployee(Employee employee) {

    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try {

        tx = session.beginTransaction();

        employeeID = (Integer) session.save(employee);

        tx.commit();

    } catch (HibernateException e) {

        if (tx != null)
            tx.rollback();

        e.printStackTrace();

    } finally {

        session.close();

    }

    return employeeID;
}
```

---

## Spring Data JPA Example

### EmployeeRepository.java

```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
```

### EmployeeService.java

```java
@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {

    employeeRepository.save(employee);

}
```

---

## Conclusion

- **JPA** is a specification for ORM.
- **Hibernate** is an implementation of JPA.
- **Spring Data JPA** simplifies database access by reducing boilerplate code and using Hibernate (or another JPA provider) internally.
