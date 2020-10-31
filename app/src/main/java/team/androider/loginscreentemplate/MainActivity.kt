package team.androider.loginscreentemplate

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        Handler().postDelayed(
            {
                val splashIntent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(splashIntent)
                finish()
            },
            5000
        )
    }
}
