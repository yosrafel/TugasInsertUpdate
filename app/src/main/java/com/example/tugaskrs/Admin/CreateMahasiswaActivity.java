package com.example.tugaskrs.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaskrs.R;

public class CreateMahasiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mahasiswa);
        this.setTitle("SI KRS - Hai Admin");

        Button btnSimpanKrs = (Button)findViewById(R.id.btnSimpanDosen);
        btnSimpanKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateMahasiswaActivity.this, HomeAdmin.class);
                startActivity(intent);
            }
        });
    }
}
