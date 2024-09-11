package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText1;
    private EditText editText2;
    private TextView textView;
    private TextView textView3;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.editTextNumberDecimal4);
        editText2 = findViewById(R.id.editTextNumberDecimal2);
        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editText1.getText().toString();
                String s2 = editText2.getText().toString();
                if (s1.isEmpty() || s2.isEmpty())
                    Toast.makeText(MainActivity.this, "Enter the numbers !!", Toast.LENGTH_SHORT).show();
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                int op = i1 + i2 ;
                textView.setText("\n\n\nThe sum is :"+op);
            }

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}