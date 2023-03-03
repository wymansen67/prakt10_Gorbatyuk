abstract class Cable: Cable_Info {
    var type: String = ""
    var cableCoresAmount: Int = 2
    var D: Double = 0.5

    open fun Q () : Double{
        return D/cableCoresAmount
    }

    override fun Information() {
        println("Кабель\nТип: $type\nКол-во жил: $cableCoresAmount\nДиаметр кабеля: $D")
    }

}