package se.chasacademy.ahmeteser.KURS_2_.övning3;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {

    private List<Student> students = new ArrayList<>();

    @Override
    public Student findByName(String name) {
        return students.stream()
                .filter(s -> s.name().equals(name)).findFirst().orElse(null);
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

}
