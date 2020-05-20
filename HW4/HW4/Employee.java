public class Employee {
    private String fio;
    private String position;
    private String email;
    private long phone_num;
    private int salary;
    private int age;
    public Employee(String fio, String position, String email, long phone_num, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone_num = phone_num;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("ФИО сотрудника: " + fio + ", должность: " + position + ", эл.адрс: " + email + ", номер телефона: " + phone_num  + ", ЗП: " + salary + ", Возраст: " + age);
    }

}
