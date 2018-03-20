package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import strech.ina.lai.appstretch.adapters.PostureListAdapter
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
