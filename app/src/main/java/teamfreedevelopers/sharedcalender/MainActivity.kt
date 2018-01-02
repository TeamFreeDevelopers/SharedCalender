package teamfreedevelopers.sharedcalender

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Google API叩いてデータ取得する

        // TODO カレンダーのデータを詰める

        // TODO 選択した日の詳細情報をListに詰める
        val items = arrayOf("item a", "item b", "item c")

        //　List部分に詰める
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

    }


}
