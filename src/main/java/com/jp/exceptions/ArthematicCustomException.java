package com.jp.exceptions;

public class ArthematicCustomException  extends RuntimeException{

     ArthematicCustomException(String message, Throwable t)
     {
         super(message);
     }
}
