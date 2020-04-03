package structural.adapter.adapter;

import structural.adapter.Printer;

import java.util.List;

public class InheritedPrinterAdapter extends Printer implements ListPrinter {
    @Override
    public void print(List<String> strings) {
        strings.forEach(super::print);
    }
}
