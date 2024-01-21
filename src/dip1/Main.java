package dip1;

import dip1.model.Report;
import dip1.model.ReportManager;
import dip1.model.util.ConsoleReporter;
import dip1.model.util.PrinterReporter;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();

        ReportManager reportManager = new ReportManager(new ConsoleReporter());
        reportManager.output(report.getItems());

//        ReportManager reportManager = new ReportManager(new PrinterReporter());
//        reportManager.output(report.getItems());

    }
}
/*
* Был нарушен "Принцип инверсии зависимостей". Были добавлены класс ReportManager и интерфейс Reportable.
* Интерфейс Reportable был имплементирован в PrintReporter и ConsoleReporter. В ReportManager метод output()
* вызывается через абстракцию, которая реализует метод в зависимости через экземпляр какого класса был создан
* ReportManager.
* */
