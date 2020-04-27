package com.example.id4pay

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_bayar.setOnClickListener{
            val url = "https://linkaye.id/applink/payment?data=rbwbx7f7FJiYqutv6SbX-VuNGQCCOYncfbvC5Too94gMUercdrqJYKsw_BpZMgx9abF8jcGWmbwtvaxKhg2MKy1rIPt-yhkdlLay9u_o7ba7wcyadWXgSAE564iZ-EcZuK0hXPgK0e23MgoCIhk6-zaxbD1u4kQjZQKlbusYm_ntYBHVoCvZwW79u05czSM41tjdaJiLQT2w-y42-pVRE0FK0BJ4FXyNJk1KqghOvDk-vc-A-v-6ba9yc6ialj39awyUGguGm7mPBhocwUzyVnPhA_greRc="
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
            Log.d("tes",  "uyy")
        }
    }
}
