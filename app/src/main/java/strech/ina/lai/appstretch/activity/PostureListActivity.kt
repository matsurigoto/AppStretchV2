package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_posture_list.*
import strech.ina.lai.appstretch.adapters.PostureListAdapter
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.models.Posture
import android.support.v7.widget.GridLayoutManager
import strech.ina.lai.appstretch.utils.getString


class PostureListActivity : AppCompatActivity() {

    private lateinit var postureListAdapter: PostureListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posture_list)

        val postureList = ArrayList<Posture>()
        // fake data
        for (i in 1..16)
        {
            val title = getString("posture" + i.toString().padStart(2, '0') + "_title")
            val imageUrl = getString("posture" + i.toString().padStart(2, '0') + "_url")
            val description = getString("posture" + i.toString().padStart(2, '0') + "_description")
            postureList.add(Posture(id = i,title = title, imageUrl=imageUrl, description = description))
        }

        this.postureListAdapter = PostureListAdapter(this, postureList)
        recycler_view_posture_list.adapter = this.postureListAdapter
        recycler_view_posture_list.layoutManager = GridLayoutManager(this, 2)
    }


}
