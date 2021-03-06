// src/main/scala/progscala2/metaprogramming/func.sc
class CSuper                 { def msuper() = println("CSuper") }
class C       extends CSuper { def m()      = println("C") }
class CSub    extends C      { def msub()   = println("CSub") }

typeOf[C      => C     ] =:= typeOf[C => C]        // true
typeOf[CSuper => CSub  ] =:= typeOf[C => C]        // false
typeOf[CSub   => CSuper] =:= typeOf[C => C]        // false

typeOf[C      => C     ] <:< typeOf[C => C]        // true
typeOf[CSuper => CSub  ] <:< typeOf[C => C]        // true
typeOf[CSub   => CSuper] <:< typeOf[C => C]        // false
