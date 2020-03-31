import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test {
    @Test
    void equiangularTriangle(){
        TriangleClass triangleClass = new TriangleClass(2,2,2);
        String triangleCheck = triangleClass.equiangularTriangle();
        String expected = "tam giác đều";
        assertEquals(expected,triangleCheck);
    }
    @Test
    void isoscelesTriangle(){
        TriangleClass triangleClass = new TriangleClass(2,2,3);
        String triangleCheck = triangleClass.isoscelesTriangle();
        String expected = "tam giác cân";
        assertEquals(expected,triangleCheck);
    }
    @Test
    void scaleneTriangle(){
        TriangleClass triangleClass = new TriangleClass(3,4,5);
        String triangleCheck = triangleClass.scaleneTriangle();
        String expected = "tam giác thường";
        assertEquals(expected,triangleCheck);
    }
    @Test
    void scaleneTriangle1(){
        TriangleClass triangleClass = new TriangleClass(8,2,3);
        String triangleCheck = triangleClass.scaleneTriangle();
        String expected = "không phải tam giác ";
        assertEquals(expected,triangleCheck);
    }
    @Test
    void scaleneTriangle2(){
        TriangleClass triangleClass = new TriangleClass(-1,2,1);
        String triangleCheck = triangleClass.scaleneTriangle();
        String expected = "không phải tam giác";
        assertEquals(expected,triangleCheck);
    }
    @Test
    void scaleneTriangle3(){
        TriangleClass triangleClass = new TriangleClass(0,1,1);
        String triangleCheck = triangleClass.scaleneTriangle();
        String expected = "không phải tam giác";
        assertEquals(expected,triangleCheck);
    }
}
