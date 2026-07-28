# Hands-on - Demonstrate Implementation of O/R Mapping

## Objective

Implement Object/Relational Mapping using Spring Data JPA.

## Relationships Demonstrated

- Many-to-One (Employee → Department)
- One-to-Many (Department → Employees)
- Many-to-Many (Employee ↔ Skill)

## JPA Annotations Used

- @Entity
- @Table
- @Id
- @GeneratedValue
- @Column
- @ManyToOne
- @OneToMany
- @ManyToMany
- @JoinColumn
- @JoinTable

## Project Files

- Employee.java
- Department.java
- Skill.java
- EmployeeRepository.java
- DepartmentRepository.java
- SkillRepository.java
- EmployeeService.java
- DepartmentService.java
- SkillService.java
- OrmLearnApplication.java
