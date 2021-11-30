package example.irina.lifecycleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Да, сном, и только сном, должны его назвать!")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "И в этом мне пришлось сегодня убедиться:")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "Мир - только сон...")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "А я-то думал - явь,")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "Я думал - это жизнь, ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "а это снится...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Ки́-но Цураю́ки")
    }
}

