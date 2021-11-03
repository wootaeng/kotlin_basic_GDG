/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.chapter4navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4navigation.databinding.ActivityMainBinding

/**
 * Main Activity and entry point for the app. Displays a RecyclerView of letters.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    //레이아웃 상태를 추적하는 변수
    private var isLinearLayoutManager = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




//        recyclerView = binding.recyclerView
//        // Sets the LinearLayoutManager of the recyclerview
//        chooseLayout()
    }
//    //레이아웃 선택시 리사이클러 뷰를 변경하는 함수
//    private fun chooseLayout(){
//        if (isLinearLayoutManager){
//            recyclerView.layoutManager = LinearLayoutManager(this)
//
//        }else {
//            recyclerView.layoutManager = GridLayoutManager(this,4)
//        }
//        recyclerView.adapter = LetterAdapter()
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.layout_menu, menu)
//        // RecyclerView의 LinearLayoutManager를 기반으로 아이콘을 설정하는 코드를 호출합니다.
//        val layoutButton = menu?.findItem(R.id.action_switch_layout)
//        setIcon(layoutButton)
//        return true
//    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.action_switch_layout -> {
//                // isLinearLayoutManager(boolean)를 반대 값으로 설정합니다.
//                isLinearLayoutManager = !isLinearLayoutManager
//                // 레이아웃 및 아이콘을 설정합니다.
//                chooseLayout()
//                setIcon(item)
//
//                return true
//            }
//            // 그렇지 않으면 아무것도 하지 않고 핵심 이벤트 처리를 사용합니다.
//
//            // 조항이 가능한 모든 경로를 명시적으로 설명하도록 요구하는 경우
//            // 예를 들어 값이 boolean인 경우 참과 거짓 모두
//            // 또는 처리되지 않은 모든 케이스를 탐지할 수 있습니다.
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
//
//    private fun setIcon(menuItem: MenuItem?){
//        // LayoutManager가 현재 사용 중인 메뉴 아이콘의 그리기 가능 설정
//        // if-clause는 모든 경로가 값을 반환하는 경우 할당의 오른쪽에 사용할 수 있습니다.
//        // 다음 코드는 다음과 같습니다.
//        // if(isLinearLayoutManager)
//        // menu.icon = ContextCompat.getDrawable(이것, R.drawable.ic_grid_layout)
//        // 기타 menu.icon = ContextCompat.getDrawable(이것, R.drawable.ic_linear_layout)
//
//        if (menuItem == null)
//            return
//        menuItem.icon =
//            if (isLinearLayoutManager)
//                ContextCompat.getDrawable(this,R.drawable.ic_grid_layout)
//            else ContextCompat.getDrawable(this, R.drawable.ic_linear_layout)
//    }


}