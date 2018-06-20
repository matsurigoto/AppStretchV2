package strech.ina.lai.appstretch.utils

import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.getString(name: String): String {
    val aaa =resources.getIdentifier(name, "string", packageName)
    return resources.getString(aaa)
}