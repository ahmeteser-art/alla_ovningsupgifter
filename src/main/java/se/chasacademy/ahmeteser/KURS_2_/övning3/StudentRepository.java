package se.chasacademy.ahmeteser.KURS_2_.övning3;

import java.util.List;

public interface StudentRepository {
    void save(Student student);

    Student findByName(String name);

    List<Student> findAll();
}
