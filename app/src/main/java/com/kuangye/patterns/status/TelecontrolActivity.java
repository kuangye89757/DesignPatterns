package com.kuangye.patterns.status;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.kuangye.patterns.R;
import com.kuangye.patterns.status.telecontrol.TvController;


/**
 * Created by gaowei555 on 2016/8/29 14:37
 * E-mail fkfj555@163.com
 * Function
 */
public class TelecontrolActivity extends Activity implements View.OnClickListener {
    private TextView on, off, last, next, add, move;
    private TvController tvController = new TvController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telecontrol);
        initView();
        initData();
        addListener();

    }


    private void initView() {
        on = (TextView) findViewById(R.id.telecontrol_on);
        off = (TextView) findViewById(R.id.telecontrol_off);
        last = (TextView) findViewById(R.id.telecontrol_last);
        next = (TextView) findViewById(R.id.telecontrol_next);
        add = (TextView) findViewById(R.id.telecontrol_add);
        move = (TextView) findViewById(R.id.telecontrol_move);
    }

    private void addListener() {
        on.setOnClickListener(this);
        off.setOnClickListener(this);
        last.setOnClickListener(this);
        next.setOnClickListener(this);
        add.setOnClickListener(this);
        move.setOnClickListener(this);
    }

    private void initData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.telecontrol_on:
                Toast.makeText(this, tvController.powerOn(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.telecontrol_off:
                Toast.makeText(this, tvController.powerOff(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.telecontrol_last:
                Toast.makeText(this, tvController.PrevChannel(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.telecontrol_next:
                Toast.makeText(this,tvController.nextChannle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.telecontrol_add:
                Toast.makeText(this, tvController.turnUp(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.telecontrol_move:
                Toast.makeText(this, tvController.turnDown(), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
