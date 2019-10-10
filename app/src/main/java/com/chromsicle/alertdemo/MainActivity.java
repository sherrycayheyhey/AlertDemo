package com.chromsicle.alertdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("You really wanna do this?")
                .setMessage("For real?")
                .setPositiveButton("yeah", new DialogInterface.OnClickListener() { //do something when clicked
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "okay, you did it....", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("nah, dawg", null) //does nothing, close dialog box and move forward
                .show();
    }
}
