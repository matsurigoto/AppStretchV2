package strech.ina.lai.appstretch.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tip_detail.*
import strech.ina.lai.appstretch.R

class TipDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_detail)

        textViewTipTitle.setText("Title")
        textViewDesc.setText("Description")
    }
}
