package cn.djzhao.progressbutton;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		findViewById(R.id.activity_maininclude).setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					final ProgressButton pb = new ProgressButton(MainActivity.this, v);
					pb.buttonActived();
					new Handler().postDelayed(new Runnable() {
							public void run() {
								pb.buttonFinished();						
							}
						}, 2000);
				}
			});

    }

}
