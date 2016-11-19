package lanou.grouptestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

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
        Log.d("MainActivity", "log");
    }
}
