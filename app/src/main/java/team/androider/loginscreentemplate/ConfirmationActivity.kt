package team.androider.loginscreentemplate

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.goodiebag.pinview.Pinview

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val pinView = findViewById<Pinview>(R.id.pinview)
        pinView.setPinViewEventListener(object : Pinview.PinViewEventListener {
            override fun onDataEntered(pinview: Pinview?, fromUser: Boolean) {
                Toast.makeText(this@ConfirmationActivity, pinview?.getValue(), Toast.LENGTH_SHORT).show()
            }
        }
        )
    }
}
