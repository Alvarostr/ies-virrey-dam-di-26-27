package theory.classes

enum class OrderStatus{
    PENDING,PAID,SHIPPED,DELIVERED
}
fun describe(status: OrderStatus): String = when(status){
    OrderStatus.PENDING -> "Waiting for payment"
    OrderStatus.PAID -> "Preparing your order"
    OrderStatus.SHIPPED -> "On its way"
    OrderStatus.DELIVERED -> "Enjoy it!"
}
enum class Size(val label: String, val extraPrice: Double){
    SMALL("S",0.0),
    MEDIUM("M",1.5),
    LARGE("L",3.0)
}
fun main(){
    val status = OrderStatus.SHIPPED
    println(describe(status))
    println(status.name)
    println(OrderStatus.entries)

    val size = Size.LARGE
    println("Size ${size.label}: +${size.extraPrice} €")
}