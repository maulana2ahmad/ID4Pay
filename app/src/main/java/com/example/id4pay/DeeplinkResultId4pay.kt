package com.example.id4pay

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class DeeplinkResultId4pay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink_result_id4pay)


        val action: String? = intent?.action
        val data: Uri? = intent?.data
        val server: String? = data?.getAuthority()
        val path: String? = data?.getPath()
        val protocol: String? = data?.getScheme()
        val args: Set<String>? = data?.getQueryParameterNames()


        Log.d("action1", action.toString())
        Log.d("action2", server.toString())
        Log.d("action3", path.toString())
        Log.d("action4", protocol.toString())
        Log.d("action5", args.toString())
        Log.d("action6", data.toString())
        Log.d("action7", data?.getQueryParameter("order_id"))
    }
}
