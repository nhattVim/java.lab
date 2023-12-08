package fa.training.entities;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 10:34
*   description:
*   update:
*           - nhattruongNeoVim(31/10/2023 10:34)
*
*/

public class MathTeacher extends Teacher implements Actionable{
    protected String mainSubject;

    public MathTeacher() {
    }

    public MathTeacher(String designation, String collegeName, String mainSubject) {
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    /*
     *   The method return sum of two number
     *
     *   @param number1
     *   @param number2
     *   @return an integer value
     *
     * */

    public int sum(int number1, int number2){
        return (number1 + number2);
    }

    @Override
    public void toSchool(){
        System.out.println("Math teacher go to school by car!");
    }

    @Override
    public void teach(){
        System.out.print("Teaching math subject!");
    }

    @Override
    public String toString(){
        return "MathTeacher [mainSubject = " + mainSubject + ", designation = " + designation + ", collegeName = " + collegeName + "]";
    }
}