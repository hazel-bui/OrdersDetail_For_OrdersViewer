package com.example.models;

import java.util.ArrayList;

public class ListPaymentMethod {
    ArrayList<PaymentMethod> paymentMethods;
    public ListPaymentMethod()
    {
        paymentMethods = new ArrayList<>();
    }

    public ArrayList<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(ArrayList<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void addPaymentMethod(PaymentMethod pm) {
        paymentMethods.add(pm);
    }
    public void gen_product_dataset() {
        paymentMethods.add(new PaymentMethod(1, "Banking Account", "Payment via bank account"));
        paymentMethods.add(new PaymentMethod(2, "MOMO", "Payment via MOMO"));
        paymentMethods.add(new PaymentMethod(3, "Cash", "Payment via cash"));
        paymentMethods.add(new PaymentMethod(4, "COD", "Cash on delivery"));
    }
}
