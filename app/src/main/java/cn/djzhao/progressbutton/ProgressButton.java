package cn.djzhao.progressbutton;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class ProgressButton {
    
	private ProgressBar progress;
	private TextView text;
	private LinearLayout layout;
	Animation ani;
	
    ProgressButton(Context ctx, View view) {
		layout = view.findViewById(R.id.prpgress_buttonLinearLayout);
		progress = view.findViewById(R.id.prpgress_buttonProgressBar);
		text = view.findViewById(R.id.prpgress_buttonTextView);
		
		ani = AnimationUtils.loadAnimation(ctx, R.anim.fade_in);
	}
	
	void buttonActived() {
		progress.setVisibility(View.VISIBLE);
		progress.setAnimation(ani);
		text.setText("please wait...");
		text.setAnimation(ani);
	}
    
	void buttonFinished(){
		// layout.setBackgroundResource(android.R.color.white);
		layout.setBackgroundColor(layout.getResources().getColor(android.R.color.holo_green_light));
		progress.setVisibility(View.GONE);
		text.setText("done");
	}
}
