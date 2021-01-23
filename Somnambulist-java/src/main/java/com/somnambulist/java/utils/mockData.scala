package com.somnambulist.java.utils

import java.util.Locale

object mockData {



  def main(args: Array[String]): Unit = {

    val db = ConnectUtils.initDb()

    val faker = new Faker(Locale.CHINA)
    faker.name.fullName
    for(n<-0 to 10000){
      val entity = Entity.create("student")
        .set("id", n)
        .set("name", faker.name.fullName)
        .set("sex", if (n % 2 == 1) "男" else "女")
        .set("birthday", DateUtil.format(faker.date.birthday, "yyyyMMdd HH:mm:ss"))
        .set("address", faker.address.fullAddress)
        .set("education", faker.educator.secondarySchool)
        .set("job", faker.job.position)
        .set("phone", faker.phoneNumber.cellPhone)
        .set("amount", faker.random.nextInt(1, 10000000))
        .set("creditCard", faker.finance.creditCard)
        .set("marry", if (n % 2 == 1) "已婚" else "未婚")
      db.insert(entity)
    }
  }
}
