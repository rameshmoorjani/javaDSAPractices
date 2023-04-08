
internal class Person(val firstName:String="ramesh", val lastName:String="kumar")
{
  protected var nickName:String?=null
    set(value) {
        field=value
        println("new nick name is $value")
    }
    get() {
        println("returned value is $field")
        return  field;
    }

    fun printInfo()
    {
        val nickNameToPrint=nickName?:""
    }
}