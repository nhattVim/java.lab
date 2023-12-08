package fa.training.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 13:30
*   description:
*   update:
*           - nhattruongNeoVim(31/10/2023 13:30)
*
*/

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyMarker {

}