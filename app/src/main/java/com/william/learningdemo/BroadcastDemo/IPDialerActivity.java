package com.william.learningdemo.BroadcastDemo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.william.learningdemo.R;

public class IPDialerActivity extends Activity {

    EditText edtPrefix;
    Button btnSave;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipdialer);
        sp = getSharedPreferences("info", MODE_PRIVATE);

        edtPrefix = findViewById(R.id.edt_prefix);
        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prefix = edtPrefix.getText().toString().trim();
                if (TextUtils.isEmpty(prefix)) {
                    Toast.makeText(getApplicationContext(), "输入不可为空", Toast.LENGTH_SHORT).show();
                } else {
                    //通过sp保存用户的输入并且使用commit提交
                    sp.edit().putString("prefix", prefix).commit();
                    Toast.makeText(getApplicationContext(), "设置成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void toDial(View view) {
        Uri uri = Uri.parse("tel:");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }
}
