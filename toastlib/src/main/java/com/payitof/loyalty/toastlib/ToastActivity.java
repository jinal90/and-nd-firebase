package com.payitof.loyalty.toastlib;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {


    private void showToast(String toastMessage){
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
    }

}
