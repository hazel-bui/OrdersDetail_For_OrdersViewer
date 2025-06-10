package com.example.k22411csampleproject;


import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.connectors.OrdersViewerConnector;
import com.example.connectors.SQLiteConnector;
import com.example.models.OrdersViewer;

public class OrdersDetailActivity extends AppCompatActivity {
    TextView txtOrderCode, txtOrderDate, txtEmployeeName, txtCustomerName, txtTotalOrderValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orders_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtOrderCode = findViewById(R.id.txtOrderCode);
        txtOrderDate = findViewById(R.id.txtOrderDate);
        txtEmployeeName = findViewById(R.id.txtEmployeeName);
        txtCustomerName = findViewById(R.id.txtCustomerName);
        txtTotalOrderValue = findViewById(R.id.txtTotalOrderValue);

        // Nhận dữ liệu từ intent
        String code = getIntent().getStringExtra("code");
        String orderDate = getIntent().getStringExtra("orderDate");
        String employee = getIntent().getStringExtra("employee");
        String customer = getIntent().getStringExtra("customer");
        double totalValue = getIntent().getDoubleExtra("totalValue", 0.0);

        // Hiển thị dữ liệu
        txtOrderCode.setText(code);
        txtOrderDate.setText(orderDate);
        txtEmployeeName.setText(employee);
        txtCustomerName.setText(customer);
        txtTotalOrderValue.setText(totalValue + " VND");
    }
}