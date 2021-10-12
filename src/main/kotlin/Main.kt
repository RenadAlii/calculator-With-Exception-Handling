fun main(args: Array<String>) {
var e:Boolean=true

    while(e) {
        print("Enter the first NO. :")
        var NO1 = readLine()!!.toInt()
        print("\n Enter the second NO. :")
        var NO2 = readLine()!!.toInt()
        print("\n Enter the Operation:")
        var OP = readLine()?.get(0)


        when (OP) {
            '-' -> println("Result:" + (NO1 - NO2))
            '+' -> println("Result:" + (NO1 + NO2))
            '*' -> println("Result:" + (NO1 * NO2))
            '/' -> {
                if (NO2 == 0) {
                    println("ERROR NO One divide by zero!!!!!!!!!!!!!")
                } else println("Result:" + (NO1 / NO2))
            }
            '%' -> println("Result:" + (NO1 % NO2))
            else -> println("Enter a valid operator!!")


        }
       println("Press 1 to perform another calculation. If you wish to exit, enter anything else ")
        var x = readLine()
        if(x=="1"){
            continue
        }else{
          break
        }

    }




}