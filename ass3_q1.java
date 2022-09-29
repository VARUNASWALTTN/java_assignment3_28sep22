import java.util.*;
class Solve1{
    public static void ass_q1(String[] args){
        List<Float> l = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        ListIterator<Float>l_it=l.listIterator();

        for(int i=0;i<5;i++){
            Float n = sc.nextFloat();
            l_it.add(n);
        }

        float sum=0;
        for(int i=0 ;i<l.size();i++){
            sum+= l.get(i);
        }
        System.out.println(sum);
    }

}
