package founder.nugroho.splashlogingooglefirebase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    var _nameText: EditText? = null
    var _emailText: EditText? = null
    var _passwordText: EditText? = null
    var _reenterPasswordText: EditText? = null
    var _signupButton: Button? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        _nameText = findViewById(R.id.fullnamereg) as EditText
        _emailText = findViewById(R.id.emailreg) as EditText
        _passwordText = findViewById(R.id.passwordreg) as EditText
        _reenterPasswordText = findViewById(R.id.passwordreg2) as EditText


        _signupButton = findViewById(R.id.buttonregistration) as Button

        _signupButton!!.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            Toast.makeText(applicationContext, "Register Succesfully", Toast.LENGTH_SHORT).show()
            startActivity(intent)
            finish()

        }
    }
}