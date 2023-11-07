object Variables {
    def main(arg: Array[String]) = {
        // Mutable variables

        var mutable_var = "hello"
        println("Before update: mutable_var "+ mutable_var)
        mutable_var = "world"
        println("After update: mutable_var "+ mutable_var)

        // Immutable variables
        val immutable_val = 10
        println("immutable_val is :"+ immutable_val)
        //immutable_val = 20
        // this will give error as we cannot change the value of a val variable.
        //println("immutable_val is :", immutable_val)


        var x = 10
        while(x>=0) {
            println("x " + x)
            x-=1
        }

        for (y <- 1 to 4){
            println("y " + y)
        }
    }
}