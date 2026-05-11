package ru.job4j.di.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(StartUI.class);
        context.register(ConsoleInput.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ConsoleInput consoleInput = context.getBean(ConsoleInput.class);
        consoleInput.askStr("How old are you ?");
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
