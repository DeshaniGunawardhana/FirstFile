/**
 * Created by Deshani on 3/2/2017.
 */
public class FirstFile {
    public static void main(String[] args){
        FirstFile file = new FirstFile();
        Person p1= new Person();
        Person p2= new Person();
        p1.setName("Peter");
        p1.setEmail("peter@gmail.com");
        System.out.println(p1);
        System.out.println(file.saveperson(p1));
    }
    public Person saveperson(Person p1){
        if(p1==null){
            throw new IllegalArgumentException();
        }else{
            p1.setId("p100");
            return p1;
        }
    }
}
