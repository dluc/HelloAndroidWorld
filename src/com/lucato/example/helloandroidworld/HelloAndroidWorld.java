/**
 * Hello World application
 * @author Devis Lucato
 */

package com.lucato.example.helloandroidworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloAndroidWorld extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}