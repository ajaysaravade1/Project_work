package com.example.vtgpagedesigns;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class proflie extends AppCompatActivity {

    TextView change;
    private static final String TAG = "Profile Activity";
    ImageView profile_img;
    private String DiretoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proflie);
        change = findViewById(R.id.change);
        profile_img = findViewById(R.id.profile_img);
        OpenOrCreateCache(getApplicationContext(), "path");

        Bitmap bmp = OpenBitmap("DP");
        if (bmp != null) {
            profile_img.setImageBitmap(bmp);
        } else {
            Bitmap user = BitmapFactory.decodeResource(getResources(), R.drawable.avatar);
            profile_img.setImageBitmap(user);
        }


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog();

            }
        });
    }

    public void showDialog() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View mView = inflater.inflate(R.layout.custom_dialog, null);
        //AlertDialog.Builder alert = new AlertDialog.Builder(proflie.this);
        //View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);

        final ImageView cat = mView.findViewById(R.id.cat);
        ImageView bee = mView.findViewById(R.id.bee);
        ImageView elephant = mView.findViewById(R.id.elephant);

        ImageView fox = mView.findViewById(R.id.fox);
        ImageView leopard = mView.findViewById(R.id.leopard);
        ImageView lion = mView.findViewById(R.id.lion);

        ImageView monkey = mView.findViewById(R.id.monkey);
        ImageView rakun = mView.findViewById(R.id.rakun);
        ImageView riano = mView.findViewById(R.id.riano);

        //CardView btnSet = (CardView) mView.findViewById(R.id.btnSet);
        //CardView btnCancel = (CardView) mView.findViewById(R.id.btnCancel);

        TextView tvCancel = mView.findViewById(R.id.tvCancel);


        //alert.setView(mView);

        //final AlertDialog alertDialog = alert.create();
        //alertDialog.setCanceledOnTouchOutside(false);
        final AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(mView)
                .create();
        alertDialog.show();
        //Cancel btn
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "Cancel onClick");
                alertDialog.dismiss();
            }
        });


        cat.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);

                alertDialog.dismiss();

            }
        });
        bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bee);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);
                alertDialog.dismiss();

            }
        });
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.elephant);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);
                alertDialog.dismiss();
            }
        });
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.fox);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);
                alertDialog.dismiss();

            }
        });
        leopard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.leopard);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);
                alertDialog.dismiss();
            }
        });
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.lion);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);

                alertDialog.dismiss();
            }
        });
        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.monkey);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);
                alertDialog.dismiss();
            }
        });
        rakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.rakun);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);
                alertDialog.dismiss();
            }
        });
        riano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.riano);
                SaveBitmap("DP", bitmap);
                Bitmap bmp = OpenBitmap("DP");
                profile_img.setImageBitmap(bmp);
                alertDialog.dismiss();

            }
        });


    }

    public void OpenOrCreateCache(Context _context, String _directoryName) {
        File file = new File(_context.getCacheDir().getAbsolutePath() + "/" + _directoryName);
        if (!file.exists()) {
            file.mkdir();
        }
        DiretoryName = file.getAbsolutePath();
    }

    public void SaveBitmap(String fileName, Bitmap bmp) {
        try {
            File file = new File(DiretoryName + "/" + fileName);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream Filestream = new FileOutputStream(DiretoryName + "/" + fileName);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, stream);
            byte[] byteArray = stream.toByteArray();
            Filestream.write(byteArray);
            Filestream.close();
            bmp.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Bitmap OpenBitmap(String name) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            File file = new File(DiretoryName + "/" + name);
            if (file.exists()) {
                Bitmap bitmap = BitmapFactory.decodeFile(DiretoryName + "/" + name, options);
                return bitmap;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}