package founder.nugroho.splashlogingooglefirebase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast


class FullCostType : AppCompatActivity() {

    var _howlong: EditText? = null
    var _howmuchbudget: EditText? = null
    var _howmanypeople: EditText? = null
    var _description: EditText? = null
    var _uploadbutton: ImageButton? = null
    var _buttonpost: Button? = null
//    var _location: EditText? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.full_cost_type)

        _uploadbutton = findViewById(R.id.btnupload)
        _howlong = findViewById(R.id.how_long)
        _howmuchbudget = findViewById(R.id.howmuchbudget)
        _howmanypeople = findViewById(R.id.howmanypeople)
//        _location = findViewById(R.id.location)
        _description = findViewById(R.id.description)
        _buttonpost = findViewById(R.id.btnpost)

        _buttonpost!!.setOnClickListener {
            val intent = Intent(applicationContext, TypeFile::class.java)
            Toast.makeText(applicationContext, "POST BERHASIL", Toast.LENGTH_SHORT).show()
            startActivity(intent)
            finish()
        }
    }
}