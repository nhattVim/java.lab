package fa.training.entities;

/**
 * author: nhattruongNeoVim
 * since: 04/10/2023 14:47
 * description:
 * update:
 * - nhattruongNeoVim(04/10/2023 14:48)
 */

public abstract class Teacher {
    public String designation;
    public String collegeName;

    public Teacher() {
    }

    public Teacher(String designation, String collegeName) {
        super();
        this.designation = designation;
        this.collegeName = collegeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public abstract void teach();

    public void teach(int duration) {
        System.out.println("Teaching in " + duration + "minutes");
    }
}