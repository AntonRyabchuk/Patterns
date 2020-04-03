package structural.adapter;

import structural.adapter.adapter.CompositionPrinterAdapter;
import structural.adapter.adapter.InheritedPrinterAdapter;
import structural.adapter.adapter.ListPrinter;

import java.util.LinkedList;
import java.util.List;

/**
 * Помогает подружить интерфейсы
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        ListPrinter listPrinter1 = new CompositionPrinterAdapter();
        listPrinter1.print(list);

        ListPrinter listPrinter2 = new InheritedPrinterAdapter();
        listPrinter2.print(list);
    }
}
