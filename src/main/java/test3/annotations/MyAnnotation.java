package test3.annotations;

import java.lang.annotation.Annotation;

@Improvement(id = 1, synopsis = "this has to be improved")
public class MyAnnotation {

}

class TestAnnotation {
    public static void main(String[] args) {
        MyAnnotation myAnnotation = new MyAnnotation();
        Class c = myAnnotation.getClass();
        Annotation an = c.getAnnotation(Improvement.class);
        Improvement improvement = (Improvement) an;
        System.out.println(improvement.id());
        System.out.println(improvement.synopsis());
        System.out.println(improvement.engineer());
        System.out.println(improvement.date());
    }
}