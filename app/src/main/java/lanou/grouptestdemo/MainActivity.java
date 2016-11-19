package lanou.grouptestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //我写了
        // 王一鸣写了代码
        // 下午14:22
        System.currentTimeMillis();
        //
        Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "wangye", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "log");

        /*
        1
        1
        1
        1
        1
         */

        //123
        //456
        //789
        Log.d("MainActivity", "Log.isLogg");

    }
}
