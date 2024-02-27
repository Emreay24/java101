package OgrencıSıtem;
public class Course {
    private String name;
    private String code;
    private String prefix;
    private double note;
    private Teacher teacher;
    private double verbalWeight; // Sözlü notunun ağırlığı

    public Course(String name, String code, String prefix, Teacher teacher, double verbalWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.verbalWeight = verbalWeight;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void printTeacher() {
        System.out.println("Teacher: " + this.teacher);
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getNote() {
        return note;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getPrefix() {
        return prefix;
    }

    public double getVerbalWeight() {
        return verbalWeight;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.code + " (" + this.prefix + ")";
    }
}
