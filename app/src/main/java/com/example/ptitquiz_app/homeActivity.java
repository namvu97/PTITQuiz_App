package com.example.ptitquiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class homeActivity extends AppCompatActivity {
    GridView gvHinhAnh;
    ArrayList<image> arrayImage;
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        Anhxa();
        adapter = new HinhAnhAdapter(this,R.layout.line_image,arrayImage);
        gvHinhAnh.setAdapter(adapter);
    }

    private void Anhxa() {
        gvHinhAnh = (GridView) findViewById(R.id.gridviewHinhAnh);
        arrayImage = new ArrayList<>();
        arrayImage.add(new image("Hình số 1", R.drawable.xstk));
        arrayImage.add(new image("Hình số 2", R.drawable.atbm));
        arrayImage.add(new image("Hình số 3", R.drawable.ltw));
        arrayImage.add(new image("Hình số 4", R.drawable.mmt));
        arrayImage.add(new image("Hình số 5", R.drawable.wul));
        arrayImage.add(new image("Hình số 6", R.drawable.qldapm));

    }
}
