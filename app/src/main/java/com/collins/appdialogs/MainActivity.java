package com.collins.appdialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void buttonA(View view)
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Confirm Your Results");
        dialog.setMessage("Confirm that all data is correct before sending");
        dialog.setPositiveButton("confirm", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity.this, "Confirmed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("cancel", null);
        dialog.create().show();
    }



    public void buttonB(View view)
    {
        Dialog x = new Dialog(this);
        x.setContentView(R.layout.dialog_layout);
        x.show();
    }


    public void submit(View view)
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Confirmation");
        dialog.setMessage("we will send you a confirmation mail");
        dialog.setPositiveButton("confirm", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Dialog x = new Dialog(MainActivity.this);
                x.setContentView(R.layout.smile_layout);
                x.show();
                Toast.makeText(MainActivity.this, "mail sent", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity.this, "unable to sign up", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.create().show();
    }
}
