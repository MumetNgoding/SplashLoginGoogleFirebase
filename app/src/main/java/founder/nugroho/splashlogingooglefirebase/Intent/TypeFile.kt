package founder.nugroho.splashlogingooglefirebase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import founder.nugroho.splashlogingooglefirebase.R
import kotlinx.android.synthetic.main.type_file.*

class TypeFile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.type_file)

        full_cost_type.setOnClickListener {
            val intent = Intent(applicationContext, FullCostType::class.java)
            startActivity(intent)
            finish()
        }

        other_ask_type.setOnClickListener {
            val intent = Intent(applicationContext, OtherAskType::class.java)
            startActivity(intent)
            finish()
        }

        people_wanted_type.setOnClickListener {
            val intent = Intent(applicationContext, PeopleWantedType::class.java)
            startActivity(intent)
            finish()
        }
    }

}