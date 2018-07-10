package strech.ina.lai.appstretch.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tip_list.*
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.adapters.TipListAdapter
import strech.ina.lai.appstretch.models.Tip
import strech.ina.lai.appstretch.utils.getString

class TipListActivity : AppCompatActivity() {

    private lateinit var tipListAdapter: TipListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_list)

        val tipList = ArrayList<Tip>()
        // fake data
        for (i in 1..3)
        {
            val title = getString("posture" + i.toString().padStart(2, '0') + "_title")
            val imageUrl = getString("posture" + i.toString().padStart(2, '0') + "_url")
            val description = getString("posture" + i.toString().padStart(2, '0') + "_description")
            tipList.add(Tip(id = i,title = title, imageUrl=imageUrl, description = description))
        }
        this.tipListAdapter = TipListAdapter(this, tipList)
        recycler_view_tip_list.adapter = this.tipListAdapter
        recycler_view_tip_list.layoutManager = LinearLayoutManager(this)
    }
}
