
import scala.util.{Failure, Success, Try}

case class Employee(id:Int, name:String, salary:Int )
def getEmployee(id:Int):Option[Employee] = {
  if(id>0 && id==1000)
    Some(Employee(1,"abc",1000))
  else
    None
}
val result1 =getEmployee(250)
result1.map(r=>println(r.id))
val result2 =getEmployee(0)
result2.map(r2=>println(r2.name))


//# Using Try,Success,Failure

def getDataEmployee(id:Int) = {
Try{
    if(id > 0 && id==1000)
    println("ID is present")
    else
        700/0
}
}
val op1=getDataEmployee(1000)
val op2=getDataEmployee(0)
op1 match {
    case Success(output) => println("ID is present "+output )
    case Failure(e) => println("error occured " + e)
}

op2 match{
    case Success(output) => println("ID is present "+output)
    case Failure(e) => println("error occured " + e)
}
