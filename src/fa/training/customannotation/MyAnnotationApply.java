package fa.training.customannotation;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 13:20
*   description: Show how to apply MyAnnotation
*   update:
*           - nhattruongNeoVim(31/10/2023 13:20)
*
*/

public class MyAnnotationApply {
    @MyAnnotation(value = 100)
    public void greeting(){
        System.out.println("Greeting() from MyAnnotationApply");
    }
}
