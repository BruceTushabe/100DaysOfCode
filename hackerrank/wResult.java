����   = C
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  java/util/ArrayList
  	 
    out Ljava/io/PrintStream;  Enter a string: 
       java/io/PrintStream println (Ljava/lang/String;)V
  " # $ nextLine ()Ljava/lang/String; & STOP
 ( ) * + , java/lang/String equals (Ljava/lang/Object;)Z
  . / , add 1 List contents: 
  3 4 5 size ()I
  7 8 9 get (I)Ljava/lang/Object; ; Result Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable 
SourceFile Result.java ! :           <        *� �    =        	 > ?  <   �     i� Y� 	� L� Y� M� � +� !N-%� '� ,-� -W� � +� !N��� 0� 6,� 2� � ,� 6� (� ����    =   6    
          )  /  7  ?  G  S  b  h   @    �     (� 
�   A    B