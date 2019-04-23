import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
   String str();
   int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface what{
   String description();
}

@MyAnno(str ="AnnotationBasics Class", val = 621315)
@what(description = "An annotation test example")
public class AnnotationBasics{


   @MyAnno(str ="Annotation Example ", val =841655)
   @what(description = "An annotation test method.")
   public static void myMeth() {//this annotation annotates the myMeth() method
       AnnotationBasics annotationBasics = new AnnotationBasics();
       try {

           Annotation annotation[] = annotationBasics.getClass().getAnnotations();
           //class<?> c = annotationBasics.getClass();
           //Method method = c.getMethod("myMeth");

           //MyAnno myAnn = method.getAnnotation(MyAnno.class);
           System.out.println("\nAll annotations for AnnotationBasics class.");

           for(Annotation annotation1 : annotation){
               System.out.println(annotation1);
           }
           Method method = annotationBasics.getClass().getMethod("myMeth");
           annotation = method.getAnnotations();


           System.out.println("\nPrinting all annotations for myMeth().");
           for(Annotation annotation1 : annotation){
               System.out.println(annotation1);
           }


       }catch (NoSuchMethodException e){
           System.out.println("Method not found.");
       }

   }
   public static void main(String args[]){
       myMeth();
   }


}
