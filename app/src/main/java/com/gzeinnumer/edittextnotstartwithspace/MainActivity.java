package com.gzeinnumer.edittextnotstartwithspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.gzeinnumer.edittextnotstartwithspace.utils.TextWatcherNoSpaceAtFirst;

public class MainActivity extends AppCompatActivity {

    EditText ed ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.ed);

        ed.addTextChangedListener(new TextWatcherNoSpaceAtFirst(ed));
    }
}