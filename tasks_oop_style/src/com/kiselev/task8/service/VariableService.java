package com.kiselev.task8.service;

import com.kiselev.task8.entity.Variable;

public class VariableService {
    public double function(Variable variable) {
        if (variable.getX() >= 3) {
            return -Math.pow(variable.getX(),2) + 3*variable.getX() + 9;
        } else {
            return 1/(Math.pow(variable.getX(), 3) - 6);
        }
    }
}
