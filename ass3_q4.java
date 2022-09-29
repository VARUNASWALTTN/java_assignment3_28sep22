import java.util.HashMap;
import java.util.Map;

class Employee1{
    String name,designation;
    int age,salary;
    public Employee1(String n,String d,int a){
        this.designation = d;
        this.age = a;
        this.name = n;
    }
    public int setSalary(int s){
        this.salary = s;
        return s;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getDesignation(){
        return this.designation;
    }
}
public class ass2_q4{
    public static void main(String[] args){
        Employee1 e1 = new Employee1("VARUN1","se",29);
        Employee1 e2 = new Employee1("VARUN2","qe",21);
        Employee1 e3 = new Employee1("VARUN3","jvm",24);
        Employee1 e4 = new Employee1("VARUN4","dev",28);
        Map<Employee1,Integer> mp = new HashMap<Employee1, Integer>();
        mp.put(e1, e1.setSalary(35000));
        mp.put(e2, e2.setSalary(30000));
        mp.put(e3, e3.setSalary(35000));
        mp.put(e4, e4.setSalary(36000));
        for(Employee1 emp: mp.keySet()){
            System.out.println(emp.getName()+"("+emp.designation+"-"+emp.getAge()+") "+mp.get(emp));
        }
    }
}