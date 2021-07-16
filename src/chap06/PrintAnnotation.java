package chap06;

public @interface PrintAnnotation {

    String value() default "-";
    int number() default 15;
}
