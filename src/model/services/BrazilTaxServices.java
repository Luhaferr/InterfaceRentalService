package model.services;

public class BrazilTaxServices {
    public double tax(double amout) {
        if (amout <= 100.00) {
            return amout * 0.2;
        }
        else {
            return amout * 0.15;
        }
    }
}
