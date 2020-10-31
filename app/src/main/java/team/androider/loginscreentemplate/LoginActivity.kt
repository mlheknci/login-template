package team.androider.loginscreentemplate

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val textView = findViewById<TextView>(R.id.signUp)
        textView.setOnClickListener {
            val signUpIntent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(signUpIntent)
            finish()
        }
    }
}
