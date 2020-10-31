package team.androider.loginscreentemplate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val button = findViewById<Button>(R.id.signUpButton)
        button.setOnClickListener{
            val confirmationIntent = Intent(this@SignUpActivity, ConfirmationActivity::class.java)
            startActivity(confirmationIntent)
        }
    }
}
