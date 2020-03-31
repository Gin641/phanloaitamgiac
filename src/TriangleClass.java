public class TriangleClass implements Triangle {
    private int size1;
    private int size2;
    private int size3;
    static private String result = "";
    public TriangleClass(int size1, int size2, int size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    @Override
    public String equiangularTriangle(){
        if(size1 == size2 && size1 == size3){
            result = "tam giác đều";
        }
        return result;
    }
    @Override
    public String isoscelesTriangle(){
        if (size1 == size2 || size1 == size3){
            result = "tam giác cân";
        }
        return result;
    }
    @Override
    public String scaleneTriangle(){
        if (size1 + size2 > size3 && size1 + size3 > size2 && size2 + size3 > size1){
            result = "không phải tam giác";
        }
        return result;
    }
}
