
class Q5 implements myInterface2{
    public void perform(){
        System.out.println("Overriding the default method of interface");
    }
    void implement(){
        Q5 ques5 = new Q5();
        ques5.perform();
    }

}
interface myInterface2{
    default void perform(){
        System.out.println("Default method inside interface");
    }

}