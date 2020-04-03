package structural.adapter.adapter;

import structural.adapter.Printer;

import java.util.List;

public class CompositionPrinterAdapter implements ListPrinter {

    private Printer printer = new Printer();

    @Override
    public void print(List<String> strings) {
        strings.forEach(this.printer::print);
    }
}
