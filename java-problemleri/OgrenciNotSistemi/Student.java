public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }
    }

    public void addBulkOralNote(int matOral, int fizikOral, int kimyaOral) {
        if (matOral >= 0 && matOral <= 100) {
            this.mat.oralNote = matOral;
        }
        if (fizikOral >= 0 && fizikOral <= 100) {
            this.fizik.oralNote = fizikOral;
        }
        if (kimyaOral >= 0 && kimyaOral <= 100) {
            this.kimya.oralNote = kimyaOral;
        }
    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0
                || this.mat.oralNote == 0 || this.fizik.oralNote == 0 || this.kimya.oralNote == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sinifi Gecti.");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.mat.weightedNote() + this.fizik.weightedNote() + this.kimya.weightedNote()) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average >= 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Sinav : " + this.mat.examNote + " | Sozlu : " + this.mat.oralNote);
        System.out.println("Fizik Sinav : " + this.fizik.examNote + " | Sozlu : " + this.fizik.oralNote);
        System.out.println("Kimya Sinav : " + this.kimya.examNote + " | Sozlu : " + this.kimya.oralNote);
        System.out.println("Ders Ortalamalari:");
        System.out.println("- Matematik : " + this.mat.weightedNote());
        System.out.println("- Fizik : " + this.fizik.weightedNote());
        System.out.println("- Kimya : " + this.kimya.weightedNote());
    }
}
