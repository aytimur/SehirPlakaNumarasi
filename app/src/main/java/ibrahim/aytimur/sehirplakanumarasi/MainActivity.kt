package ibrahim.aytimur.sehirplakanumarasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var pnumara = editText1.text.toString().toInt()
            when(pnumara){
                35 -> textView.setText("İzmir")
                34 -> textView.setText("İstanbul")
                45 -> textView.setText("Manisa")
                3 -> textView.setText("Afyon")
                9 -> textView.setText("Aydın")
                else -> {
                    textView.setText("Bulunmadı")
                }
            }
        }
    }
}
