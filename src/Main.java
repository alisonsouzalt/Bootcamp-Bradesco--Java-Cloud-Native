import abstracaoEncap.Person;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var male = new Person("Alison");
        male.getAge();

        System.out.println("Nome " + male.getName() + " - Idade " + male.getAge());
    }
}