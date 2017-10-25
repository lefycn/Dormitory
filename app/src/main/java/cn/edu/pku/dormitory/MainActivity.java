package cn.edu.pku.dormitory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button myLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        myLogin = (Button) findViewById(R.id.login);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login){
            Intent intent = new Intent(this,LoginActivity.class);
        }
    }
}
