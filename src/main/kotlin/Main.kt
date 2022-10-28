import java.util.Calendar
import kotlin.io.readLine as readLine1

fun main(args: Array<String>) {
    println("Hello World!")
    var FirstName= "Rehab"
    var LastName= "Fakhry"
    var age= 21
     age= 22
    println("FirstName: $FirstName , LastName: $LastName")
    println("age= $age")
    val test = 20
     //test=30  //Error cannot change value
    // we can change var value , but we cannot change the value in val.....
    var number:Int= 200
    var num:Int= 300
    println(number * num)
    println(number::class)
    println("******************************")

    val myByte:Byte = 8
    val myShort:Short = 16
    val myInt:Int = 12
    val myLong:Long = 64
    val myFloat:Float = 32.0F
    val myDouble:Double = 64.00
    val sum= myInt.plus(8)
    println("sum = $sum")

    //// convert from data type to another
    println(myByte.toLong())
    println(myByte::class)
    println(myByte.toLong()::class)
    println(myFloat.toInt())
    println(myFloat.toInt()::class)
    println("******************************")

    var str:String = "Hello World!"
    println(str)
    println(str.uppercase())
    println(str.lowercase())

    var ch:Char = 'r'
    println(ch)
    println(ch.uppercase())
    println(ch.lowercase())
    println("\uFF00")
    println(ch.isDigit())  // false! ->>> so cannot convert it to Integer by fun. (digitToInt())
    println("******************************")

    var message1:String= """
        Hello,
        I'm Rahoba.
        How are you?
    """.trimIndent() // this fun to delete white spaces.
    println(message1)
    println("******************************")
    var message2:String= """
        Hello,
        I'm Rahoba.
        How are you?
    """.replaceIndent("- ") // this method put any sign i entered it before statements.
    println(message2)
    println("******************************")
    var message3:String= """
        >> Hello,
        >> I'm Rahoba.
        >> How are you?
    """.trimMargin(">>") // this method print any message after this symbol.
    println(message3)
    println("******************************")

    val name= "RoRo"
    val Age= 21
    println("Hello $name your Age is $Age and your name is ${name.length} letters")
    println(name.length)
    println("******************************")

    var isBlank:Boolean = false
    println(isBlank)
    println(isBlank.not()) //print the reverse value.
    isBlank = "rehab".isBlank() // check if empty or not.
    println(isBlank)
    isBlank = "".isBlank()
    println(isBlank)
    println("******************************")

    ///Arithmetic Operations.
    //Summation(Addition)..
    var n1 = 40
    var n2=20.0
    var Sum= n1+n2
    println("Summation= $Sum")
    //Subtraction..
    println("******************************")
    var n3 = 40
    var n4=20.0
    var Sub= n3-n4
    println("Subtraction= $Sub")
    println("******************************")
    //Multiplication..
    var n5 = 40
    var n6=20.0
    var mul= n5*n6
    println("Multiplication= $mul")
    println("******************************")
    //Division
    var n7 = 40
    var n8=20.0
    var div= n3/n4
    println("Division= $div")
    println("******************************")
    //Remainder..
    var n9 = 40
    var n10=20.0
    var rem= n3%n4
    println("Remainder= $rem")
    println("******************************")

    //Concatenation of Strings
    val firstName = "Rehab"
    val secondName = "Fakhry"
    val job = "Developer"
    val conc = firstName + " " + secondName + " is a " + job
    println(conc) // or using Doller sign($).
    println("******************************")

    ///Assignment Operators..
    var x=10
    x+=x
    println(x)
    var y =5
    y-= 2
    println(y)
    var z=15
    z*= z
    println(z)
    var l = 20
    l/= 5
    println(l)
    println("******************************")

    ///Prefix and postFix Increment and Decrement Operators..
    var no=10
    println(no++) // (postFix) use then change...so will print "10"
    println(++no)  // (PreFix) change then use... so will print "12" because in the above x increment by 1 so 10+1+1=12..
    /// and so on for Decrement...
    var d= 5
    println(d--) /// (postFix) after this d->>4 (use then change).
    println(--d) /// (preFix) 4-1=3.. so d->>>3 (change then use).
    println("******************************")

    ///Comparison and Equality..
    val time = 12.00
    if(time <= 12.00)
        println("you are okay.")
    else
        println("you are late")
    //println("\n")
    val date = 2.2
    if(date == 3.2)
        println("HBD Rahobaa")
    else if(date !=3.2)
        println("your BD is coming soon, Honey!")
    println("******************************")

    ///Inputs
    println("Enter your name: ")
    val Name: String? = readLine1()
    println("Your name is $Name")

    println("Enter your age: ")
    val age2:Int= readLine1()!!.toInt()
    println("Your Age is $age2")
    println("******************************")

    //Get my Age APP...
    //Input
    print("Enter your birthYear: ")
    val BirthYear:Int= readLine1()!!.toInt()  // !! (not null)
    //println("\n")
    //Processing
    //val age3:Int= 2022-BirthYear  // not general
    //for general.....
    val age3:Int= Calendar.getInstance().get(Calendar.YEAR)-BirthYear

    //Output
    println("Your Age is $age3 Years")
    println("******************************")
    // if statement
    println("Enter any Number:")
    val c:Int= readLine1()!!.toInt()
    if(c>10)
        println("c is positive")
    else if (c<0)
        println("c is negative")
    else if (c==0)
        println("c is zero")
    println("******************************")
    // When equal to switch.....
    println("Enter any Number:")
    val i:Int= readLine1()!!.toInt()
    when(i){
        0-> println("i=0")
        2-> println("i is positive")
        -10 -> println("i is negative")
        else ->
            println("No number Entered")
    }
    println("******************************")
/*
  %
  /
  *
  +
  -
 */
}

