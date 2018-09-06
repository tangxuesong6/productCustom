package learn.song.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mTvSecondName;
    private TextView mTvSecondNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTvSecondName = (TextView) findViewById(R.id.tv_second_name);
        mTvSecondNext = (TextView) findViewById(R.id.tv_second_next);
        mTvSecondNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ThridActivity.class);
                startActivity(intent);
            }
        });
    }
}
