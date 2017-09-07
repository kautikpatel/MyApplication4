package gitdemo.app.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents(){
        Toast.makeText(SecondActivity.this, "Second Init Called", Toast.LENGTH_SHORT).show();
    }
}
