public class Person {
    private static Object Person;
    private String fio;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;


    public Person(String fio, String position, String email, String tel, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }


    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "директор", "ivanov_ii@company.com", "+7(999)111-22-33", 500000, 41);
        persArray[1] = new Person("Петров Петр Петрович", "зам. директора", "petrov_pp@company.com", "+7(999)111-22-34", 200000, 38);
        persArray[2] = new Person("Сидорова Наталья Ивановна", "секретарь", "sidorova_ni@company.com", "+7(999)111-21-21", 50000, 25);
        persArray[3] = new Person("Цукерман Роза Иосифовна", "главный бухгалтер", "zucerman_ri@company.com", "+7(999)666-00-00", 150000, 45);
        persArray[4] = new Person("Пупкин Василий Иванович", "разработчик", "pupkin_vi@company.com", "+7(926)987-65-43", 150000, 30);
        for (int i = 0; i<5; i++){
           System.out.println(persArray[i].fio + " " + persArray[i].position + " " + persArray[i].email + " " + persArray[i].tel + " " + persArray[i].salary + " " + persArray[i].age);
           //if(persArray[i].age > 40)  {System.out.println(persArray[i].fio + " " + persArray[i].position + " " + persArray[i].email + " " + persArray[i].tel + " " + persArray[i].salary + " " + persArray[i].age);}
        }


    }




}
