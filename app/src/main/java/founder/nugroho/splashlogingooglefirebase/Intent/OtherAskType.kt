package founder.nugroho.splashlogingooglefirebase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast


class OtherAskType : AppCompatActivity() {

    var _setdefautcharge: EditText? = null
//    var _location2: EditText? = null
    var _description2: EditText? = null
    var _upload2: ImageButton? = null
    var _post2: ImageButton? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_ask_typle)

        _upload2 = findViewById(R.id.btnupload2)
        _setdefautcharge = findViewById(R.id.setdefaultcharge)
//        _location2 = findViewById(R.id.location2)
        _description2 = findViewById(R.id.description2)

        _post2 = findViewById(R.id.btnupload2)

        _post2!!.setOnClickListener {
            val intent = Intent(applicationContext, TypeFile::class.java)
            Toast.makeText(applicationContext, "POST KEDUA BERHASIL", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}