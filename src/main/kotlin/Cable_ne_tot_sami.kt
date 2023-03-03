class Cable_ne_tot_sami (private var braid: Boolean): Cable () {
    override fun Q():Double{
        if(braid) {
            return 2*D/cableCoresAmount
        }
        else{
            return 0.5*D/cableCoresAmount
        }
    }
    override fun Information() {
        println("type: $type\nnumber_of_cable_cores: $cableCoresAmount\ndiameter: $D\npresence_of_braid: $braid")
    }
    fun GetBraid():Boolean{
        return braid
    }
    fun SetBraid(presence_of_braid:Boolean){
        this.braid=braid
    }
}