package founder.nugroho.splashlogingooglefirebase

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //login
        loginreg.setOnClickListener {
            val intent = Intent(applicationContext, TypeFile::class.java)
            startActivity(intent)
            finish()
        }

        //registrasi
        registerreg.setOnClickListener {
            val intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
