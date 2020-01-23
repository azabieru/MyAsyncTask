package com.example.myasynctask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myasync.MyAsyncTask
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    override fun onClick(v: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (v.id == R.id.button){
            MyAsyncTask(this).execute("Param1")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
    }
}
