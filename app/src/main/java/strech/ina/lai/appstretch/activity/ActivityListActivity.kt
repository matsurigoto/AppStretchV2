package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.adapters.ActivityListAdapter
import strech.ina.lai.appstretch.models.Activity

class ActivityListActivity : AppCompatActivity() {

    lateinit var activityListAdapter: ActivityListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // fake data
        val activityList = ArrayList<Activity>()

        this.activityListAdapter = ActivityListAdapter(this, activityList)
        recycler_view_activity_list.adapter = this.activityListAdapter
        recycler_view_activity_list.layoutManager = LinearLayoutManager(this)
    }
}
