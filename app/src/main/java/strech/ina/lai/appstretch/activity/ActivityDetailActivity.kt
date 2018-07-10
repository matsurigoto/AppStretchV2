package strech.ina.lai.appstretch.activity

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import kotlinx.android.synthetic.main.activity_detail.*
import strech.ina.lai.appstretch.R

class ActivityDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val adRequest = AdRequest.Builder().build()
        adView!!.loadAd(adRequest)

        val path = "android.resource://" + packageName + "/" + R.raw.activity001
        videoView?.setVideoURI(Uri.parse(path))
        videoView.start();
        //videoView?.setVideoPath("")

        videoView
    }
}
