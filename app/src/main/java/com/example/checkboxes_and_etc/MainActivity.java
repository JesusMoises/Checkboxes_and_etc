package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //creamos nuestras variables de tipo checkbox
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    //creamos un string con el nombre que llevará al principo nuestro toast
    private String mensajeToast = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asignamos los valores que tienen nuestros checbox
        checkBox1 = findViewById(R.id.chocolate_syrup);
        checkBox2 = findViewById(R.id.sprinkles);
        checkBox3 = findViewById(R.id.nuts);
        checkBox4 = findViewById(R.id.cherries);
        checkBox5 = findViewById(R.id.orio);
    }

    public void onShowToast(View view) {

        if(checkBox1.isChecked()){
            mensajeToast = mensajeToast + checkBox1.getText();
        }if(checkBox2.isChecked()){
            mensajeToast = mensajeToast + checkBox2.getText();
        }if(checkBox3.isChecked()){
            mensajeToast = mensajeToast + checkBox3.getText();
        }if(checkBox4.isChecked()){
            mensajeToast = mensajeToast + checkBox4.getText();
        }if(checkBox5.isChecked()){
            mensajeToast = mensajeToast + checkBox5.getText();
        }

        Toast toast = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        toast.show();
    }
    

}