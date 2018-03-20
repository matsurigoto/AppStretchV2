package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_posture_list.*
import strech.ina.lai.appstretch.adapters.PostureListAdapter
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.models.Posture

class PostureListActivity : AppCompatActivity() {

    lateinit var postureListAdapter: PostureListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posture_list)

        // fake data
        val postureList = ArrayList<Posture>()
        
        this.postureListAdapter = PostureListAdapter(this, postureList)
        recycler_view_posture_list.adapter = this.postureListAdapter
        recycler_view_posture_list.layoutManager = LinearLayoutManager(this)
    }
}
