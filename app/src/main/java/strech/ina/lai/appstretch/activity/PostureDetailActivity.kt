package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import kotlinx.android.synthetic.main.activity_posture_detail.*
import strech.ina.lai.appstretch.R

class PostureDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posture_detail)

        val adRequest = AdRequest.Builder().build()
        adViewPostureDetail!!.loadAd(adRequest)

        val postureId:Int = intent.getIntExtra("postureId",0)
        postDetialImageView.setImageResource(R.mipmap.banner01)
        textPostureDetailTitle!!.setText("")
        textPostureDetailTime!!.setText("")
    }
}
