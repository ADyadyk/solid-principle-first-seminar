package dip1.model;

import dip1.model.util.PrinterReporter;
import dip1.model.util.Reportable;

import java.util.List;

public class ReportManager {
    Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void output(List<ReportItem> items){
        reportable.output(items);
    }
}
