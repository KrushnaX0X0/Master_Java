package Object;

public class ArrayofObj {
    
    String name;
    int age;
    int roll;

    void setvalue(String st, int a, int r) {
        this.name = st;
        this.age = a;
        this.roll = r;
    }

    void display() {
        System.out.println("Hello I am " + name + " my age is : " + age  + " and My roll number is :" + roll);
    }

    public static void main(String[] args) {
        
        ArrayofObj obj[] = new ArrayofObj[3];

        // initialize objects
        obj[0] = new ArrayofObj();
        obj[1] = new ArrayofObj();
        obj[2] = new ArrayofObj();

        obj[0].setvalue("krushna", 20, 21);
        obj[1].setvalue("vaibhav", 20, 26);
        obj[2].setvalue("prthmesh", 22, 23);

        for(int i = 0; i < 3; i++) {
            obj[i].display();
        }
    }
}
