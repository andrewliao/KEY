public class Person implements Comparable<Person>{
private String name;
private int age;
private double weight;
    public Person(String name, int age, double weight){
       this.name=name;
       this.age=age;
       this.weight=weight;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;  
    }
    public double getWeight(){
        return this.weight;
    }
    public String toString(){
        return "{" + name +  ", " + age + ", " + weight + "}";   
    }
    public int compareTo(Person list) {
        if (getName().compareTo(list.getName()) == 0) {
            if (this.age == list.age) {
                if (this.weight == list.weight) {
                    return 0;
                }
                else if (this.weight < list.weight) {
                    return -1;
                }
                else {
                    return 1;
                }
            }  
            

            else if (this.age < list.age) {
                return -1;
            }
            else {
                return 1;
            }
        }
            else if (getName().compareTo(list.getName()) < 0) {
                return -1;
            }
            else {
                return 1;
        }
    }

}