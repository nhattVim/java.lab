package fa.training.customannotation.test;

import fa.training.customannotation.MyAnnotation;
import fa.training.customannotation.MyAnnotationApply;

import java.lang.reflect.Method;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 13:21
*   description:
*   update:
*           - nhattruongNeoVim(31/10/2023 13:22)
*
*/

public class TestMyAnnotation {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        MyAnnotationApply myAnnotationApply = new MyAnnotationApply();
        Method method = myAnnotationApply.getClass().getMethod("greeting");
        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("value:::"  + myAnnotation.value());
    }
}
