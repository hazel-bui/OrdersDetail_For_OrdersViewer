package com.example.k22411csampleproject;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.adapters.PaymentMethodAdapter;
import com.example.connectors.PaymentMethodConnector;
import com.example.connectors.SQLiteConnector;
import com.example.models.ListCustomer;
import com.example.models.ListPaymentMethod;

public class PaymentMethodActivity extends AppCompatActivity {

    ListView lvPaymentMethod;
    PaymentMethodAdapter adapter;
    ListPaymentMethod lpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_payment_method);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addView();
    }

    private void addView() {
        lvPaymentMethod=findViewById(R.id.lvPaymentMethod);
        adapter=new PaymentMethodAdapter(PaymentMethodActivity.this,R.layout.item_payment_method);
        lvPaymentMethod.setAdapter(adapter);
        /*lpm=new ListPaymentMethod();
        lpm.gen_product_dataset();
        adapter.addAll(lpm.getPaymentMethods());
        adapter.addAll(lpm.getPaymentMethods());*/
        SQLiteConnector connector = new SQLiteConnector(this);
        SQLiteDatabase db = connector.openDatabase(); // Mở DB như thường lệ

        PaymentMethodConnector pmConnector = new PaymentMethodConnector();
        lpm = pmConnector.getAllPaymentMethods(db);   // Lấy dữ liệu từ DB

        adapter.addAll(lpm.getPaymentMethods());      // Đẩy dữ liệu vào adapter
    }
}