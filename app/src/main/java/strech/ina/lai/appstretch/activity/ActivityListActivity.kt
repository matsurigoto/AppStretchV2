package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.adapters.ActivityListAdapter
import strech.ina.lai.appstretch.models.Activity

class ActivityListActivity : AppCompatActivity() {

    private lateinit var activityListAdapter: ActivityListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val activityList = ArrayList<Activity>()

        // fake data
        activityList.add(Activity(id = 0,title = "Activity1", imageUrl="https://distudio.blob.core.windows.net/study4tw/1527510069.76163.png",description = "Activity1"))
        activityList.add(Activity(id = 0,title = "Activity2", imageUrl="https://distudio.blob.core.windows.net/study4tw/1527510425.1898.png",description = "Activity2"))
        activityList.add(Activity(id = 0,title = "Activity3", imageUrl="https://distudio.blob.core.windows.net/study4tw/1527510450.36769.png",description = "Activity3"))

        this.activityListAdapter = ActivityListAdapter(this, activityList)
        recycler_view_activity_list.adapter = this.activityListAdapter
        recycler_view_activity_list.layoutManager = LinearLayoutManager(this)
    }
}
