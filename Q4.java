import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String fullname,last_name,city;
    long salary;
    public Employee(String fullname,String city,long salary){
        this.fullname = fullname;

        this.last_name = last_name;
        this.city = city;
        this.salary = salary;
    }
}
class Q4 {
    void implement(){
        List<Integer> lst = new ArrayList<Integer>();
        for(int i=1;i<50;i++){
            lst.add(i);
        }
        lst.stream()
                .filter((a) -> a % 2 == 0)
                .forEach(System.out::println);

        Employee[] employees = {
                new Employee("Varun Aswal","Delhi",4000),
                new Employee("Shivam Kumar","Noida",3000),
                new Employee("Manvendra Pratap Singh","Delhi",4500),
                new Employee("Utkarsh Chaturvedi","Delhi",5000),
        };

        List<Employee> list = Arrays.asList(employees);
        List<Employee> l = list.stream()
                .filter((e) -> (e.salary<5000 && e.city=="Delhi"))
                .collect(Collectors.toList());

        List<String> ans = new ArrayList<String>();
        for(Employee i:l){
            ans.add(i.fullname);
        }
        ans = ans.stream()
                .distinct()
                .collect(Collectors.toList());
        for (String s:ans){
            if(!s.equals(" ")) {
                System.out.println(s);
            }
        }

    }
}