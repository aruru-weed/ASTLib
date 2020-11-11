package info.ahaha.aruru_weed.ASTILib.exception;

import info.ahaha.aruru_weed.ASTILib.AST;

public class NotToASTableException extends Exception{
    AST ast;

    NotToASTableException(){}
    NotToASTableException(AST _ast){
        ast = _ast;
    }


    public NotToASTableException(AST _ast, String _message){
        super(_message);
        ast = _ast;
    }
}
