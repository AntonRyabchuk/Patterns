package structural.decorator;

/**
 * Другое название – Обертка (Wrapper)
 * Расширение функционала объекта без дочерних классов (альтернатива наследованию)
 * Более гибкий способ добавить новый функционал к любому существующему объекту
 * Возможность включения и исключения нового поведения для любого объекта в любое
 * время (в отличие от статичного способа с помощью наследования)
 * Когда нельзя создать дочерний класс, но нужно добавить новое поведение, которое
 * может быть не связано по смыслу (в наследовании желательно поддерживать связь «является»)
 * Декораторы могут вкладываться друг в друга
 */
public class Main {
    public static void main(String[] args) {
        Developer developer1 = new JavaDeveloper();
        System.out.println(developer1.makeJob());

        Developer developer2 = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developer2.makeJob());

        Developer developer3 = new TeamLead(new JavaDeveloper());
        System.out.println(developer3.makeJob());

        Developer developer4 = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer4.makeJob());
    }
}
