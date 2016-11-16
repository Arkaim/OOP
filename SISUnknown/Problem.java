import java.util.*;

public class Problem implements GPACalculate {
    
    private static Problem instance = null;
    private ID = "0"
    private double GPA;

    private Problem (double GPA) {
        this.GPA = GPA;
        super (ID);
    }
    
    public static Problem getInstance() {
        if(instance == null) {
            instance = new Problem ();
        }
        return instance;
    }
}

    getGPA(double a, double b){
    double answ = a + b;
    answ = answ / 2;
    return answ;

    }

    
}
