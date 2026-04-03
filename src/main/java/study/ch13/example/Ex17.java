package study.ch13.example;

interface Printable {
    abstract void print();
}

interface Scannable {
    abstract void scan();
}

interface Faxable {
    abstract void fax();
}

class AllIneOnePrinter implements Printable, Scannable, Faxable {
    @Override
    public void fax() {
        System.out.println("전송 완료!");
    }

    @Override
    public void print() {
        System.out.println("출력 완료!");
    }

    @Override
    public void scan() {
        System.out.println("스캔 완료!");
    }
}

public class Ex17 {
    public static void main(String[] args) {
        AllIneOnePrinter printer = new AllIneOnePrinter();
        printer.scan();
        printer.print();
        printer.fax();
    }
}
