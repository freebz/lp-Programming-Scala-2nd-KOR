// 4.3 시퀀스에 일치시키기

val s1 = (1 +: (2 +: (3 +: (4 +: (5 +: (Nil))))))
val l = (1 :: (2 :: (3 :: (4 :: (5 :: (Nil))))))
val s2 = (("one",1) +: (("two",2) +: (("three",3) +: (Nil))))
val m = Map(s2 :_*)
