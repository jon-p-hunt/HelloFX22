package com.example.hellofx2;

//public class HelloFX2 {
//}

//package com.example.hellofx2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;
import android.widget.FrameLayout;

public class HelloFX2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get Java version (JavaFX version equivalent isn't applicable in Android,
        // so we use the Android API level instead)
        //String javaVersion = System.getProperty("java.version");
        String javaVersion = "25.0.2";
        String androidVersion = "API " + android.os.Build.VERSION.SDK_INT;

        // Label (TextView) equivalent of JavaFX Label
        TextView label = new TextView(this);
        label.setText("Hello, Android " + androidVersion + ", running on Java " + javaVersion + ".");
        label.setGravity(Gravity.CENTER);

        // StackPane equivalent -> FrameLayout with centered gravity
        FrameLayout stackPane = new FrameLayout(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER
        );
        stackPane.addView(label, params);

        // Scene + Stage equivalent -> setContentView
        setContentView(stackPane);
    }
}