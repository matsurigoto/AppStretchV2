package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_posture_list.*
import strech.ina.lai.appstretch.adapter.PostureListAdapter
import strech.ina.lai.appstretch.R

class PostureListActivity : AppCompatActivity() {

    lateinit var postureListAdapter: PostureListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posture_list)

        //this.postureListAdapter = PostureListAdapter(this, WeatherService.threeDayForecast)
        //recycler_view_posture_list.adapter = this.postureListAdapter
        //recycler_view_posture_list.layoutManager = LinearLayoutManager(this)
    }

}
