class AgeExcepton  extends Throwable{

String msg;
public AgeExcepton(String msg){
this.msg=msg;
}
public String getMsg(){
return msg;
}
}