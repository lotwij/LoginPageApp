package com.squishy.probeersel

class User{

    var id: Int = 0
    var name : String = ""
    var age : Int = 0
   var email: String = ""

    constructor(name:String, age:Int
                , email:String
    ){
        this.name = name
        this.age = age
        this.email = email

    }
}