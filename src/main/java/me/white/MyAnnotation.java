package me.white;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //메모리에 올라갈때 어노테이션은 올라가지 않는데 runtime 까지 어노테이션 유지하고 싶을때 사용
@Target({ElementType.TYPE, ElementType.FIELD}) // ElementType.FIELD 필드(전역변수)에만 어노테이션 사용가능하게 설정
@Inherited
public @interface MyAnnotation {

    // 어노테이션 기본값 설정
    String name() default "zzzz";
    int number() default 100;
    String value() default "aaaaa";
}
