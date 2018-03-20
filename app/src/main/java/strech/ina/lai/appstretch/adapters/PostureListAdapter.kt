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
import strech.ina.lai.appstretch.models.Posture

/**
 * Created by DuranHsieh on 2018/3/19.
 */
class PostureListAdapter(val context: Context, val postures: List<Posture>)
    : RecyclerView.Adapter<PostureListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(postures[position])
        holder?.itemView?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

            }
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.cardview_sport, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = this.postures.count()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title = itemView?.findViewById<TextView>(R.id.sport_item_info)
        private val imageView = itemView?.findViewById<ImageView>(R.id.sport_item_icon)

        fun bind(postures: Posture) {
            title.text = postures.title
            Glide.with(context).load(postures.imageUrl).into(imageView);
        }
    }
}