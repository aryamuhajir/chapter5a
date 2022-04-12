package com.binar.chapter5a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.chapter5a.Model.GetAllFilmResponseItem
import com.binar.chapter5a.Network.APIClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getDataFilm()



    }
    fun getDataFilm(){
     APIClient.instance.getAllFilm()
         .enqueue(object : Callback)

//        APIClient.instance.getAllFilm()
//            .enqueue(object : retrofit2.Callback<List<GetAllFilmResponseItem>>{
//                override fun onResponse(
//                    call: Call<List<GetAllFilmResponseItem>>,
//                    response: Response<List<GetAllFilmResponseItem>>
//                ) {
//                    if (response.isSuccessful){
//                        val dataFilm = response.body()
//                        val adapterFilm = AdapterRv(dataFilm!!)
//                        val lm = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
//                        rv_item.layoutManager = lm
//                        rv_item.adapter = adapterFilm
//                    }else{
//                        Toast.makeText(this@MainActivity, response.message(), Toast.LENGTH_LONG).show()
//                    }
//                }
//
//                override fun onFailure(call: Call<List<GetAllFilmResponseItem>>, t: Throwable) {
//                    Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_LONG).show()
//                }
//
//            })
    }
}