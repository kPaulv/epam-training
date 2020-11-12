package com.kiselev.task8.main;

import com.kiselev.task8.entity.Variable;
import com.kiselev.task8.report.VariableReport;
import com.kiselev.task8.service.VariableService;

public class MainTask8 {
    public static void main(String[] args) {
        Variable variable = new Variable(5);
        VariableService service = new VariableService();
        double res = service.function(variable);
        VariableReport report = new VariableReport();
        report.functionValue(res);
    }
}
