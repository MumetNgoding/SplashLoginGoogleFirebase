package founder.nugroho.splashlogingooglefirebase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

import kotlinx.android.synthetic.main.type_file.*

class PeopleWantedType : AppCompatActivity() {

    var _howmuchbudget3: EditText? = null
//    var _location3: EditText? = null
    var _description3: EditText? = null

    var _btnupload3: ImageButton? = null
    var _btnpost3: Button? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.people_wanted_type)

        _btnupload3 = findViewById(R.id.btnupload3)
        _howmuchbudget3 = findViewById(R.id.howmuchbudgetyourwantoffer)
//        _location3 = findViewById(R.id.location3)
        _description3 = findViewById(R.id.description3)
        _btnpost3 = findViewById(R.id.btnpost3)

        _btnpost3!!.setOnClickListener {
            val intent = Intent(applicationContext, TypeFile::class.java)
            Toast.makeText(applicationContext, "POST KETIGA BERHASIL", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}