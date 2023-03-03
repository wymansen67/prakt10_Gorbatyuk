fun main () = try {
        var cable = Cable_ne_tot_sami(true)
        print("Тип кабеля: ")
        cable.type= readln()
        print("Количество жил кабеля: ")
        cable.cableCoresAmount= readln().toInt()
        print("Диаметр кабеля: ")
        cable.D= readln().toDouble()
        cable.Information()
        println(cable.Q())
        cable.SetBraid(false)
        cable.Information()
        println(cable.Q())
}
catch (e:NumberFormatException) {println("Error")}