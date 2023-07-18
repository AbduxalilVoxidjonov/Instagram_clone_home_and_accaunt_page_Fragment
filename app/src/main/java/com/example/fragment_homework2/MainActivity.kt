package com.example.fragment_homework2
import com.example.fragment_homework2.fragment.Fragment_accaunt
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment_homework2.databinding.ActivityMainBinding
import com.example.fragment_homework2.fragment.Fragment_homePage

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val accaunt = Fragment_accaunt()
        val homePage = Fragment_homePage()

        binding.apply {
           homePages.setOnClickListener {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,homePage).commit()
            }
            accaountPage.setOnClickListener {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,accaunt).commit()
            }
        }
    }
}