public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.10);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.20);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.30);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 60, 40);
        s1.addBulkOralNote(70, 90, 80);
        s1.isPass();

        System.out.println();

        Course mat2 = new Course("Matematik", "MAT101", "MAT", 0.10);
        Course fizik2 = new Course("Fizik", "FZK101", "FZK", 0.20);
        Course kimya2 = new Course("Kimya", "KMY101", "KMY", 0.30);

        mat2.addTeacher(t1);
        fizik2.addTeacher(t2);
        kimya2.addTeacher(t3);

        Student s2 = new Student("Guduk Necmi", 4, "2211133", mat2, fizik2, kimya2);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkOralNote(100, 60, 50);
        s2.isPass();
    }
}
