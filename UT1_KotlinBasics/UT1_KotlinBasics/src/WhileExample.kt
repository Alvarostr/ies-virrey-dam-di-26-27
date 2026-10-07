fun main(){

    for (attempt in 1..3){
        println("Attempt $attempt")
    }

    var batteryLevel = 100
    while(batteryLevel > 0){
        println(batteryLevel)
        //batteryLevel = batteryLevel -10
        batteryLevel -=10
    }

    do{
        println("inside do-while")
        println(batteryLevel)
        batteryLevel -=10
    }while (batteryLevel > 100)

    var number = 10
    var favNumber = 4

    while(number>0){
        println(number)
        if(number == favNumber){
            break
        }
        number -= 1
    }

    number = 10
    while(number>0){
        number -=1
        if(number == favNumber){
            continue
        }
        println(number)
    }
}
