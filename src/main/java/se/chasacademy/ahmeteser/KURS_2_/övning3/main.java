package se.chasacademy.ahmeteser.KURS_2_.övning3;

public class main {
    static void main() {
//        Student student1 = new Student("Amina");
//        Student student2 = new Student("Erik");
//        Student student3 = new Student("Mira");

//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student("Amina"));
//        students.add(new Student("Erik"));
//        students.add(new Student("Mira"));
//
//        for (Student student : students) {
//            System.out.println(student.name());
//        }
//        List<String> names1 = List.of("Amina","Erik","Ahmet");
//
//        List<Student> students = names1.stream().map(Student::new).toList();
//
//        List<Student> names2 = List.of(
//                new Student("Amina"),
//                new Student("Erik"),
//                new Student("Ahmet"));

//        names2.stream().forEach(names2 -> IO.println(names2.name()));
//        names2.stream.forEach(System.out::println);
//        names2.stream().map(Student::name).forEach(System.out::println);
//        List<String> newList= names2.stream().map(Student::name).toList();
//
//        newList.forEach(System.out::println);


        Object name = null;
        Student result = getStudent("Ahmet");


        IO.println(result);

    }

    private static Student getStudent(String name) {
        StudentRepository repository = new InMemoryStudentRepository();
        StudentService studentService = new StudentService(repository);

        studentService.registerStudent(new Student("Amina"));
        studentService.registerStudent(new Student("Erik"));
        studentService.registerStudent(new Student("Ahmet"));

//        repository.save(new Student("Amina"));
//        repository.save(new Student("Erik"));
//        repository.save(new Student("Ahmet"));

        Student result = repository.findByName(name);
        return result;
    }
}
