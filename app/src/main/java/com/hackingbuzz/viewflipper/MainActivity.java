package com.hackingbuzz.viewflipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ViewFlipper;


public class MainActivity extends Activity {
    ViewFlipper vf;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vf =(ViewFlipper) findViewById(R.id.viewFlipper);

        for(i=0; i<2 ; i++) {  // we want looping of images we put in our xml file (n they are three ) so loop less than 2

            vf.startFlipping();
            vf.setFlipInterval(3000); // flip after every 3 seconds
            vf.setAutoStart(true);   // autostart true...
        }
    }


}
