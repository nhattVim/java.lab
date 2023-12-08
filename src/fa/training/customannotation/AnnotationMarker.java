package fa.training.customannotation;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 13:32
*   description:
*   update:
*           - nhattruongNeoVim(31/10/2023 13:32)
*
*/

public class AnnotationMarker {
    public void method1() {
        System.out.println("this is method 1");
    }

    @MyMarker
    public void method2() {
        System.out.println("this is method 2");
    }

    public void method3() {
        System.out.println("this is method 3");
    }

    @MyMarker
    public void method4() {
        System.out.println("this is method 4");
    }
}
