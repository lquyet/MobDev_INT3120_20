import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.testproj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "u1", "u2", "u3"
        )

        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        binding.users.adapter = arrayAdapter

        setContentView(binding.root)
    }
}