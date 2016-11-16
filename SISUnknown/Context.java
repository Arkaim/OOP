import java.util.*;

class Context {
    
    private GPACalculate gpacalculate;

    public Context() {
    }
    
    public void setGPACalculate(GPACalculate gpacalculate) {
        this.gpacalculate = gpacalculate;
    }
    
    public int executeCalculate() {
        return gpacalculate.getGPA();
    }
}


