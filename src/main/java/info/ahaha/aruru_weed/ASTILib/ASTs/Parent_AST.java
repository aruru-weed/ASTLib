package info.ahaha.aruru_weed.ASTILib.ASTs;

import info.ahaha.aruru_weed.ASTILib.AST;

import java.util.ArrayList;

public class Parent_AST implements AST {
    public Parent_AST(String _Label){
        Label = _Label;
    }

    String Label = "";
    ArrayList<AST> children = new ArrayList<AST>();

    @Deprecated
    public void addChildren(AST... child) {
        for (AST c : child)
            children.add(c);
    }

    public ArrayList<AST> getChildren() {
        return children;
    }

    public String getLabel() {
        return Label;
    }
}
