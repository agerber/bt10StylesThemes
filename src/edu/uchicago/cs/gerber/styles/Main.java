package edu.uchicago.cs.gerber.styles;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

//styles and themes
//################################################
// very good explanation of this
//http://ugiagonzalez.com/2012/01/19/android-linearlayout-distribution-explained-weight-and-sizes/
//################################################
public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        //match_parent is newer than fill_parent (fill_parent does the same thing, but is deprecated)
        //android:layout_weight are factors and they're summed automatically.
        //unless you want dead-space, no need to use wieght sum. wieghts are summed automatically

    }
}