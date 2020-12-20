package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
    }
    public void OnAddressesClick(View v)
    {
       Intent intent = new Intent(this, AddressesActivity.class);
       startActivity(intent);
    }
    public void OnCoursesClick(View v)
    {
        Intent intent = new Intent(this, CoursesActivity.class);
        startActivity(intent);
    }
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(StartActivity.this);
        builder.setTitle("Авторизация")
                .setMessage("я не знаю как сюда добавить ввод текста кнопочки выше работают")
                .setIcon(R.drawable.icon_dollar)
                .setCancelable(false)
                .setNegativeButton("Войти",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}