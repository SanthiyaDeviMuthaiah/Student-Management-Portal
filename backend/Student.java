public class Student extends Person {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String course;

    public Student(int id,String name, String email, String phone,String course){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.course=course;
    }
    public int getId(){
        return id;
    }

    @Override
    void display(){
        System.out.println(id+" "+name+" "+email+" "+phone+" "+course);
    }
    }
