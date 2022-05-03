open class Car {
    
    var color : String = ""
    var speed : Int = 0
    companion object {
        var carCount : Int = 0
        const val MAXSPEED : Int = 120
        const val MINSPEED : Int = 0
        fun currentCarCount() : Int {
            return carCount
        }
    }
    
    constructor(){
    }
    
    constructor(color : String, speed : Int){

        this.color = color
        this.speed = speed
        carCount++
        
    }
    
    open fun upSpeed(value : Int){

        if(speed + value >= 120)
        speed = 120
        else speed = speed + value
        
    }
    
}

class SUV : Car {
    
    var engine = ""
    
    constructor(){
    } //그냥 생성자
    
    constructor(engine : String){
        this.engine = engine
    }
    
    fun nameofEngine() : String {
        return engine
    }
    
    override fun  upSpeed (value : Int){
     
        if(speed + value >= 200)
        speed = 200
        else speed = speed + value
        
    }
    
}

class SportsCar : Car {
    
    var seatNum : Int = 0
    
    constructor(){
    }
    
    fun countSeat() : Int {
        return seatNum
    }
    
    override fun  upSpeed (value : Int){
     
        if(speed + value >= 300)
        speed = 300
        else speed = speed + value
        
    }
    
}

fun main() {
    
    var suvcar : SUV = SUV()
    suvcar.upSpeed(150)
    println("SUV 차량의 속도는" + suvcar.speed + "km 입니다")
    
    var Dieselcar : SUV = SUV("디젤")
    println("해당 SUV 차량의 엔진은 " + Dieselcar.engine + " 입니다")
    
    var spcar : SportsCar = SportsCar()
    suvcar.upSpeed(270)
    println("SUV 차량의 속도는" + spcar.speed + "km 입니다")
    
}
