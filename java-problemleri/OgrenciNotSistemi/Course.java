public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int oralNote;
    double oralWeight;

    public Course(String name, String code, String prefix, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.oralNote = 0;
        this.oralWeight = oralWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Islem basarili");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamistir.");
        }
    }

    public double weightedNote() {
        double examWeight = 1.0 - oralWeight;
        return (examNote * examWeight) + (oralNote * oralWeight);
    }
}
