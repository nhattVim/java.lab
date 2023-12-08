package fa.training.customannotation.test;

import fa.training.customannotation.AnnotationMarker;
import fa.training.customannotation.MyMarker;

import java.lang.reflect.Method;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 13:33
*   description:
*   update:
*           - nhattruongNeoVim(31/10/2023 13:33)
*
*/

public class TestAnnotationReflection {
    public static void main(String[] args) {
        AnnotationMarker runner = new AnnotationMarker();
        Method[] methods = runner.getClass().getDeclaredMethods();

        for (Method method : methods) {
            MyMarker myMarker = method.getAnnotation(MyMarker.class);
            if (myMarker != null) {
                try {
                    method.invoke(runner);
                } catch (Exception  e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
