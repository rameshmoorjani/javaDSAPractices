import java.util.*

/*fun main(args: Array<String>) {

    println("hello")

    *//*val reader =Scanner(System.`in`)

    var integer:Int =reader.nextInt();
    println("you have entered $integer");*//*


    var a:Int = 10;
    val b:Int =20;

    val c = a+b

    println("sum is $c")

    val dividend = 25
    val divisor = 4

    val quotient = dividend / divisor
    val remainder = dividend % divisor

    println("Quotient = $quotient")
    println("Remainder = $remainder")


    val list = ArrayList<String>()
    list.add("Z")
    list.add("A")
    list.add("B")
    list.add("X")
    list.add("Aa")

    //list.sortedWith(compareBy({}));

    print("list $list")

    var map = hashMapOf<String,String>();

    map.put("1","ranul");
    map.put("2","ramesh");

    var result = map.toList().sortedBy { (_,value) -> value }.toMap()

    println("result $result")

    val home =arrayOf(1,2,3);

    println("array is "+Arrays.toString(home));

    val num = intArrayOf(1, 2, 3, 4, 5)
    val toFind = 3
    var found = false

    val i:Int =0;

    for (i in 1..2)
    {

        for (n1 in num) {
            println("test")
            break
            if (n1 == toFind) {
                found = true
                println("before break")
                break
            }

        }

        println("outer Loop $i");
    }

    if (found)
        println("$toFind is found.")
    else
        println("$toFind is not found.")

    found =true
    when
    {
        found -> print("when found ");
        else -> println("when not found ")
    }
}*/


fun main() {

    val person = Person();
    person.firstName
    person.lastName
   // person.nickName="babloo"
   // println(person.nickName)

    /*
    //sayHello("hello","namaskar","geeta","rahul")

    val arr = arrayOf("ram","shyam","shiva");

    sayHello(itemToGreet = "hello",greeting="namaskar gi ");
    *//*arr.forEach { it1 ->
    print(it1);
    }


*//*

    val list = mutableListOf("abc");

    list.add("ramesh");

    list.forEach {
        print("$it")
    }

    arr.forEachIndexed{index, it1->
        println("$it1 is at index $index");
    };

    val map = mapOf(1 to "a",2 to "b");
    map.forEach{key,value-> println("$key->$value")}

    val list1 = listOf(1 to "a",0 to "b");

    print(list1);*/
}

fun sayHello(greeting:String, itemToGreet:String,vararg items:String
)=println("hello 1 $greeting ")

