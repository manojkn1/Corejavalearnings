package p1;

public class VariableExamples {
    int i=10;
    static int j=20;

    public static void main(String[] args) {
        VariableExamples a1=new VariableExamples();
        VariableExamples a2=new VariableExamples();
        System.out.println(a1.i); // here a1.i contains value 10
        System.out.println(a2.i); //here a2.i contains value 10
        a2.i=100;                 //here a2.i become 100 & 10 will be removed. and also a1.i still holds value 10 because it's diffrent object
        System.out.println(VariableExamples.j); //here VariableExamples.j contains value 20
        VariableExamples.j=1000; //here VariableExamples.j becomes 1000; since static value copy is only one 20 will be replaced with 1000 in metaspace
        System.out.println(VariableExamples.j);


    }


}
