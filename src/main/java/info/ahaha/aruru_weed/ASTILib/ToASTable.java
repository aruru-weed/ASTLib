package info.ahaha.aruru_weed.ASTILib;

import info.ahaha.aruru_weed.ASTILib.exception.NotToASTableException;

public interface ToASTable {
    public AST toAST() throws NotToASTableException;
}
