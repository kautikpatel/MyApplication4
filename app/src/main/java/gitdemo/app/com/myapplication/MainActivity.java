package gitdemo.app.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents(){
        Toast.makeText(MainActivity.this, "Init Called", Toast.LENGTH_SHORT).show();
    }
    private void initComponents23(){
        Toast.makeText(MainActivity.this, "Init Called1", Toast.LENGTH_SHORT).show();
    }
}
