package blue.sky.ui.groupimageview;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import blue.sky.ui.GroupImageView;

public class GroupRoundImage extends AppCompatActivity {
    GroupImageView group, group1, group2, group3, group4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_round_image);
        group= (GroupImageView) findViewById(R.id.img);
        group.setRoundGroupImage(1, BitmapFactory.decodeResource(getResources(),R.drawable.aa));
        group1= (GroupImageView) findViewById(R.id.img1);
        group1.setRoundGroupImage(2,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b));
        group2= (GroupImageView) findViewById(R.id.img2);
        group2.setRoundGroupImage(3,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b),
                BitmapFactory.decodeResource(getResources(),R.drawable.c));
        group3= (GroupImageView) findViewById(R.id.img3);
        group3.setRoundGroupImage(4,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b),
                BitmapFactory.decodeResource(getResources(),R.drawable.c),
                BitmapFactory.decodeResource(getResources(),R.drawable.d));
        group4= (GroupImageView) findViewById(R.id.img4);
        group4.setRoundGroupImage(100,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b),
                BitmapFactory.decodeResource(getResources(),R.drawable.c));
    }

    public void circle(View view) {
        startActivity(new Intent(this,GroupCircleImage.class));
        finish();
    }
}
