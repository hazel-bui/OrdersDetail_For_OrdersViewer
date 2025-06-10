package com.example.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.k22411csampleproject.R;
import com.example.models.Product;

public class ProductAdapter extends ArrayAdapter<Product> {
    Activity context;
    int resource;
    public ProductAdapter(@NonNull Activity context, int resource)
    {
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        //nhan ban giao dien theo tung vi tri position ma du lieu duoc duyet qua:
        View item=inflater.inflate(this.resource, null);
        //Luc nay: Toan bo view nam trong layout resource(item_advanced_product)
        //Tuc la item la Tong tai view
        //Nhu vay muon truy suat toi cac view con trong no thi phai thong qua cac bien item
        ImageView imgProduct=item.findViewById(R.id.imgProduct);
        TextView txtProductID=item.findViewById(R.id.txtProductID);
        TextView txtProductName=item.findViewById(R.id.txtProductName);
        TextView txtProductQuantity=item.findViewById(R.id.txtProductQuantity);
        TextView txtProductPrice=item.findViewById(R.id.txtProductPrice);
        ImageView imgCart=item.findViewById(R.id.imgCart);

        //Lay mo hinh doi tuong dang duoc nhan ban o vi tri position (doi so 1):
        Product p= getItem(position);
        //Rai du lieu cua Product len giao dien torng item:
        imgProduct.setImageResource(p.getImage_id());
        txtProductID.setText(p.getId()+"");
        txtProductName.setText(p.getName());
        txtProductQuantity.setText(p.getQuantity()+"");
        txtProductPrice.setText(p.getPrice()+"(VND)");
        //Xu ly bam vao nut mua...tinh sau...

        return item;
    }
}
