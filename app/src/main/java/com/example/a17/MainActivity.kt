package com.example.a17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Long): IntArray {
                var answer = intArrayOf()
                var nString =n.toString()
                var nCharArray = nString.toCharArray()
                var result = IntArray(nCharArray.size)
                for(i in 0..nCharArray.size-1){
                    result.set(i,Character.getNumericValue(nCharArray.get(nCharArray.size-1-i)))
                }
                answer = result
                return answer
            }
        }
        val a =Solution()
        a.solution(12345)
    }
}