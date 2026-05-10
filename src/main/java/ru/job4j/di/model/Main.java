package ru.job4j.di.model;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(ConsoleInput.class);
        StartUI ui = context.get(StartUI.class);
        ConsoleInput input = context.get(ConsoleInput.class);
        input.askStr("How old are you?");
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
