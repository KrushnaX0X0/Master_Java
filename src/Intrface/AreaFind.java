package Intrface;

// Interface
interface Sheap {
    int base = 10;
    int height = 8;
    float radius = 5f;
    float pi = 3.14f;
    void area();
}

// Triangle class
class Triang implements Sheap {
    @Override
    public void area() {
        int area = (Sheap.base * Sheap.height) / 2;
        System.out.println("Area of Triangle : " + area);
    }
}

// Rectangle class
class Rectang implements Sheap {
    @Override
    public void area() {
        int area = Sheap.base * Sheap.height;
        System.out.println("Area of Rectangle : " + area);
    }
}

// Circle class
class Circ implements Sheap {
    @Override
    public void area() {
        float area =Sheap.pi *Sheap.radius *Sheap.radius;
        System.out.println("Area of Circle : " + area);
    }
}

// Main class
public class AreaFind {
    public static void main(String[] args) {

    	Triang t = new Triang();
    	Rectang r = new Rectang();
        Circ c = new Circ();

        t.area();
        r.area();
        c.area();
    }
}
