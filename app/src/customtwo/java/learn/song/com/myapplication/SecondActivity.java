package learn.song.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView mTvSecondName;
    private TextView mTvSecondNext;
    private ImageView mImgvMeizi;



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
        mImgvMeizi = (ImageView) findViewById(R.id.imgv_meizi);
        mImgvMeizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "我是妹子", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
