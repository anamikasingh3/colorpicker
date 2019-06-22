package com.example.shapemyappcolor;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.azeesoft.lib.colorpicker.ColorPickerDialog;

public class next extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        ColorPickerDialog colorPickerDialog= ColorPickerDialog.createColorPickerDialog(this);

        colorPickerDialog.setOnColorPickedListener(new ColorPickerDialog.OnColorPickedListener() {
            @Override
            public void onColorPicked(int color, String hexVal) {
                System.out.println("Got color: " + color);
                System.out.println("Got color in hex form: " + hexVal);
                Intent intent = new Intent(next.this,picked.class);
                intent.putExtra("color",color);
                intent.putExtra("hex",hexVal);
                startActivity(intent);


                // Make use of the picked color here
            }
        });
        colorPickerDialog.show();

        colorPickerDialog.setHexaDecimalTextColor(Color.parseColor("#ffffff")); //There are many functions like this
        colorPickerDialog.show();

    }
}