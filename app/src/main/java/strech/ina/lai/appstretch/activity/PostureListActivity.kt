package strech.ina.lai.appstretch.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_posture_list.*
import strech.ina.lai.appstretch.adapters.PostureListAdapter
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.models.Posture
import android.support.v7.widget.GridLayoutManager


class PostureListActivity : AppCompatActivity() {

    private lateinit var postureListAdapter: PostureListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posture_list)

        val postureList = ArrayList<Posture>()
        // fake data
        postureList.add(Posture(id = 0,title = "Posture1", imageUrl="https://distudio.blob.core.windows.net/study4tw/1525119511.75697.png",description = "Posture1"))
        postureList.add(Posture(id = 0,title = "Posture2", imageUrl="https://distudio.blob.core.windows.net/study4tw/1511809721.22344.jpg",description = "Posture2"))
        postureList.add(Posture(id = 0,title = "Posture3", imageUrl="https://distudio.blob.core.windows.net/study4tw/1527510450.36769.png",description = "Posture3"))
        postureList.add(Posture(id = 0,title = "Posture4", imageUrl="https://distudio.blob.core.windows.net/study4tw/1511737675.70031.jpg",description = "Posture4"))
        postureList.add(Posture(id = 0,title = "Posture5", imageUrl="https://distudio.blob.core.windows.net/study4tw/1519341036.38332.png",description = "Posture5"))
        postureList.add(Posture(id = 0,title = "Posture6", imageUrl="https://distudio.blob.core.windows.net/study4tw/1517584022.78193.jpg",description = "Posture6"))
        
        this.postureListAdapter = PostureListAdapter(this, postureList)

        recycler_view_posture_list.adapter = this.postureListAdapter
        recycler_view_posture_list.layoutManager = GridLayoutManager(this, 2)
    }
}
