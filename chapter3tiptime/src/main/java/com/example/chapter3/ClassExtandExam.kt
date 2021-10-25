package com.example.chapter3
import kotlin.math.PI
import kotlin.math.sqrt


/**
 * 다양한 종류의 주거지에 대한 세분류를 구현하는 프로그램.
 * 방법 표시:
 * 상속을 통해 클래스 계층 구조, 변수 및 함수를 만듭니다.
 * 추상 클래스, 재정의 및 비공개 대 공개 변수.
 */
fun main() {
    val squareCabin = SquareCabin(6, 50.0)


//    println("\nSquare Cabin\n============")
//    println("Capacity: ${squareCabin.capacity}")
//    println("Material: ${squareCabin.buildingMaterial}")
//    println("Has room? ${squareCabin.hasRoom()}")
    //with 문을 사용 문장의 반복을 줄일 수 있다
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
    val roundHut = RoundHut(3, 10.0)

    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }

    val roundTower = RoundTower(4, 15.5)

    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }
}

/**
 * 모든 주거지에 공통되는 속성을 정의합니다.
 * 모든 주택은 연면적이 있다.
 * 하지만 계산은 하위 클래스에 따라 다릅니다.
 * 회의실 확인 및 접수는 여기에서 시행됩니다.
 * 모든 주거 하위 클래스에서 동일하기 때문입니다.
 *
 * @param residents 현재 거주자 수
 */

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    /**
     * 다른 거주자가 들어갈 수 있는 공간이 있는지 확인
     *
     * @객실이 비어 있으면 true를 반환하고 그렇지 않으면 false를 반환합니다.
     */
    fun hasRoom(): Boolean {
        return residents < capacity
    }

    /**
     * 주거지의 바닥 면적을 계산합니다.
     * 형상이 결정되는 하위 분류에 의해 구현됩니다.
     *
     * @return floor area
     * */
    abstract fun floorArea(): Double

    /**
     * 수용 능력을 거주자 수와 비교하여
     * 수용인원이 거주인원보다 많을 경우
     * 거주자 수를 늘려 거주자를 추가한다.
     * 결과를 출력합니다.
     */
    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }

}

/**
 * Square cabin Dwelling
 *
 * @param residents 현재 거주자 수
 * @param length
 */
class SquareCabin(residents: Int, val length : Double) : Dwelling(residents){
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6

    /**
     * 사각 주거의 바닥 면적을 계산합니다.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return length * length
    }
}

/**
 * Dwelling with a circular floorspace
 *
 * @param residents 현재 거주자 수
 * @param radius
 */
open class RoundHut(residents: Int, val radius : Double) : Dwelling(residents){
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4

    /**
     * Calculate floor area for a round dwlling
     *
     * @return fllor area
     */
    override fun floorArea(): Double {
        return PI * radius * radius
    }

    /**
     * Calculates the max length for a square carpet
     * 원형 바닥에 맞는다.
     *
     * @return length of carpet
     */
    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }
}

/**
 * Round Tower은 여러 층으로 구성되어 있습니다.
 *
 * @param residents 현재 거주자 수
 * @param radius
 * @param floor 층수
 */
class RoundTower(residents: Int, radius: Double,
                 val floors: Int = 2) : RoundHut(residents, radius){
    override val buildingMaterial: String = "Stone"

    // 용량은 층 수에 따라 달라집니다.
    override val capacity: Int = 4 * floors

    /**
     * 주탑 주거의 총 연면적을 계산합니다.
     * 다양한 스토리가 있습니다.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}