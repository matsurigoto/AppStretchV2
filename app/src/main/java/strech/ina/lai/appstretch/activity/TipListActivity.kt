package strech.ina.lai.appstretch.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_posture_list.*
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.adapters.TipListAdapter
import strech.ina.lai.appstretch.models.Tip

class TipListActivity : AppCompatActivity() {

    private lateinit var tipListAdapter: TipListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_list)

        val tipList = ArrayList<Tip>()

        this.tipListAdapter = TipListAdapter(this, tipList)
        recycler_view_posture_list.adapter = this.tipListAdapter
        recycler_view_posture_list.layoutManager = GridLayoutManager(this, 2) as RecyclerView.LayoutManager?

    }
}
