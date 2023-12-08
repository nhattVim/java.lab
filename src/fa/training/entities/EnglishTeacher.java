package fa.training.entities;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 10:33
*   description: 
*   update:
*           - nhattruongNeoVim(31/10/2023 10:33)
*
*/

public class EnglishTeacher extends Teacher implements Actionable{
    private String mainSubject;

    public EnglishTeacher() {
    }

    public EnglishTeacher(String designation, String collegeName, String mainSubject){
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }

    public String getMainSubject(){
        return mainSubject;
    }

    public void setMainSubject(String mainSubject){
        this.mainSubject = mainSubject;
    }

    @Override
    public void teach(){
        System.out.println("Teaching English subject ");
    }

    @Override
    public void toSchool(){
        System.out.println("English teacher go to school by motorbike");
    }

    public String translate(String en, String vi){
        return en + " in Vietnamese " + vi;
    }

    @Override
    public String toString(){
        return "EnglishTeacher [mainSubject = " + mainSubject + ", getDesignation()=" + getDesignation() + ", getCollegeName()=" + getCollegeName() + "]";
    }

}