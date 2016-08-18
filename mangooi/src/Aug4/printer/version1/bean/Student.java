package Aug4.printer.version1.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class Student {
    public Student(Lesson lesson, String name,int score) {
        this.lesson = lesson;
        this.name = name;
        lesson.setScore(score);
    }
    Lesson lesson;
    String name;

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name+"学生"+lesson;
    }
}
