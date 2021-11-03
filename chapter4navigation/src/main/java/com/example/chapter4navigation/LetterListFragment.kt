package com.example.chapter4navigation

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4navigation.databinding.FragmentLetterListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
//초기값은 null 로
//null 을 허용해야하는 이유는 onCreateView() 가 호출될 때까지 레이아웃을 확장할 수 없기 때문문
private var _binding: FragmentLetterListBinding? = null
private val binding get() = _binding!!
private lateinit var recyclerView: RecyclerView
private var isLinearLayoutManager = true

/**
 * A simple [Fragment] subclass.
 * Use the [LetterListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LetterListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLetterListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        chooseLayout()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.layout_menu, menu)

        val layoutButton = menu.findItem(R.id.action_switch_layout)
        setIcon(layoutButton)
    }

    //레이아웃 선택시 리사이클러 뷰를 변경하는 함수
    private fun chooseLayout(){
        if (isLinearLayoutManager){
            recyclerView.layoutManager = LinearLayoutManager(context)

        }else {
            recyclerView.layoutManager = GridLayoutManager(context,4)
        }
        recyclerView.adapter = LetterAdapter()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout -> {
                // isLinearLayoutManager(boolean)를 반대 값으로 설정합니다.
                isLinearLayoutManager = !isLinearLayoutManager
                // 레이아웃 및 아이콘을 설정합니다.
                chooseLayout()
                setIcon(item)

                return true
            }
            // 그렇지 않으면 아무것도 하지 않고 핵심 이벤트 처리를 사용합니다.

            // 조항이 가능한 모든 경로를 명시적으로 설명하도록 요구하는 경우
            // 예를 들어 값이 boolean인 경우 참과 거짓 모두
            // 또는 처리되지 않은 모든 케이스를 탐지할 수 있습니다.
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setIcon(menuItem: MenuItem?){
        // LayoutManager가 현재 사용 중인 메뉴 아이콘의 그리기 가능 설정
        // if-clause는 모든 경로가 값을 반환하는 경우 할당의 오른쪽에 사용할 수 있습니다.
        // 다음 코드는 다음과 같습니다.
        // if(isLinearLayoutManager)
        // menu.icon = ContextCompat.getDrawable(이것, R.drawable.ic_grid_layout)
        // 기타 menu.icon = ContextCompat.getDrawable(이것, R.drawable.ic_linear_layout)

        if (menuItem == null)
            return
        menuItem.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this.requireContext(),R.drawable.ic_grid_layout)
            else ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_linear_layout)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LetterListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LetterListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}