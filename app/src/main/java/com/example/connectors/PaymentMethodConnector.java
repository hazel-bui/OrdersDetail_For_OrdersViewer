package com.example.connectors;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.models.ListPaymentMethod;
import com.example.models.PaymentMethod;

public class PaymentMethodConnector {

    public ListPaymentMethod getAllPaymentMethods(SQLiteDatabase database) {
        ListPaymentMethod listPaymentMethod = new ListPaymentMethod();

        Cursor cursor = database.rawQuery("SELECT * FROM PaymentMethod", null);
        while (cursor.moveToNext()) {
            int Id = cursor.getInt(0);
            String Name = cursor.getString(1);
            String Description = cursor.getString(2);

            PaymentMethod pm = new PaymentMethod();
            pm.setId(Id);
            pm.setName(Name);
            pm.setDescription(Description);

            listPaymentMethod.addPaymentMethod(pm);
        }

        cursor.close();
        return listPaymentMethod;
    }
}
