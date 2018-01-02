package teamfreedevelopers.sharedcalender

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Google APIを使うための認証をクリアする
        // See:https://developers.google.com/google-apps/calendar/auth

        // TODO Google API叩いてデータ取得する
        // See:https://developers.google.com/google-apps/calendar/v3/reference/calendarList/list
//        val service = Calendar.Builder(httpTransport, jsonFactory, credentials)
//                .setApplicationName("applicationName").build()
//        CalendarList calendarList = service.calendarList().list().setPageToken(pageToken).execute()

        // TODO カレンダーのデータを詰める
        // See:https://developers.google.com/google-apps/calendar/v3/reference/calendarList/list#examples
//        while (calendarList.hasNext()) {
//            //val items = calendarList.getItems()
//
//        }

        // TODO 選択した日の詳細情報をListに詰める
        val items = arrayOf("item a", "item b", "item c")

        //　List部分に詰める
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

    }

}
