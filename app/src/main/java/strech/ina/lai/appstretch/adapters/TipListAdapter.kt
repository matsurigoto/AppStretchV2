package strech.ina.lai.appstretch.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import strech.ina.lai.appstretch.R
import strech.ina.lai.appstretch.models.Tip

/**
 * Created by DuranHsieh on 2018/3/29.
 */
class TipListAdapter (val context: Context, val tips: List<Tip>)
    : RecyclerView.Adapter<TipListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bind(tips[position])
        holder?.itemView?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

            }
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.cardview_sport, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = this.tips.count()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title = itemView?.findViewById<TextView>(R.id.sport_item_info)
        private val imageView = itemView?.findViewById<ImageView>(R.id.sport_item_icon)

        fun bind(tips: Tip) {
            title.text = tips.title
            Glide.with(context).load(tips.imageUrl).into(imageView);
        }
    }
}