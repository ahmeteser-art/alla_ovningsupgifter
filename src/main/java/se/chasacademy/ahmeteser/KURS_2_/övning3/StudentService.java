package se.chasacademy.ahmeteser.KURS_2_.övning3;

public class StudentService {

    private StudentRepository repository;//composition

    public StudentService(StudentRepository repository) {//Constructor Dependency Injection
        this.repository = repository;
    }

    public void registerStudent(Student student) {

        if (student.name() == null || student.name().isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (repository.findByName(student.name()) != null) {
            throw new IllegalArgumentException("Student already exists");
        }

        repository.save(student);
    }
}