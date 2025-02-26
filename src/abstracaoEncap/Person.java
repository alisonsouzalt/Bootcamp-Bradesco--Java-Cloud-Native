package abstracaoEncap;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Person {

    private final String name;
    private int age;

    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void incAge(){
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age +=1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
