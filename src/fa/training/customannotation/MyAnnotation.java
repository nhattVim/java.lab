package fa.training.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 13:17
*   description: Create a custom annotation
*   update:
*           - nhattruongNeoVim(31/10/2023 13:17)
*
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    int value();
}