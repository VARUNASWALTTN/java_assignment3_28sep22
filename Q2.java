class Q2 {
    void implement(){
        myInterface1 mi1 = new Q2()::add;
        myInterface1 mi2 = new Q2()::substract;
        myInterface1 mi3 = new Q2()::multiply;
        System.out.println("Addition is : " + mi1.perform(4,2));
        System.out.println("Subtraction is : " + mi2.perform(4,2));
        System.out.println("Multiplication is : " + mi3.perform(4,2));

    }
    Integer add(int a,int b){
        return a+b;
    }
    Integer substract(int a,int b){
        return a-b;
    }
    Integer multiply(int a, int b){
        return a*b;
    }
}
interface myInterface1{
    Integer perform(int a,int b);
}