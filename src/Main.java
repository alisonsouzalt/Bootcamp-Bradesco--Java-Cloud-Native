import abstracaoEncap.Person;
import records.PersonR;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var person = new PersonR("Alison", 31);

        System.out.println(person.name() + person.age());
    }
}