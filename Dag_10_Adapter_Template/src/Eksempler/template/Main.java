package Eksempler.template;


import Eksempler.template.payments.Employee;
import Eksempler.template.payments.PublicEmployee;
import Eksempler.template.payments.WoltEmployee;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new PublicEmployee(60_000),
                new PublicEmployee(120_000),
                new WoltEmployee(40_000));

        employees
                .stream()
                .map(em -> em.calculateNetSalary())
                .forEach(System.out::println);

    }
}

